package com.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
@EnableScheduling
public class SeverAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeverAdminApplication.class, args);
	}

}
