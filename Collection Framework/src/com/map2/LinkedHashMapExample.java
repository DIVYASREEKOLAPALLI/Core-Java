package com.map2;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<String, String>students = new LinkedHashMap<String,String>();
		students.put("20QU1A1251","Bhavana");
		students.put("20QU1A1981","Divya");
		students.put("20QU1A1287","Balu");
		students.put("20QU1A1265","Bhahu");
		students.put("20QU1A1232","Ballala");
		
		students.put(null,"Bhavana");
		students.put("20QU1A1251",null);
		students.put(null,"Bhavanai");
		
		
		System.out.println(students);

		
		
		System.out.println(students.replace("20QU1A1251", "Bhavana"));
				
		students.remove("20QU1A1232");
				
		System.out.println(students.size());
		System.out.println(students.isEmpty());
	}

}
