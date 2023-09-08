package com.sh20202404.foundation.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sh20202404.foundation.bank.dto.BankRequest;
import com.sh20202404.foundation.bank.entity.Customer;
import com.sh20202404.foundation.bank.exception.ResourceNotFoundException;
import com.sh20202404.foundation.bank.repository.AccountRepository;
import com.sh20202404.foundation.bank.repository.CustomerRepository;
import com.sh20202404.foundation.bank.service.CustomerService;

@CrossOrigin(origins="http://localhost:3001/")
@RestController
public class BankController {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	CustomerService customerservice;

	
	@PostMapping("/createAccount")
	public Customer CreatingAccount(@RequestBody BankRequest request)
	{
		
		return customerRepository.save(request.getCustomer());
	}
	
	
	
	
	@GetMapping("/getcustomers")
	public List<Customer> getAllAccounts() throws ResourceNotFoundException
	{
			List<Customer> list= customerservice.getAllCustomers();
			if(list.size()==0)
				throw new ResourceNotFoundException("Customer Not Found");
			return list;
	}
	

     @PutMapping("/updatecustomers")
	 public Customer update(@RequestBody BankRequest request)
	 {
		return customerservice.update(request);
		
	 }
	
     @GetMapping("/customerById/{id}")
     public Customer searchCustomer(@PathVariable("id") int id)
     {
		return customerservice.getcustomerById(id);
    	 
     }
    
     
	@DeleteMapping("/deleteById/{id}")
	public void deleteCustomerDetails(@PathVariable("id") int id){
		customerservice.delete(id);
		
	}
}
