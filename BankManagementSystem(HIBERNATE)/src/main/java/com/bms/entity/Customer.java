package com.bms.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int custId;

	private String name;
	private String address;
	private String phone;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "customer_account", joinColumns = @JoinColumn(name = "cust_id"), inverseJoinColumns = @JoinColumn(name = "account_no"))
	private List<Account> accounts;

	public Customer() {
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "customer_loan", joinColumns = @JoinColumn(name = "cust_id"), inverseJoinColumns = @JoinColumn(name = "loan_id"))
	private List<Loan> loans;

	public List<Loan> getLoans() {
		return loans;
	}

	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}

}