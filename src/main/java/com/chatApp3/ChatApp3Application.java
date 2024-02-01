package com.chatApp3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.chatApp3.*")
public class ChatApp3Application {

	public static void main(String[] args) {
		SpringApplication.run(ChatApp3Application.class, args);
	}

}
