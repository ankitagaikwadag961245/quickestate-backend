package com.technosignia.com.QuickEstate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.technosignia.com.QuickEstate.entity.Address;
import com.technosignia.com.QuickEstate.service.AddressService;

@RestController
public class AddressController {
	@Autowired
	AddressService addressService;
	
	@PostMapping("/address")
	public Address createAddress(@RequestBody Address address) {
		return addressService.createAddress(address);
	}

}
