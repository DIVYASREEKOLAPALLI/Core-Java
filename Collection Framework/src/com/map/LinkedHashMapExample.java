package com.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		Map<String, String>students = new LinkedHashMap<String,String>();
		
		students.put("16QU1A0521", "VIDYA");
		students.put("16QU1A0522", "MOUNIKA");
		students.put("16QU1A0523", "DIVYA");
		students.put("16QU1A0523", "MEGHANA");

		students.put(null, "ABC");
		students.put(null, "XYZ");
		students.put("16QU1A0521",null);
		students.put("16QU1A052",null);
		
		System.out.println(students);
		
		students.replace("16QU1A0521","lightening lavanya");
		students.replace("16QU1A0521","bubbly bubbluu");
		
		System.out.println(students);
		
		System.out.println(students.keySet());
		
		System.out.println(students.values());
		
		System.out.println(students.get("16QU1A0522"));
		
		System.out.println(students);
		
		System.out.println(students.size());
	}
		
	}


