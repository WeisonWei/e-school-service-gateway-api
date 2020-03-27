package com.es.gateway.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ESchoolServiceGatewayApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ESchoolServiceGatewayApiApplication.class, args);
    }

}
