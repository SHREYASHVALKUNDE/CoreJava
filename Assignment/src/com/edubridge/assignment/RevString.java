package com.edubridge.assignment;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str=s.next();
		for(int i=str.length()-1;i>=0;i--) 
		{
			System.out.print(str.charAt(i));
		}
		
		
		s.close();

	}

}
