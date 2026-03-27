package com.baking.version;



public class Account {

	private String account_number;

	private String name;

	private double balance;

	

	public String getAccount_number() {

		return account_number;

	}

	public void setAccount_number(String account_number) {

		if(account_number == null) {

			System.out.println("invalid account number.....exiting");

			System.exit(0);

		}

		else {

		this.account_number = account_number;

		}

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		if(name == null) {

			System.out.println("invalid name.....exiting");

			System.exit(0);

		}

		else {

		this.name = name;

		};

	}

	public double getBalance() {

		return balance;

	}

	public void setBalance(double balance) {

		if(balance <= 0.0) {

			System.out.println("invalid balance.....exiting");

			System.exit(0);

		}

		else {

		this.balance = balance;

		}

	}

	

	public void deposit(double amount) {

		balance = balance + amount;

		System.out.println("Amount deposited successfully....");

		System.out.println("Here are the details");

		//getDetails();

	}

	public void withdraw(double amount) {

		if(balance - amount >= 1000.00 ) {

		balance = balance - amount;

		System.out.println("Amount withdrawed successfully....");

		System.out.println("Here are the details");

		//getDetails();

		}

		else {

			System.out.println("Insuffiecient Funds");

		}

	}
}