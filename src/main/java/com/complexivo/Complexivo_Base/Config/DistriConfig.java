package com.complexivo.Complexivo_Base.Config;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Map;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "entityManagerFactoryDistributivo",
        transactionManagerRef = "transactionManagerDistributivo",
        basePackages = {"com.complexivo.Complexivo_Base.Repository.primary"}
)
public class DistriConfig {
    @Autowired
    @Qualifier("distributivoDataSource")
    private DataSource distributivoDataSource;

    @Autowired
    @Qualifier("vendorProperties")
    private Map<String, Object> vendorProperties;

    @Primary
    @Bean(name = "entityManagerFactoryDistributivo")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryPrimary(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource( distributivoDataSource)
                .properties(vendorProperties)
                .packages("com.complexivo.Complexivo_Base.Models.primary")// La ubicación de la clase de entidad
                .persistenceUnit("distributivoPersistenceUnit")
                .build();
    }

    @SuppressWarnings("null")
    @Bean(name = "entityManagerDistributivo")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryPrimary(builder).getObject().createEntityManager();
    }

    @SuppressWarnings("null")
    @Bean(name = "transactionManagerDistributivo")
    PlatformTransactionManager transactionManagerPrimary(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryPrimary(builder).getObject());
    }
}