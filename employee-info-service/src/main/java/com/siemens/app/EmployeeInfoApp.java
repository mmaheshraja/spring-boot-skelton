package com.siemens.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class EmployeeInfoApp {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeInfoApp.class, args);

	}
}
