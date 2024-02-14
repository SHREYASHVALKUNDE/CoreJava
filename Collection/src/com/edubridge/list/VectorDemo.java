package com.edubridge.list;
import java.util.List;
import java.util.Vector;
public class VectorDemo {

	public static void main(String[] args) {
		List<Object>obj=new Vector<>();
		obj.add(12);
		obj.add("Shiwani");
		obj.add(76000.60);
		obj.add('Z');
		obj.add(true);
		System.out.println(obj);

	}

}
