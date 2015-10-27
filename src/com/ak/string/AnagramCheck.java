package com.ak.string;

import java.util.Arrays;

public class AnagramCheck {
	
	
	public static boolean isAnagram(String s1 , String s2){
		
		
		char[] word1 = s1.toLowerCase().replaceAll("\\s","").toCharArray();
		char[] word2 = s2.toLowerCase().replaceAll("\\s","").toCharArray();
		
		Arrays.sort(word1);
		Arrays.sort(word2);
		
		if(Arrays.equals(word1, word2) )
			return true;
		else 
			return false;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isAnagram("He  llo","HE LLO"));
		
	}

}
