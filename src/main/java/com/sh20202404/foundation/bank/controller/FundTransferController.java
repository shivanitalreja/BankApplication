package com.sh20202404.foundation.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sh20202404.foundation.bank.entity.Account;
import com.sh20202404.foundation.bank.entity.FundTransfer;
import com.sh20202404.foundation.bank.exception.ResourceNotFoundException;
import com.sh20202404.foundation.bank.service.AccountService;
import com.sh20202404.foundation.bank.service.FundTransferService;

@CrossOrigin(origins="http://localhost:3000/")
@RestController
public class FundTransferController {

@Autowired
FundTransferService fundtransfer;
@Autowired
AccountService accountservice;

@GetMapping("/getTransactions")
public List<FundTransfer> getAllTransaction() throws ResourceNotFoundException{
	List<FundTransfer>list=fundtransfer.getTransactions();
	if(list.size()==0)
		throw new ResourceNotFoundException("No Transaction Found");
	return list;
	
}

@PostMapping("/transferMoney")
public FundTransfer TransferMoney(@RequestBody FundTransfer fund)
{
	int fromAccount=fund.getFromAccount();
	int toAccount=fund.getToAccount();
	double balance=fund.getAmount();
	Account sender=accountservice.getcustomerByAccount(fromAccount);
	Account receiver=accountservice.getcustomerByAccount(toAccount);
	double currentbalance= sender.getAccountbalance();
	if(currentbalance >= balance)
	{
		sender.setAccountbalance(currentbalance - balance);
		receiver.setAccountbalance( receiver.getAccountbalance() + balance);
		System.out.println("Success!");
		//accountservice.updateaccount()
	}else {
		throw new RuntimeException("NOt sufficient balance");
		//System.out.println("Not sufficient balance");
	}
	return fundtransfer.addTransaction(fund);
	
}
}
