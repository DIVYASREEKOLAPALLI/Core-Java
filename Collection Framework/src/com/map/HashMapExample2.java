package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample2 {

	public static void main(String[] args) {
		
		Map<String, String>students = new HashMap<String,String>();
		
		students.put("16QU1A0521", "VIDYA");
		students.put("16QU1A0522", "MOUNIKA");
		students.put("16QU1A0523", "DIVYA");
		students.put("16QU1A0524", "MEGHANA");

		students.put(null, "ABC");
		students.put(null, "XYZ");
		students.put("16QU1A0521",null);
		
		System.out.println(students);
		students.replace("16QU1A0521","lightening lavanya");
		students.replace("16QU1A0521","bubbly bubbluu");
		
		System.out.println(students);
		
		
		System.out.println(students.containsKey("16QU1A05298"));
		System.out.println(students.containsValue("Doremon"));
		
		System.out.println(students.containsKey("16QU1A0521"));
		System.out.println(students.containsValue("DIVYA"));
		
	}

}
