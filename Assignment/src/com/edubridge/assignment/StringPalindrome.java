package com.edubridge.assignment;

import java.util.Scanner;

// Program to check whether the entered string is palindrome or not
public class StringPalindrome {

	public static void main(String[] args) {
		// Creating Scanner object to take the input from the user
		Scanner s = new Scanner(System.in);
		
		// Prompt user to enter a string
		System.out.println("Enter a string: ");
		String inputString = s.next();

		// check whether the string is palindrome or not
		if(isPalindrome(inputString))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

	// Function to check whether the entered string is palindrome or not
	private static boolean isPalindrome(String str) {
		
		// convert the string into character array
		char[] charArray = str.toCharArray();
		
		// check for palindrome by comparing from both the end
		int start = 0, end = charArray.length-1;
		
		while(start <end) {
			if(charArray[start] != charArray[end])
				return false;						// if the string is not palindrome it will return false
		
			start++;
			end--;
		}
		
		return true;	// if the loop completes without returning false, the string is palindrome
	}

}
