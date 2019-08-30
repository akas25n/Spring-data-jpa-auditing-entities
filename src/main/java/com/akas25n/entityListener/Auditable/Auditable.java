package com.akas25n.entityListener.Auditable;

import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
abstract class Auditable<U> {

	@CreatedBy
	U createdBy;
	
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	Date createdDate;
	
	@LastModifiedBy
	U lastModifiedBy;
	
	@LastModifiedDate
	Date lasModifiedDate;
	
	
}
