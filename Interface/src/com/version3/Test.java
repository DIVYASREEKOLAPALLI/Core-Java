package com.version3;

public class Test {

	public static void main(String[] args) {
		
		Computer computer;
		
		
		computer  =new Laptop();
		Developer munny = new Developer(computer);
		munny.startCoding();
		
		computer  =new Desktop();
		Developer divya = new Developer(computer);
		divya.startCoding();

	}

}
