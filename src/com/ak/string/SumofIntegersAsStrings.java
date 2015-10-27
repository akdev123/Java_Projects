package com.ak.string;

public class SumofIntegersAsStrings {

	public static void main(String[] args) {
		
		String s1 = "123";
		
		String s2 = "456";
		
		int x = Integer.parseInt(s1);
		int y = Integer.parseInt(s2);
		
		String sum = Integer.toString(x+y);
		
		System.out.println(sum);

	}

}
