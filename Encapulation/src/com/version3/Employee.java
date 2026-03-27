package com.version3;

public class Employee {
	private int id;
	private String name;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id<0) {
			System.out.println("Invalid id");
			System.exit(0);
		}
		else {
			this.id = id;
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name== null || name.equals("")){
			System.out.println("invalid name");
			System.exit(0);
			
		}
		else {
			this.name = name;
		}
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary<0.0) {
			System.out.println("Invalid salary");
			System.exit(0);
		}
		else {
			this.salary = salary;
		}
		
	}
	
	
	
}
