package com.ruey.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TheDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheDiscoveryServerApplication.class, args);
	}

}
