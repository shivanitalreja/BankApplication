package com.sh20202404.foundation.bank.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String Contactno;
	private String address;
	@OneToMany(targetEntity=Account.class,cascade=CascadeType.ALL)
	@JoinColumn(name="cp_fk",referencedColumnName="id")
	List<Account>accounts;
	
	public Customer() {
		
	}
	
	public Customer(int id, String name, String contactno, String address, List<Account> accounts) {
		super();
		this.id = id;
		this.name = name;
		Contactno = contactno;
		this.address = address;
		this.accounts = accounts;
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
	public String getContactno() {
		return Contactno;
	}
	public void setContactno(String contactno) {
		Contactno = contactno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Account> getAccounts(){
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts=accounts;
	}
	
	

}
