package com.He;

public class Employee  {
	
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
	public boolean equals(Object o){
		if(o==null) {
			return false;
		}
		else if (this.getClass() != o.getClass()) {
			return false;
		}else {
			Employee obj = (Employee)o;
			if(this.id == obj.id && this.name == obj.name && this.salary==obj.salary ) {
				return true;
			}else {
			return false;
		}
	}
 }
	@Override
	public int hashCode() {
		
		int hashCode = 17;
		hashCode = hashCode + id*7;
		hashCode = hashCode + name.hashCode()*7;
		hashCode = hashCode + (int)salary*7;
		return hashCode;
		
		//return id+name.hashCode()+(int)salary;
	}
	
}

