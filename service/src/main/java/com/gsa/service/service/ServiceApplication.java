package com.gsa.service.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceApplication implements CommandLineRunner {

	@Value("${server.port}")
	private String serverPort;

	@Value("${myname}")
	private String filename;

	@Value("${filename}")
	private String myName;

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(serverPort);
		System.out.println(filename);
		System.out.println(myName);
	}
}
