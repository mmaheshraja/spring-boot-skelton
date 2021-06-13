package com.mahesh.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.mahesh.controllers.TopicController;

@SpringBootApplication
@ComponentScan(basePackageClasses = TopicController.class)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
