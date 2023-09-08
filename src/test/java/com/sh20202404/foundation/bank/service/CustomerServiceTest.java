package com.sh20202404.foundation.bank.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;


import com.sh20202404.foundation.bank.entity.Account;
import com.sh20202404.foundation.bank.entity.Customer;
import com.sh20202404.foundation.bank.repository.CustomerRepository;


@SpringBootTest
class CustomerServiceTest {

	@InjectMocks
	CustomerService service;
	
	@Mock
	CustomerRepository repo;
	
	@SuppressWarnings("deprecation")
	@org.junit.Before    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }
	
	
  @Test
   void contextLoads()
   {
	   
   }
	

	@Test
	public void getAllCustomersTest()
	{
		
		List<Customer> list=new ArrayList<Customer>();
		List<Account> l1=new ArrayList<Account>();
	    Account a1=new Account();
	    a1.setId(1111);
	    a1.setName("hdfc");
	    a1.setIfsc_code("1213");
	    a1.setType("saving");
	    a1.setAccountbalance(12000);
	    l1.add(a1);
	    Customer one=new Customer(1,"shivani","7653578","mp",l1);
		list.add(one);
		System.out.println(list.size());
		System.out.println(repo);
		when(repo.findAll()).thenReturn(list);
		List<Customer>customerlist=service.getAllCustomers();
		assertEquals(1,customerlist.size());
		
		
		
	}
	
	
	@Test
    public void deletetest()
    {
	
       service.delete(1);
       verify(repo, times(1)).deleteById(1);
      }
  
   
	
	@Test
	public void getcustomerByIdTest() {
		
		List<Account> l1=new ArrayList<Account>();
	    Account a1=new Account();
	    a1.setId(1111);
	    a1.setName("hdfc");
	    a1.setIfsc_code("1213");
	    a1.setType("saving");
	    a1.setAccountbalance(12000);
	    l1.add(a1);
		when(repo.findById(1)).thenReturn(new Customer(1,"shivani","7653578","mp",l1));
		Customer customer=service.getcustomerById(1);
		assertEquals(1,customer.getId());
		assertEquals("shivani",customer.getName());
		
	}
	
 /* @Test
    public void updateCustomerTest()
    {
        List<Account> l1=new ArrayList<Account>();
	    Account a1=new Account();
	    a1.setId(1111);
	    a1.setName("hdfc");
	    a1.setIfsc_code("1213");
	    a1.setType("saving");
	    a1.setAccountbalance(12000);
	    l1.add(a1);
        Customer request = new Customer(1,"shivani","7653578","mp",l1);
   
        
        service.update(request);
         
   
        verify(repo, times(1)).save(request);
    }
	
	*/ 
	
	

}
