package com.sh20202404.foundation.bank.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.sh20202404.foundation.bank.entity.Account;
import com.sh20202404.foundation.bank.repository.AccountRepository;

@SpringBootTest
class AccountServiceTest {

   @InjectMocks
   AccountService service;
   
   @Mock
   AccountRepository repo;
	
	
	
	@Test
	public void getcustomerByAccountTest()
	{
		when(repo.findByid(1)).thenReturn(new Account(111,"hdfc","saving","hdfc111",20000));
		Account acc=service.getcustomerByAccount(1);
		assertEquals("hdfc",acc.getName());
		assertEquals("saving",acc.getType());

	}
	
	@Test
	public void updateaccountTest()
	{
		Account acc=new Account(111,"hdfc","saving","hdfc111",45000);
		service.updateaccount(acc);
		verify(repo, times(1)).save(acc);
	}  
	
	

	
	
}