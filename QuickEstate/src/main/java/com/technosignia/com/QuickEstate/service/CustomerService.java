package com.technosignia.com.QuickEstate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technosignia.com.QuickEstate.entity.Customer;
import com.technosignia.com.QuickEstate.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	
	public Customer createCustomer(Customer cus)
	{
		return customerRepository.save(cus);
	}
	public List<Customer>findAllCustomer(){
		return customerRepository.findAll();
	}
	public Optional<Customer>findCustomerDetailsById(Long id)
	{
		return customerRepository.findById(id);
	}
	
	public String deleteCustomerDetailsById(Long id){
		customerRepository.deleteById(id);
		return "Customer Deleted Sucessfully!";
	}
	public Customer updateCustomer(Customer cust){
		return customerRepository.save(cust);
	}

}
