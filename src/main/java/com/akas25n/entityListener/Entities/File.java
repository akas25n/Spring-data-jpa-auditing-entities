package com.akas25n.entityListener.Entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@EntityListeners(FileEntityListener.class)
public class File {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int f_id;
	String name;
	String content;
	
	@Temporal(TemporalType.TIMESTAMP)
	Date createdDate = new Date();
	
	public File(String name, String content) {
		this.name = name;
		this.content = content;
	}
	
	
}
