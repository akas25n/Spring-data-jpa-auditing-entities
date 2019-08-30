package com.akas25n.entityListener.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akas25n.entityListener.Entities.File;

@Repository
public interface FileRepository extends JpaRepository<File, Integer>{

}
