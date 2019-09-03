package com.akas25n.entityListener.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.akas25n.entityListener.Entities.File;
import com.akas25n.entityListener.Repository.FileRepository;

@RestController
public class FileController {

	@Autowired
	FileRepository fileRepository;
	
	@GetMapping("/files")
	public List<File> getAllFile(){
		return fileRepository.findAll();
	}
	
	@PostMapping("/files")
	public void createFile(@RequestBody File file) {
		fileRepository.save(file);
	}
	@GetMapping("/files/{id}")
	public Optional<File> getOne(@PathVariable int id){
		return fileRepository.findById(id);
		
	}
	
	@PutMapping("/files/{id}")
	public void editFile(@PathVariable int id, @RequestBody File file) {
		fileRepository.save(file);
	}
	
	@DeleteMapping("/files/{id}")
	public void deleteOne(@PathVariable int id) {
		fileRepository.deleteById(id);
	}
	
	
}
