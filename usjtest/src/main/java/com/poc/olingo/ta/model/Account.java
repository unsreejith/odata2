package com.poc.olingo.ta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {

	@Id
	//@GeneratedValue
	@Column(name = "account_number", nullable = false)
	private int accountNumber;
	
	@Column(name = "account_name", nullable = true)
	private String accountName;
	

	@Column(name = "account_revenue", nullable = true)
	private int accountRevenue;
	
	@Column(name = "account_id", nullable = true)
	private String accountId;
	
	
	
	@Column(name = "active", nullable = false)
	private boolean active;
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public int getAccountRevenue() {
		return accountRevenue;
	}
	public void setAccountRevenue(int accountRevenue) {
		this.accountRevenue = accountRevenue;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}
