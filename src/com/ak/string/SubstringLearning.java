package com.ak.string;

public class SubstringLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s = "/abc/def/ghfj.doc";
		//System.out.println(s.substring(s.lastIndexOf("/") + 1));
		
		String inptStr = "abcde";
		
		String sub = "cd";
		
		String[] parts = inptStr.split(sub);
		String before = parts[0];
		String after = parts[1];
		
		System.out.println(after);
		
	}

}
