package com.example.openapi.openapiclient;

import io.swagger.client.api.PetApi;
import io.swagger.client.model.Pet;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.boot.context.event.ApplicationReadyEvent;


@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class OpenapiClientApplication {

    @Autowired
    private PetApi api;

    public static void main(String[] args) {
        SpringApplication.run(OpenapiClientApplication.class, args);
    }

    private List<Pet> findAvailablePets() {
        return api.findPetsByStatus(Arrays.asList("available"));
    }

    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {
        System.out.println("hello world, I have just started up");
        System.out.println("pets: " + findAvailablePets());
    }
}
