package com.databseproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.databseproject.entity.BillingAddress;


@Repository
public interface BillingAddressRepo extends JpaRepository<BillingAddress, Integer> {

}
