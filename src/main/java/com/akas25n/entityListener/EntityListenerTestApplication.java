package com.akas25n.entityListener;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.akas25n.entityListener.Entities.File;
import com.akas25n.entityListener.Repository.FileRepository;

@SpringBootApplication
@EnableJpaRepositories
@EnableJpaAuditing
public class EntityListenerTestApplication implements CommandLineRunner{

	@Resource
	FileRepository fileRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(EntityListenerTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		File file1 = new File("Spring", "Boot");
		fileRepository.saveAndFlush(file1);
		
		File file2 = new File("Data","Base");
		fileRepository.saveAndFlush(file2);
		
		File file3 = new File("Data","Base");
		fileRepository.saveAndFlush(file3);
		
		file1.setName("Hibernate");
		fileRepository.saveAndFlush(file1);
		
		file2.setContent("Model");
		fileRepository.saveAndFlush(file2);
		
		file2.setName("Entity");
		fileRepository.saveAndFlush(file2);
		
		file3.setContent("Model");
		fileRepository.saveAndFlush(file3);
		
		file3.setName("Entity");
		fileRepository.saveAndFlush(file3);
	}

}
