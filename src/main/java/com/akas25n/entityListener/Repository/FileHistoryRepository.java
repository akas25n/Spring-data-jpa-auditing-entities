package com.akas25n.entityListener.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akas25n.entityListener.Entities.FileHistory;

@Repository
public interface FileHistoryRepository extends JpaRepository<FileHistory, Integer>{

}
