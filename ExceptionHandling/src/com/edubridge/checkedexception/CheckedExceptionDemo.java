package com.edubridge.checkedexception;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//program to demonstrate on checked exception
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\IT-Admin"
				+ "\\Downloads\\Hello.txt");
		try {
			FileInputStream f1=new FileInputStream(f);
			System.out.println("File is exist");
		} catch (FileNotFoundException e) {
			System.out.println("File is not exists"
					+ " "+e);
		}
		

	}

}
