package com.edubridge.oopsdemo;
//Driver Class
public class DriverForBankAccount {

	public static void main(String[] args) {
		
		//creating object 
		SavingAccount o=new SavingAccount();
		o.balance=9000;
		o.deposit(900);
		o.withdraw(900, 110);

	}

}
