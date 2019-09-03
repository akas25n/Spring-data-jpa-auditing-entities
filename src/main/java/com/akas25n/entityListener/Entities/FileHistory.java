package com.akas25n.entityListener.Entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.akas25n.entityListener.Enum.Action;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level=AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EntityListeners(AuditingEntityListener.class)
public class FileHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	
	@ManyToOne
	@JoinColumn(name="file_id", referencedColumnName = "f_id")
	File file;
	
	String fileContent;
	
	String fileName;
	
	@CreatedBy
	String modifiedBy;
	
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	Date modifiedDate;
	
	@Enumerated
	Action action;

	public FileHistory(File file, Action action) {
		this.file = file;
		this.fileContent = file.getContent();
		this.fileName = file.getName();
		this.action = action;
	}
}
