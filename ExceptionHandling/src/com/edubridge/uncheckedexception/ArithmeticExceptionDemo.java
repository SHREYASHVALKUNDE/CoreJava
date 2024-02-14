package com.edubridge.uncheckedexception;
import java.util.Scanner;
/*program to demonstrate on ArithmeticException*/
public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=15;
		System.out.println("Enter the value of y: ");

		int y=s.nextInt();

		try {
			
			System.out.println(x/y);
			/*1. when we use System.exit(0) inside
			 * a try block after an exception is
			 * thrown also inside a catch block
			 * after a printing statement then finally
			 * block is not executed*/
			//System.exit(0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Occured "+e);
			//System.exit(0);

		}
		finally {
			//System.exit(0);
			/*when we thrown an exception inside a
			 * finally block before
			 * printing the statement*/
			System.out.println(12/0);
			System.out.println("Finally block");
		}
		
		s.close();


	}

}
