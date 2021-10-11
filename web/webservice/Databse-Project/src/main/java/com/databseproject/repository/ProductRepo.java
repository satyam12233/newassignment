package com.databseproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.databseproject.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
