package com.headless.ecommerce.configuration;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoConfiguration {
    @Value("mongodbConnectionString")
    private String mongoDbConnectionString;
    public @Bean MongoClient mongoClient() {
        return MongoClients.create(mongoDbConnectionString);
    }
}