package com.edubridge.selectionstatements;
import java.util.Scanner;
//program to demonstrate on if...else statement
public class IfElseStatement {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		
		if(a!=b)
			System.out.println("a is not equal to b");
		else
			System.out.println("a is equal to b");
	}

}
