package com.ak.practice;

public class Factorial {

	
	public static int fact(int n){
		
		
		//int i = 1;
		int fact = 1 ; 
		
		for (int i = 1 ; i <=n ; i++){
			
			fact = fact * i;
			
			
		}
		
		return fact;
		
		
	}
	
	
	public static void main(String[] args) {
		

		System.out.println("Factorial " +fact(4));
		
		

	}

}
