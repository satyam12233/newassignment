package com.databseproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.databseproject.entity.SalesOrder;

@Repository
public interface SalesOrderRepo  extends JpaRepository<SalesOrder, Integer>{

}
