package com.databseproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.databseproject.entity.Customer;


@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
