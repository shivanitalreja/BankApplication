package com.sh20202404.foundation.bank.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sh20202404.foundation.bank.dto.BankRequest;
import com.sh20202404.foundation.bank.entity.Account;
import com.sh20202404.foundation.bank.entity.Customer;
import com.sh20202404.foundation.bank.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	 
	public Customer update(BankRequest request)
	{
		return customerRepository.save(request.getCustomer());
	}
	
	public List<Customer> getAllCustomers()
	{
		List<Customer> customer=new ArrayList<Customer>();
		customerRepository.findAll().forEach(customer1->customer.add(customer1));
		return customer;
	}
	
	public Customer getcustomerById(int id)
	{
		return customerRepository.findById(id);
	}
	
	public void delete(int id)
	{
		customerRepository.deleteById(id);
		
	}  

	
	

	
		
	
	}
	
	

