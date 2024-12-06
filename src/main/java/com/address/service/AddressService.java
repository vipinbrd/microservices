package com.address.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.address.entity.Address;
import com.address.repository.AddressRepository;

@Service
public class AddressService {
	@Autowired
	private AddressRepository addressRepository;
	
	
	public Address saveAddress(Address adr) {
		return addressRepository.save(adr);
	}
	public Address findAddressByEmployeeId(Integer empid) {
		
		return addressRepository.findByEmployeeId(empid);
	}
	

}
