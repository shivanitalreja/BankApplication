package com.sh20202404.foundation.bank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class FundTransfer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int fromAccount;
	private int toAccount;
	private double amount;
	
	public FundTransfer(){
		
	}
	
	
	
	public FundTransfer(int id, int fromAccount, int toAccount, double amount) {
		super();
		this.id = id;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.amount = amount;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(int fromAccount) {
		this.fromAccount = fromAccount;
	}
	public int getToAccount() {
		return toAccount;
	}
	public void setToAccount(int toAccount) {
		this.toAccount = toAccount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	

}
