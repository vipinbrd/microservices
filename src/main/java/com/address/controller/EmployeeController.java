package com.address.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.address.entity.Address;
import com.address.service.AddressService;

@RestController
public class EmployeeController {
	@Autowired
	private AddressService addressService;
	@PostMapping("/address")
	public ResponseEntity<Address> saveAddress(@RequestBody Address address){
		
		 Address adr=addressService.saveAddress(address);
		 return new ResponseEntity<>(adr,HttpStatus.ACCEPTED);
	}
	@GetMapping("/address/{empid}")
	public ResponseEntity<Address>findAdressByEmpId(@PathVariable("empid")Integer id){
		Address adr=addressService.findAddressByEmployeeId(id);
		return new ResponseEntity<Address>(adr,HttpStatus.OK);
	}

	
}
