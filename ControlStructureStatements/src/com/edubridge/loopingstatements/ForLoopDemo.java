package com.edubridge.loopingstatements;
import java.util.Scanner;
/*program to demonstrate on to print 1 to N numbers*/
public class ForLoopDemo {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int i=1;i<=N;i++)
		{
			System.out.print(i+" ");
		}
		
	}

}
