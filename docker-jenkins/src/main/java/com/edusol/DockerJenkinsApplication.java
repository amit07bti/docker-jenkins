package com.edusol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsApplication {

	public static void main(String[] args) {

		System.out.println("hello");
		System.out.println("main");

		SpringApplication.run(DockerJenkinsApplication.class, args);
	}

}
