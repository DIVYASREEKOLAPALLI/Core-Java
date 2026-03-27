package com.version5;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Employee> empList =new ArrayList<Employee>();
		empList.add(new Employee(444,"keerthi","Female","Java",75000.00,"Assam"));
		empList.add(new Employee(515,"Bashi","male","Python",32000.00,"Bihar"));
		empList.add(new Employee(333,"Pandey","Female","Java",65000.00,"Hyd"));
		empList.add(new Employee(414,"Bhagyamma","male","Python",55000.00,"Assam"));
		empList.add(new Employee(666,"Gowry","Female","DSA",85000.00,"Chennai"));
		empList.add(new Employee(111,"Babbulu","male","Java",95000.00,"Hyd"));
		empList.add(new Employee(222,"Hari","male","DSA",87000.00,"Chennai"));
		empList.add(new Employee(119,"Anjum","Female","Java",73000.00,"Assam"));
		empList.add(new Employee(555,"Anand","male","Java",86000.00,"Bihar"));
		empList.add(new Employee(777,"Pallavi","male","Java",49000.00,"Assam"));
		empList.add(new Employee(888,"Akbar","male","DSA",91000.00,"Chennai"));
		
		System.out.println("Male employee from Bihar");
		empList.stream()
		  .filter(emp->emp.getGender().equals("male"))
		  .filter(emp->emp.getLocation().equals("Bihar"))
		  .forEach(emp->System.out.println(emp));
		
		System.out.println("Female employee with salary<50k");
		empList.stream()
		  .filter(emp->emp.getGender().equals("Female"))
		  .filter(emp->emp.getSalary()<=50000.00)
		  .forEach(emp->System.out.println(emp));
		

	}

}
