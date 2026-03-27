package com.version1;

public class Continue_example {

	public static void main(String[] args) {
		for(int i =1; i<=100; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i+" ");
		}

	}

}
