package com.sh20202404.foundation.bank.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;


import com.sh20202404.foundation.bank.entity.FundTransfer;
import com.sh20202404.foundation.bank.repository.FundTransferRepository;

@SpringBootTest
class FundTransferServiceTest {
	
	@InjectMocks
	FundTransferService service;
	
	@Mock
	FundTransferRepository repo;
	

	@Test
	public void getTransactionTest()
	{
		List<FundTransfer> list=new ArrayList<>();
		FundTransfer fundone=new FundTransfer(1,111,222,2000);
		FundTransfer fundtwo=new FundTransfer(2,333,444,5000);
		list.add(fundone);
		list.add(fundtwo);
		when(repo.findAll()).thenReturn(list);
		List<FundTransfer> fundTransferList=service.getTransactions();
		assertEquals(2,fundTransferList.size());
		
	}


	@Test
	public void addTransactionTest()
	{
		FundTransfer fund=new FundTransfer(1,111,222,2000);
		service.addTransaction(fund);
		verify(repo,times(1)).save(fund);
	}
}
