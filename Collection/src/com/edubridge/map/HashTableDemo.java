package com.edubridge.map;

import java.util.Hashtable;
import java.util.Map;
public class HashTableDemo {

	public static void main(String[] args) {
		/*HashMap keys are arrange in ascending order-
		 * wise and Hashtable keys are arrange in
		 * descending order wise*/
		Map<Integer,Object>obj=new Hashtable<>();
		obj.put(3,"Shreyash");
		obj.put(2,"Atul");
		obj.put(5,"Shrey");
		/*we can't use key and value as'null'
		 * else we will get an null pointer exception*/
		//obj.put(7,null);
		System.out.println(obj);
	}

}
