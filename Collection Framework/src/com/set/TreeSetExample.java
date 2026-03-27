package com.set;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		Set<String> set =  new TreeSet<String>();
		//Set<String> set =  new TreeSet<String>(Collections.reverseOrder());   //for decending order
		set.add("Sree TL");
		set.add("MAGIC MEGHANA");
		//set.add(null);
		set.add("Mounika Scary");
		set.add("Gnana gayatri");
		//set.add(null);
		
		for(String name:set) {
			System.out.println(name);
		}
		
		
		System.out.println(set.contains("Sree TL"));
		System.out.println(set.isEmpty());
		System.out.println(set.remove("Sree TL"));

	}

}
