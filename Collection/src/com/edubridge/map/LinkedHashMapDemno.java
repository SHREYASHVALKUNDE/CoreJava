package com.edubridge.map;
import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapDemno {

	public static void main(String[] args) {
		Map<Integer,Object>obj=new LinkedHashMap<>();
		obj.put(1,"Shreyash");
		obj.put(5,"Atul");
		obj.put(1,"Shrey");
		obj.put(7,null);
		System.out.println(obj);
		//to extract the elements of map
		for(Map.Entry<Integer,Object> itr:
			obj.entrySet())
		{
			System.out.println(itr.getKey()+" "
		+itr.getValue());
		}

	}

}
