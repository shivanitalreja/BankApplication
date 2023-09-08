package com.sh20202404.foundation.bank;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.sh20202404.foundation.bank.controller.BankController;
import com.sh20202404.foundation.bank.entity.Account;
import com.sh20202404.foundation.bank.entity.Customer;
import com.sh20202404.foundation.bank.repository.CustomerRepository;
import com.sh20202404.foundation.bank.service.CustomerService;

@RunWith(SpringRunner.class)
@SpringBootTest
class Sh20202404BankApplicationTests {

	@Autowired
	private CustomerService service;
	
	@Autowired
	private BankController bank;
	
	@MockBean
	private CustomerRepository repository;
	
	public void getAllAccountsTest() {
	//	when(repository.findAll()).thenReturn(Stream.of(new Customer(1,"shivani",212343,"gwl",new Account(1,gdf ))))
	}
	

}
