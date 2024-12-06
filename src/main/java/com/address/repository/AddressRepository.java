package com.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.address.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
	
	public Address findByEmployeeId(Integer id);

}
