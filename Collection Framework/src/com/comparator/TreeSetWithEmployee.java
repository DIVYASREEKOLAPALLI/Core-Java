package com.comparator;

import java.util.TreeSet;

public class TreeSetWithEmployee {

	public static void main(String[] args) {
		Employee obj1 = new Employee(12,"divya",65000.00);
		Employee obj2 = new Employee(13,"sree",85000.00);
		Employee obj3 = new Employee(11,"kamma",89000.00);
		Employee obj4 = new Employee(15,"amma",55000.00);
		
		TreeSet<Employee> set = new TreeSet<Employee>(new IdComparator());
		
		
		set.add(obj1);
		set.add(obj2);
		set.add(obj3);
		set.add(obj4);
		
		
		}

	}


