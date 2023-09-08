package com.sh20202404.foundation.bank.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Account {
	@Id
	private int id;
	private String name;
	private String type;
	private String ifsc_code;
	private double accountbalance;
	
	public Account() {
		
	}
	
	public Account(int id, String name, String type, String ifsc_code, double accountbalance) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.ifsc_code = ifsc_code;
		this.accountbalance = accountbalance;
	}
	public double getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(double accountbalance) {
		this.accountbalance = accountbalance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	
	

}
