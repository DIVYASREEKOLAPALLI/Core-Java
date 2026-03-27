package com.set;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		
		Set<String> set =  new TreeSet<String>(Collections.reverseOrder());
		set.add("Sree TL");
		set.add("MAGIC MEGHANA");
		//set.add(null);
		set.add("Mounika Scary");
		set.add("gnana gayatri");
		//set.add(null);
		
		for(String name:set) {
			System.out.println(name);
		}

	}

}
