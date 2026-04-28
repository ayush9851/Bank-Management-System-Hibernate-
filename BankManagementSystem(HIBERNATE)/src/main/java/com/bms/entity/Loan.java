package com.bms.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "loan")
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loanId;

	private String loanType;

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	private double amount;

	// Many loans belong to one branch
	@ManyToOne
	@JoinColumn(name = "branch_id")
	private Branch branch;

	// Many-to-Many with Customer
	@ManyToMany(mappedBy = "loans")
	private List<Customer> customers;

	public Loan() {
	}

	// Getters & Setters
}