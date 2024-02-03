package com.technosignia.com.QuickEstate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technosignia.com.QuickEstate.entity.Address;
import com.technosignia.com.QuickEstate.repository.AddressRepository;

@Service
public class AddressService {
	@Autowired
	AddressRepository addressRepository;
	
	public Address createAddress(Address address)
	{
		return addressRepository .save(address);
	}
}
