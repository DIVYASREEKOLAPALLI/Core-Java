package com.custom.version5;

public class Circle {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public void PrintArea()  throws Radius_exception{
		if(radius<0.0) {
			
			throw new Radius_exception("Illegal radius value");
			
		}
		else {
		double area = Math.PI* Math.pow(radius,2);
		System.out.println("Area of the circle is "+area);
		}
		}
	public void PrintPeriMeter() throws Radius_exception{
		if(radius<0.0) {
			
		throw new Radius_exception("Illegal radius value");
			
		}
		else {
		double periMeter = 2*Math.PI*radius;
		System.out.println("Perimeter of the circle is "+periMeter);
		}
	}
}