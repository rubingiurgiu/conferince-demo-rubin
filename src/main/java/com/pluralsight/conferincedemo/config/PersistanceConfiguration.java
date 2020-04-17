package com.pluralsight.conferincedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

@Configuration
public class PersistanceConfiguration {
//    @Bean
//    public DataSource dataSource() {
//        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.url("jdbc:postgresql://localhost:5432/conference_app");
//        dataSourceBuilder.username("postgres");
//        dataSourceBuilder.password("superuser");
//        System.out.println("My custom datasource bean has been initialized and set");
//        return dataSourceBuilder.build();
//    }
}
