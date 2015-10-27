package com.ak.string;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "My name is Adarsh";
		
		char[] ch = str.toCharArray();
		
		/*Simple Approach
		 * 
		 * String rev = "";
		
		for(int i = str.length()-1;i >=0; i--){
			
			rev = rev + ch[i];
			
			
		}
		
		System.out.println(rev);*/
		
		// Approach using Stack
		
		Stack<Character> stk = new Stack<>();
		
		String reversed = "";
		
		for(int j = 0 ; j < str.length() ; j++){
			
			char ch1 = str.charAt(j);
			stk.push(ch1);
			
			
		}
		
		for(int i = 0 ; i < str.length(); i++){
			
			char ch1 = stk.pop();
			reversed = reversed + ch1;
		}
		
		
		System.out.println("Reverse of given String is: "+reversed);
	}

}
