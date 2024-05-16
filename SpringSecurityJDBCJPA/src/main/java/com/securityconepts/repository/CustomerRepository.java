package com.securityconepts.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.securityconepts.model.Customer;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer> {

    List<Customer> findByEmail(String email);
    
}
