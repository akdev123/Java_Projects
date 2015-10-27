package com.ak.string;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;



public class SubstringTest {

// Recursive Approach
	/*
public static String removeDups(String s){
	
	if ( s.length() <= 1 ) return s;
    if( s.substring(1).contains(s.substring(0,1)) ) return removeDups(s.substring(1));
    
    else return s.substring(0,1) + removeDups(s.substring(1));
}*/




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "AAAABBARRRCC";
		
		//System.out.println(removeDups(str));
		
		// Non Recursive Approach
		char[] c = str.toCharArray();
		
		Set<Character> ch = new LinkedHashSet<Character>();
		
		for(char x : c){
			
			ch.add(x);
		}
		
		
		
		
		
		StringBuilder sb = new StringBuilder();
		
		for(Character character : ch){
			
			sb.append(character);
		}
		
		System.out.println(sb.toString());
		/*Iterator<Character> it = ch.iterator();
		
		while(it.hasNext()){
			
			System.out.println(it);
		}*/
		
		

	}

}
