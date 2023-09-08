package com.sh20202404.foundation.bank.dto;

import org.springframework.beans.factory.annotation.Autowired;

import com.sh20202404.foundation.bank.entity.Customer;
import com.sh20202404.foundation.bank.repository.CustomerRepository;


public class BankRequest {
	
	@Autowired
	private Customer customer;
	
	

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
    

}
