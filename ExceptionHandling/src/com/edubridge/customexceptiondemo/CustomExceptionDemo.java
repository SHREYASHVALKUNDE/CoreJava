package com.edubridge.customexceptiondemo;
import java.util.Scanner;
//driver class
public class CustomExceptionDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String email_id=s.nextLine();
		String password=s.nextLine();
		try {
		if(email_id.equals("trainer21@edubridge.com")
				&& password.equals("abc@123"))
			System.out.println("Logged in "
					+ "successfully");
		else
			throw new LoginCredentials("Invalid "
					+ "credentials");
		}
		
		catch(LoginCredentials e)
		{
			System.out.println(e);
		}
			

	}

}
