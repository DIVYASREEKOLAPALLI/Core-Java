package com.map2;
import java.util.LinkedHashMap;
import java.util.Map;

public class GetOrDefaultExample {

	

	public static void main(String[] args) {
		String message = "Bhavana, mounica,navya, Bull bull, Manasa, Anand, Navin";
		char arr[] = message.toCharArray();
		LinkedHashMap<Character, Integer> fc = new LinkedHashMap<Character, Integer>();
		
		for(char ch:arr) {
			fc.put(ch, fc.getOrDefault(ch, 0)+1);
		}
		for(Map.Entry<Character, Integer> entry:fc.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
