package com.ak.string;

public class ArrayIndexforPartOfString {

	public static void main(String[] args) {
		
		
		String[] full = { "a1a", "b2b", "c3c" };
		String doT = "b";
		
		for(int i = 0 ; i < full.length ; i++){
			
			if(full[i].contains(doT)){
				
				System.out.println("Index of part of String is: "+i);
			}
			
		}
		
		

	}

}
