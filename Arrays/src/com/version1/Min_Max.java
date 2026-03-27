package com.version1;

public class Min_Max {

	public static void main(String[] args) {
		int arr[] = {10, 75, -85, 96,-77, 36};
		int max = arr[0];
		int min = arr[0];
		for (int i=0; i<arr.length;i++) {
			if(arr[i]> max) {
				max=arr[i];
			}
			if(arr[i]< min) {
				min = arr[i];
			}
		}
		System.out.println("max " +max);
		System.out.println("min " +min);
		
		

	}

}
