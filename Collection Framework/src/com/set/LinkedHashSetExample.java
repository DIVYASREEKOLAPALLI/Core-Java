package com.set;

import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		Set<String> set =  new LinkedHashSet<String>();
		set.add("Sree TL");
		set.add("MAGIC MEGHANA");
		set.add(null);
		set.add("Mounika Scary");
		set.add("gnana gayatri");
		set.add(null);
		
		for(String name:set) {
			System.out.println(name);
		}
		
		
		System.out.println(set.contains("david"));
		System.out.println(set.isEmpty());
		System.out.println(set.remove("Mounika Scary"));

	}

}
