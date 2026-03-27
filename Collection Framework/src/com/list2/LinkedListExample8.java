package com.list2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample8 {

	public static void main(String[] args) {
		String arr[] = {"kumar","Sree","ramu","rocky"};
		List<String> list = Arrays.asList(arr);
		
		for(String x:list) {
			System.out.println(x+"   ");
		}

	}

}
