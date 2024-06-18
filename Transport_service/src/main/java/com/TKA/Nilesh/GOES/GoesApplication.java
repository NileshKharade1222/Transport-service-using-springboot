package com.TKA.Nilesh.GOES;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com")
public class GoesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoesApplication.class, args);
		
		System.out.println("hellooo spring");
	}

}
