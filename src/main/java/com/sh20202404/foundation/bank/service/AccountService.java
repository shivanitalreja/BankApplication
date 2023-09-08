package com.sh20202404.foundation.bank.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sh20202404.foundation.bank.entity.Account;
import com.sh20202404.foundation.bank.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	AccountRepository accountrepository;

	public Account getcustomerByAccount(int account) {
		return accountrepository.findByid(account);
		
		
	}

	public Account updateaccount(Account acc) {
		return accountrepository.save(acc);
		
		
	}
	
	public Account getAccById(int id) {
		return accountrepository.findById(id).get();
	}


		
	}
	


