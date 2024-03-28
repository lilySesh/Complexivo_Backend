package com.complexivo.backend_distributivo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.Map;

@Configuration
public class DataSourceConfig {
    @Autowired
    private JpaProperties jpaProperties;
    @Autowired
    private HibernateProperties hibernateProperties;

    //Configuracion base de datos distributivo
    @Bean(name = { "distributivoDataSource" })
    @Primary
    @ConfigurationProperties("spring.datasource.distributivo")
    public DataSource firstDataSource() {
        return (DataSource) DataSourceBuilder.create().build();
    }

    //Configuracion base de datos fenix
    @Bean(name = { "fenixDataSource" })
    @ConfigurationProperties("spring.datasource.fenix")
    public DataSource secondDataSource() {
        return (DataSource) DataSourceBuilder.create().build();
    }

    @Bean(name = { "vendorProperties" })
    public Map<String, Object> getVendorProperties() {
        return hibernateProperties.determineHibernateProperties(
                jpaProperties.getProperties(),new HibernateSettings());
    }
}