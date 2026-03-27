package com.version1;

public class NestedTry  {

	public static void main(String[] args) {
		String names[]= {"Akash",null,"Rocky blast",null,"Anand",null,"kumar"};
		for(String x:names) {
		try {
			System.out.println(x.toUpperCase());
			try {
				System.out.println(x.charAt(7));
			}
			
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("String Exception raised");
			}
				
			}
		
		catch(NullPointerException e) {
			System.out.println("Null raised");
		}
		}
	}
}
	
			
		
	
