package com.akas25n.entityListener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableJpaAuditing
public class EntityListenerTestApplication{


	
	public static void main(String[] args) {
		SpringApplication.run(EntityListenerTestApplication.class, args);
	}


}
