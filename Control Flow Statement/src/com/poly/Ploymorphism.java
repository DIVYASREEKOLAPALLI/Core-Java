package com.poly;

public class Ploymorphism {
	public void show() {
		System.out.println("0 parameters");
	}
	
	public void show(int a) {
		System.out.println("1 int parameters");
	}
	
	public void show(float a) {
		System.out.println("1 float parameters");
	}
	
	public void show(int a, String b) {
		System.out.println("2 int, string parameters");
	}
	
	public void show(String a, int b) {
		System.out.println("2 string,int parameters");
	}
	
}
