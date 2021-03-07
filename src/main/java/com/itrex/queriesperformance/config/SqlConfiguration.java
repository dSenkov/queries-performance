package com.itrex.queriesperformance.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
@Profile("postgres")
public class SqlConfiguration {

    @Bean
    public DataSource postgresDataSource() {
        return DataSourceBuilder.create().build();
    }
}
