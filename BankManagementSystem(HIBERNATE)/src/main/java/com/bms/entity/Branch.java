package com.bms.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "branch")
public class Branch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int branchId;

	private String name;
	private String address;

	// Many branches belong to one bank
	@ManyToOne
	@JoinColumn(name = "bank_id")
	private Bank bank;

	// Default constructor
	public Branch() {
	}

	// Getters and Setters
	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
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

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	@OneToMany(mappedBy = "branch", cascade = CascadeType.ALL)
	private List<Loan> loans;
}