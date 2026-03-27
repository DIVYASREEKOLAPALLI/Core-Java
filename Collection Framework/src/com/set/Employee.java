package com.set;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee e) {
		if(this.id>this.id) {
			return 1;
		}else if(this.salary<e.salary) {
			return -1;
		}
		else {
			return 0;
		}
	}

}