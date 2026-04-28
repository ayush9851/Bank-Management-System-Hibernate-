package com.bms.main;

import java.util.Scanner;

import com.bms.dao.BMSService;

public class MainApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BMSService service = new BMSService();

		while (true) {

			System.out.println("\n=====WELCOME TO BANK MANAGEMENT SYSTEM  =====");
			System.out.println("1. Add Bank");
			System.out.println("2. View Banks");
			System.out.println("3. Add Customer");
			System.out.println("4. View Customers");
			System.out.println("5. Delete Customer");
			System.out.println("6. Add Account");
			System.out.println("7. View Accounts");
			System.out.println("8. Delete Account");
			System.out.println("9. Add Loan");
			System.out.println("10. View Loans");
			System.out.println("11. Delete Loan");
			System.out.println("12. Exit");

			int ch = sc.nextInt();
			sc.nextLine();

			switch (ch) {

			case 1:
				service.addBank();
				break;
			case 2:
				service.viewBanks();
				break;
			case 3:
				service.addCustomer();
				break;
			case 4:
				service.viewCustomers();
				break;
			case 5:
				service.deleteCustomer();
				break;
			case 6:
				service.addAccount();
				break;
			case 7:
				service.viewAccounts();
				break;
			case 8:
				service.deleteAccount();
				break;
			case 9:
				service.addLoan();
				break;
			case 10:
				service.viewLoans();
				break;
			case 11:
				service.deleteLoan();
				break;
			case 12:
				System.exit(0);

			default:
				System.out.println("Invalid choice");
			}
		}
	}
}