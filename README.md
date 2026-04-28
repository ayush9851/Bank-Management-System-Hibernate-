# 🏦 Bank Management System (Hibernate - Console Based)

## 📌 Project Description
The Bank Management System is a console-based Java application developed using Hibernate ORM. It simulates core banking operations such as managing customers, accounts, branches, and loans.

The project demonstrates object-relational mapping (ORM), database connectivity, and CRUD operations using Hibernate with a structured layered architecture.

---

## 🚀 Features

### 👤 Customer Management
- Add new customers
- View customer details
- Update customer information
- Delete customers

### 💳 Account Management
- Create bank accounts
- View account details
- Deposit money
- Withdraw money
- Check account balance

### 🏦 Branch Management
- Add and manage bank branches
- Link customers/accounts to branches

### 📄 Loan Management
- Apply for loans
- View loan details
- Manage loan records

---

## 🛠️ Technologies Used
- Java
- Hibernate ORM (JPA)
- JDBC
- MySQL / PostgreSQL
- Maven

---

## 🏗️ Project Structure

### 📂 Entities Layer (`entities`)
- Bank
- Account
- Branch
- Customer
- Loan

### 📂 DAO Layer (`dao`)
- Service class for handling database operations using Hibernate

### 📂 Main Layer (`main`)
- Main application class
- Provides menu-driven console interface

### 📂 Utility Layer (`util`)
- JPAUtil class for:
  - Creating EntityManager / Session
  - Managing database connection

---

## 🎯 Purpose of Project
- Understand Hibernate ORM and JPA concepts
- Perform CRUD operations using Hibernate
- Learn entity relationships and mappings
- Implement layered architecture in Java
- Simulate real-world banking operations

---

## ⚙️ How to Run the Project

1. Clone the repository
2. Open the project in IDE (Eclipse / IntelliJ)
3. Configure database in `persistence.xml` or Hibernate config file
4. Run the main class from `main` package
5. Use console menu to perform operations

---

## 📌 Sample Workflow

1. Create a bank or branch
2. Add a customer
3. Create an account for the customer
4. Perform deposit or withdrawal
5. Apply for a loan
6. View and manage records

---

## ⭐ Key Highlights
- Console-based menu-driven application
- Uses Hibernate ORM for database interaction
- Structured layered architecture (Entity, DAO, Util, Main)
- Implements real-world banking system logic
- Demonstrates JPA utility handling
