
package com.databseproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.databseproject.entity.ShippingAddress;


@Repository
public interface ShippingAddressRepo extends JpaRepository<ShippingAddress, Integer>{

}
