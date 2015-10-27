package com.ak.string;

import java.util.Arrays;
import java.util.Stack;

public class ReverseOrderOfWords {

	
	
	
	
	
	public static void main(String[] args) {
		
		
		String str[] = "My favourite language is JAVA".split(" ");
	    String finalStr="";
	        for(int i = str.length-1; i>= 0 ;i--){
	            finalStr += str[i]+" ";
	        }
	        System.out.println("Order Reversed String is: "+finalStr);
	    }

	/*	 String str = "My name is Adarsh !";
		 
		 int len = str.length();
		 
		 String rev = "";
		 
		 for(int i = len-1 ; i >= 0 ; i--){
			 
			 char c = str.charAt(i);
			 
			//stack.push(s[i]);
			 rev += c;
		 }
         
		 System.out.println(rev);
		 // Reverse the words now
		 
		 String[] words = rev.split("");
		 
         for(int i = words.length-1 ; i >= 0 ; i--){
			 
        	 System.out.println(words[i]);
			 
		 }*/
		 
		 
	}


