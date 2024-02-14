package com.edubridge.selectionstatements;
import java.util.Scanner;
/*program to demonstrate on Bunjee jumping using nested if*/
public class NestedIfDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age and weight of a person: ");
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>=12)
		{
			if((weight>=45 && weight<=110) || weight>=110)
			{
				System.out.println("eligible for bunjee jumping. if weight>110..extra ropes will be added");
			}
			else
			{
				System.out.println("Not eligible for bunjee jumping");

			}
			
		}
		else {
			System.out.println("Not eligible for bunjee jumping");
		}
	}

}
