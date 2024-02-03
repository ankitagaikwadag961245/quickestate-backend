package com.technosignia.com.QuickEstate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technosignia.com.QuickEstate.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
