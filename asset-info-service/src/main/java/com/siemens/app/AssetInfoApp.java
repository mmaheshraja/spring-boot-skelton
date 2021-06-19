package com.siemens.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class AssetInfoApp {

	public static void main(String[] args) {
		SpringApplication.run(AssetInfoApp.class, args);

	}
}
