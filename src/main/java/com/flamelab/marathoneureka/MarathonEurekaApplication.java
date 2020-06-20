package com.flamelab.marathoneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MarathonEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarathonEurekaApplication.class, args);
	}

}
