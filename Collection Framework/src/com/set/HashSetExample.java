package com.set;

import java.util.Set;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> set =  new HashSet<String>();
		set.add("Sree TL");
		set.add("MAGIC MEGHANA");
		set.add(null);
		set.add("Mounika Scary");
		set.add("gnana gayatri");
		set.add(null);
		
		for(String name:set) {
			System.out.println(name);
		}
		
		System.out.println(set.contains(set));
		System.out.println(set.isEmpty());
		System.out.println(set.remove("Mounika Scary"));
		
	}

}
