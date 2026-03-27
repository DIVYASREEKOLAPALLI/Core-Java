package com.custom.version5;

public class CircleTest {

	public static void main(String[] args) {
		
		
		Circle sc2=new Circle(-7.8981);
		try {
			sc2.PrintArea();
		}
		catch(Radius_exception e) {
			//System.out.println(e);
			System.out.println(e.getMessage());
		}
		try {
			sc2.PrintPeriMeter();
		}
		catch(Radius_exception e) {
			//System.out.println(e);
			System.out.println(e.getMessage());
		}
			
		
		

	}

}
