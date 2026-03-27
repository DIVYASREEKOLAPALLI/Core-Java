package com.version2;

public class Circle {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public void PrintArea() {
		double area = Math.PI* Math.pow(radius,2);
		System.out.println("Area of the circle is "+area);
		}
	public void PrintPeriMeter() {
		double periMeter = 2*Math.PI*radius;
		System.out.println("Perimeter of the circle is "+periMeter);
	}
}