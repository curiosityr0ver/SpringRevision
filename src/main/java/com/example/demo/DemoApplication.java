package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		Alien alien = context.getBean(Alien.class);
		alien.code();
//		alien.age = 15;
		System.out.println(alien.age);
	}





}
