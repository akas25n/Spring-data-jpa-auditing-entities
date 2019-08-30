package com.akas25n.entityListener.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.akas25n.entityListener.Entities.File;
import com.akas25n.entityListener.Repository.FileRepository;

@Service
public class FileService {

	FileRepository fileRepository;
	
	public List<File> showAllFiles(){
		return fileRepository.findAll();
	}
}
