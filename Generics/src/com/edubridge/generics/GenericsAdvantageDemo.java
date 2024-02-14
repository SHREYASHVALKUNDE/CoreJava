package com.edubridge.generics;
import java.util.ArrayList;
import java.util.List;
/*program to demonstrate on Generic Advantage*/
public class GenericsAdvantageDemo {

	public static void main(String[] args) {
		//1.Type-safety
		List<String> obj=new ArrayList<>();
		//it ensures that to add only String values
		//3. Compile-time checking
		//obj.add(11);
		obj.add("11");
		obj.add("Shiwani");
		
		//2.with Generic, Type-casting is not required
		//List obj1=new ArrayList<>();
		List<String> obj1=new ArrayList<>();
		obj1.add("Shiwani Kumbhalkar");
		obj1.add("Shifa");
		/*without generic, type-casting is required*/
		//String str1=(String) obj1.get(0);
		String str1=obj1.get(1);//Shifa
		System.out.println(str1);
	}

}
