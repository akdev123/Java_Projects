package com.ak.string;

public class ReverseSentence {

	public static void main(String[] args) {
		
		String str = "My Name is Adarsh";
		
		StringBuilder sb = new StringBuilder();
		String[] words = str.split("");
		
		for(int i = words.length-1 ; i >= 0 ; i-- ){
			
			sb.append(words[i]);
		}
		//sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
	}
	

}
