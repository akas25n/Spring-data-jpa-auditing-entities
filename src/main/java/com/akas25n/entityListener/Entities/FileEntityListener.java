package com.akas25n.entityListener.Entities;

import javax.persistence.EntityManager;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.akas25n.entityListener.Enum.Action;
import com.akas25n.entityListener.Service.BeanUtil;



public class FileEntityListener {


	   
	@PrePersist
    public void prePersist(File target) {
        perform(target, Action.INSERTED);
    }

    @PreUpdate
    public void preUpdate(File target) {
        perform(target, Action.UPDATED);
    }

    @PreRemove
    public void preRemove(File target) {
        perform(target, Action.DELETED);
    }
    
	   @Transactional(value = TxType.MANDATORY)
	    private void perform(File target, Action action) {
	        EntityManager entityManager = BeanUtil.getBean(EntityManager.class);
	        entityManager.persist(new FileHistory(target, action));
	    }
 
}
