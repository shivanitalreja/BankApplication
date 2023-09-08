package com.sh20202404.foundation.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sh20202404.foundation.bank.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer,Integer>{

	Customer findById(int id);

}
