package com.edubridge.oopsdemo;
//Program on Inheritance 
//parent class
public class BankAccount {
	//declaring var
	int balance;
	int amount;
	int money;
	//method deposit
	protected void deposit(int amount) {
		this.amount=amount;
		System.out.println("Amount deposit is"+amount);
	}
	
	//method withdraw
	void withdraw (int money,int balance) {
		this.balance=balance;
		this.money=money;
		if(balance>100) {
		System.out.println("withdraw money"+money);
		}else {
			System.out.println("Your bal is low");
		}
	}
}
