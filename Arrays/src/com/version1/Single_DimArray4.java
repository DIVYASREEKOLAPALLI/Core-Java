package com.version1;

public class Single_DimArray4 {

	public static void main(String[] args) {
		int marks[]= new int[]{95, 49, 32, 54, 74};
		
	
		
		for(int index=0 ; index<marks.length; index++) {
			System.out.print(marks[index]+" ");
			
		}
		System.out.println(" ");
		
		for (int index=marks.length-1; index>=0; index--) {
			System.out.print(marks[index]+" ");
		}
		
	

	}

}
