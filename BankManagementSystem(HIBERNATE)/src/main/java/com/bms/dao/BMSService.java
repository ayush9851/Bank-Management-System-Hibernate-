package com.bms.dao;

import javax.persistence.*;
import java.util.List;
import java.util.Scanner;

import com.bms.entity.*;

public class BMSService {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("bms");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	Scanner sc = new Scanner(System.in);

	// ---------------- ADD BANK ----------------
	public void addBank() {

		System.out.print("Enter Bank Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Code: ");
		String code = sc.nextLine();

		System.out.print("Enter Address: ");
		String address = sc.nextLine();

		Bank bank = new Bank();
		bank.setName(name);
		bank.setCode(code);
		bank.setAddress(address);

		et.begin();
		em.persist(bank);
		et.commit();

		System.out.println("✅ Bank Saved");
	}

	// ---------------- VIEW BANK ----------------
	public void viewBanks() {

		List<Bank> list = em.createQuery("from Bank", Bank.class).getResultList();

		for (Bank b : list) {
			System.out.println(b.getId() + " " + b.getName() + " " + b.getCode());
		}
	}

	public void addCustomer() {

		System.out.print("Enter Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Address: ");
		String address = sc.nextLine();

		System.out.print("Enter Phone: ");
		String phone = sc.nextLine();

		Customer c = new Customer();
		c.setName(name);
		c.setAddress(address);
		c.setPhone(phone);

		et.begin();
		em.persist(c);
		et.commit();

		System.out.println("✅ Customer Added");
	}

	public void viewCustomers() {

		List<Customer> list = em.createQuery("from Customer", Customer.class).getResultList();

		for (Customer c : list) {
			System.out.println(c.getCustId() + " " + c.getName() + " " + c.getPhone());
		}
	}

	public void deleteCustomer() {

		System.out.print("Enter Customer ID: ");
		int id = sc.nextInt();

		Customer c = em.find(Customer.class, id);

		if (c != null) {
			et.begin();
			em.remove(c);
			et.commit();
			System.out.println("✅ Deleted");
		} else {
			System.out.println("❌ Not Found");
		}
	}

	public void addAccount() {

		System.out.print("Enter Type: ");
		String type = sc.nextLine();

		System.out.print("Enter Balance: ");
		double bal = sc.nextDouble();
		sc.nextLine();

		Account a = new Account();
		a.setAccType(type);
		a.setBalance(bal);

		et.begin();
		em.persist(a);
		et.commit();

		System.out.println("✅ Account Added");

	}

	public void viewAccounts() {

		List<Account> list = em.createQuery("from Account", Account.class).getResultList();

		for (Account a : list) {
			System.out.println(a.getAccountNo() + " " + a.getAccType() + " " + a.getBalance());
		}
	}

	public void deleteAccount() {

		System.out.print("Enter Account ID: ");
		int id = sc.nextInt();

		Account a = em.find(Account.class, id);

		if (a != null) {
			et.begin();
			em.remove(a);
			et.commit();
			System.out.println("✅ Deleted");
		} else {
			System.out.println("❌ Not Found");
		}
	}

	public void addLoan() {

		System.out.print("Enter Loan Type: ");
		String type = sc.nextLine();

		System.out.print("Enter Amount: ");
		double amt = sc.nextDouble();
		sc.nextLine();

		Loan l = new Loan();
		l.setLoanType(type);
		l.setAmount(amt);

		et.begin();
		em.persist(l);
		et.commit();

		System.out.println("✅ Loan Added");
	}

	public void viewLoans() {

		List<Loan> list = em.createQuery("from Loan", Loan.class).getResultList();

		for (Loan l : list) {
			System.out.println(l.getLoanId() + " " + l.getLoanType() + " " + l.getAmount());
		}
	}

	public void deleteLoan() {

		System.out.print("Enter Loan ID: ");
		int id = sc.nextInt();

		Loan l = em.find(Loan.class, id);

		if (l != null) {
			et.begin();
			em.remove(l);
			et.commit();
			System.out.println("✅ Deleted");
		} else {
			System.out.println("❌ Not Found");
		}
	}
}