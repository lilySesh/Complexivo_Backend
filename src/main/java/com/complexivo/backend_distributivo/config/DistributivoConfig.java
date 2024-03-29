package com.complexivo.backend_distributivo.config;

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

import jakarta.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "entityManagerFactoryTalento",
        transactionManagerRef = "transactionManagerTalento",
        basePackages = {"com.complexivo.backend_distributivo.repository.primary"}
)

public class DistributivoConfig {
    @Autowired
    @Qualifier("distributivoDataSource")
    private DataSource talentoDataSource;

    @Autowired
    @Qualifier("vendorProperties")
    private Map<String, Object> vendorProperties;

    @Primary
    @Bean(name = "entityManagerFactoryTalento")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryPrimary(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(talentoDataSource)
                .properties(vendorProperties)
                .packages("com.ista.talento_humano.model.primary")// La ubicación de la clase de entidad
                .persistenceUnit("talentoPersistenceUnit")
                .build();
    }

    @SuppressWarnings("null")
    @Bean(name = "entityManagerTalento")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryPrimary(builder).getObject().createEntityManager();
    }

    @SuppressWarnings("null")
    @Bean(name = "transactionManagerTalento")
    PlatformTransactionManager transactionManagerPrimary(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryPrimary(builder).getObject());
    }
}