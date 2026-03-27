package com.He;

import java.util.HashSet;
import java.util.Comparator;
public class SetWithEmployee {

	public static void main(String[] args) {
		Employee obj1 = new Employee(12,"divya",65000.00);
		Employee obj2 = new Employee(13,"sree",85000.00);
		Employee obj3 = new Employee(11,"kamma",89000.00);
		Employee obj4 = new Employee(15,"amma",55000.00);
		Employee obj5 = new Employee(12,"divya",65000.00);
		Employee obj6= new Employee(13,"sree",85000.00);
		Employee obj7 = new Employee(11,"kamma",89000.00);
		Employee obj8 = new Employee(15,"amma",55000.00);
		
		
		
		HashSet<Employee> set = new HashSet<Employee>();
		
		
		set.add(obj1);
		set.add(obj2);
		set.add(obj3);
		set.add(obj4);
		set.add(obj5);
		set.add(obj6);
		set.add(obj7);
		set.add(obj8);
		
		//System.out.println(obj1.equals(obj5));
		
		for(Employee obj : set) {
			System.out.println(obj);
		}
		}

	}


