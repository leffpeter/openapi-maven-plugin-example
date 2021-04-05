package com.example.openapi.openapiclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.openapitools.client.ApiClient;
import org.openapitools.client.api.PetApi;

@Configuration
public class PetStoreIntegrationConfig {

    @Bean
    public PetApi petApi() {
        return new PetApi(apiClient());
    }
    
    @Bean
    public ApiClient apiClient() {
        return new ApiClient();
    }
}
