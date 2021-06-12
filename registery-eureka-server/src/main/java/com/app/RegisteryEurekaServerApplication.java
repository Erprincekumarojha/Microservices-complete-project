package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegisteryEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisteryEurekaServerApplication.class, args);
	}

}
