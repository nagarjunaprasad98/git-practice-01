package com.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitFromEclipseApplication {

	public static void main(String[] args) {
		System.out.println("Before running..");
		System.out.println("running..");
		SpringApplication.run(GitFromEclipseApplication.class, args);
 		System.out.println("App running..");
	}

}
