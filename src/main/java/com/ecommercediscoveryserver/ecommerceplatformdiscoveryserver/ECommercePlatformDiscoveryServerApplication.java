package com.ecommercediscoveryserver.ecommerceplatformdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ECommercePlatformDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommercePlatformDiscoveryServerApplication.class, args);
	}

}
