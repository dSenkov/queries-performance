package com.itrex.queriesperformance.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("mongo")
public class MongoConfiguration {

    @Bean
    public MongoClient mongoClient() {
        return MongoClients.create();
    }
}
