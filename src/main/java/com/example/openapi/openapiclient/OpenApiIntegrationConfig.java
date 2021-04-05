package com.example.openapi.openapiclient;

import io.swagger.client.ApiClient;
import io.swagger.client.api.PetApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class OpenApiIntegrationConfig {

    @Bean
    public PetApi api() {
        return new PetApi(apiClient());
    }
    
    @Bean
    public ApiClient apiClient() {
        return new ApiClient();
    }
}
