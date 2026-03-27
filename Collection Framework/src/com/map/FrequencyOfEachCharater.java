package com.map;
import java.util.LinkedHashMap;

public class FrequencyOfEachCharater {

	public static void main(String[] args) {
		String message = "gayatri is a good girl";
		
		LinkedHashMap<Character, Integer> fc = new LinkedHashMap<Character, Integer>();
		
		char charaters[]= message.toCharArray();
		
		for(char ch: charaters) {
			fc.put(ch, fc.getOrDefault(ch,0)+1);
		}
		System.out.println("fc");
	}

}
