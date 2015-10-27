package com.ak.practice;

public class PhoneNumberProblem {
	
	public static void permutations(char[][] symbols, int n,  String s) {
        if (n == symbols.length) {
            System.out.println(s);
            return;
        }
        for (int i = 0; i < symbols[n].length; i ++) {
            permutations(symbols, n+1, s + symbols[n][i]);
        }
    }


	public static void main(String[] args) {
		
       char[][] letters = { {'0'},
    		                {'1'},
    		                {'A','B','C'},
    		                { 'D','E','F'},
    		                {'G','H','I'},
    		                {'J','K','L'},
    		                {'M','N','O'},
    		                {'P','Q','R','S'},
    		                {'T','U','V'},
    		                {'W','X','Y','Z'}
    		                };
       
       //System.out.println("Array Position Value "+letters[2][1]);
       
       System.out.println("Letters Array Length "+letters.length);
       
       String n = "4663";
       
       char[][] sel = new char[n.length()][];
       
       for(int i= 0; i< n.length(); i++){
    	   
    	   int digit = Integer.parseInt(""+n.charAt(i));
    	   sel[i] = letters[digit];
       }
       permutations(sel, 0, "");
	}

}
