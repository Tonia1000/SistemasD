package com.example.namingserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureke.serve.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
public class NamingServer2Application {

	public static void main(String[] args) {
		SpringApplication.run(NamingServer2Application.class, args);
	}

}
