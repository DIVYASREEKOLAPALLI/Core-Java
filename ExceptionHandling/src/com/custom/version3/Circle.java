package com.custom.version3;

public class Circle {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public void PrintArea() {
		if(radius<0.0) {
			try {
				throw new Radius_exception("Illegal value");
			}
			catch(Radius_exception  e){
				System.out.println("negaative Radius not allowed....");
				
			}
			
		}
		else {
		double area = Math.PI* Math.pow(radius,2);
		System.out.println("Area of the circle is "+area);
		}
		}
	public void PrintPeriMeter() {
		if(radius<0.0) {
			try {
				throw new Radius_exception("Illegal value");
			}
			catch(Radius_exception  e){
				System.out.println("negaative Radius not allowed....");
				
			}
			
		}
		else {
		double periMeter = 2*Math.PI*radius;
		System.out.println("Perimeter of the circle is "+periMeter);
		}
	}
}