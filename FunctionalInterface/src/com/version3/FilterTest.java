package com.version3;

public class FilterTest {

	public static void main(String[] args) {
		int arr[]= {-11,44,85,96,36,55,76,-22,-54,-87,129,756,114};
		ArrayFilter.doFilter(arr, (element)->{return element<0;});
		ArrayFilter.doFilter(arr, (element)->{return element>=0;});
		ArrayFilter.doFilter(arr, (element)->{return element%11==0;});
		ArrayFilter.doFilter(arr, (element)->{return element%11==0 && element>=0;});
		ArrayFilter.doFilter(arr, (element)->{return element%27==0;});
		ArrayFilter.doFilter(arr, (element)->{return element%92==0;});

		
	}

}
