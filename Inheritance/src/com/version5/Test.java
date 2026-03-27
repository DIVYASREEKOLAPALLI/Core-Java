package com.version5;

public class Test {

	public static void main(String[] args) {
		
		//Employee obj = (Employee)new Manager(111, "Anand", 85000.00);
		Employee obj = new Manager(111, "Anand", 85000.00);  //upcasting
		
		((Manager)obj).setDop("14/052024");
		
		System.out.println(((Manager)obj).getDop());
		
		System.out.println(obj.bonus());

	}

}
