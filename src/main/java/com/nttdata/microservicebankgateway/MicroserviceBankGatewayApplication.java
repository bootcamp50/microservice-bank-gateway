package com.nttdata.microservicebankgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviceBankGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBankGatewayApplication.class, args);
	}

}
