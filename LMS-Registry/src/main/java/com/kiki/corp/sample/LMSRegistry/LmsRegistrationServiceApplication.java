package com.kiki.corp.sample.LMSRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LmsRegistrationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LmsRegistrationServiceApplication.class, args);
	}
}
