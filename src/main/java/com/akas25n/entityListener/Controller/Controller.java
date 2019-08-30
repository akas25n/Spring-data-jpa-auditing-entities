package com.akas25n.entityListener.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akas25n.entityListener.Entities.File;
import com.akas25n.entityListener.Service.FileService;

@RestController
public class Controller {
	
	private FileService fileService;
	
	//test
	@GetMapping("/test")
	public String test() {
		return "Test okk";
	}
	//finding all files
	@GetMapping("/files")
	public List<File> findAll(){
		List<File> file = fileService.showAllFiles();
		 return file;
	}
	
	
	
	//finding all file history

}
