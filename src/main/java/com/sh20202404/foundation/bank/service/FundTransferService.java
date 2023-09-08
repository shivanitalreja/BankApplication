package com.sh20202404.foundation.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sh20202404.foundation.bank.entity.FundTransfer;
import com.sh20202404.foundation.bank.repository.FundTransferRepository;

@Service
public class FundTransferService {
	
@Autowired
FundTransferRepository fundtransferrepo;
AccountService accountservice;



public List<FundTransfer> getTransactions(){
	return fundtransferrepo.findAll();
}
public FundTransfer addTransaction(FundTransfer f) {
	return fundtransferrepo.save(f);
}

}
