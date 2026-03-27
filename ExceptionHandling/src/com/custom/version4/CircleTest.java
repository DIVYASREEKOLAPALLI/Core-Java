package com.custom.version4;

public class CircleTest {

	public static void main(String[] args) {
		
		
		Circle sc2=new Circle(-7.8981);
		try {
			sc2.PrintArea();
		}
		catch(Radius_exception e) {
			System.out.println("negitive radius not allowed");
		}
		try {
			sc2.PrintPeriMeter();
		}
		catch(Radius_exception e) {
			System.out.println("negitive radius not allowed");
		}
			
		
		

	}

}
