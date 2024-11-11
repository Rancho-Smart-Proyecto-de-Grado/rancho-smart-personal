package com.rancho_smart.personal_composer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PersonalComposerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalComposerApplication.class, args);
	}

}
