package com.map;

import java.util.TreeMap;
import java.util.Collections;
import java.util.Map;

public class TreeMapExample {

	public static void main(String[] args) {
		
		//Map<String, String>students = new TreeMap<String,String>();
		Map<String, String>students = new TreeMap<String,String>(Collections.reverseOrder());
		
		students.put("16QU1A0521", "VIDYA");
		students.put("16QU1A0522", "MOUNIKA");
		students.put("16QU1A0523", "DIVYA");
		students.put("16QU1A0524", "MEGHANA");

		//students.put(null, "ABC");
		//students.put(null, "XYZ");
		students.put("16QU1A05100",null);
		students.put("16QU1A0521",null);
		
		System.out.println(students);
	}

}
