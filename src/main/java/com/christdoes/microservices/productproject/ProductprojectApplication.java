package com.christdoes.microservices.productproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductprojectApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProductprojectApplication.class, args);
	}
}
