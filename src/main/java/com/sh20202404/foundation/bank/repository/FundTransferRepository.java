package com.sh20202404.foundation.bank.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sh20202404.foundation.bank.entity.FundTransfer;


public interface FundTransferRepository extends JpaRepository<FundTransfer,Integer>{

}
