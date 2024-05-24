package com.securityconepts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.securityconepts.model.Contact;


@Repository
public interface ContactRepository extends CrudRepository<Contact, String> {
	
	
}
