package com.gslab.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.gslab.springboot.controller"})
public class HelloWorldSpringBootApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(HelloWorldSpringBootApplication.class, args);
	}

}
