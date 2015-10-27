package com.ak.practice;

import java.util.HashSet;
import java.util.Scanner;

public class CommonLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
	    String line, s1, s2;
		String[] lineVector;
		
		line = scan.nextLine();
		lineVector = line.split(",");
		
		s1 = lineVector[0];
		s2 = lineVector[1];
		
		

        HashSet<Character> h1 = new HashSet<Character>(), h2 = new HashSet<Character>();
        for(int i = 0; i < s1.length(); i++) {
            h1.add(s1.charAt(i));
        }
        for(int i = 0; i < s2.length(); i++){
            h2.add(s2.charAt(i));
        }

        StringBuffer commonSB = new StringBuffer();
        StringBuffer uniqueSB = new StringBuffer();

        for(Character i : h1){
            if(!h2.contains(i)){
               uniqueSB.append(i);
            }else{
               commonSB.append(i);
            };
         }

         for(Character i : h2){
            if(!h1.contains(i)){
               uniqueSB.append(i);
            };
         }

         System.out.println("Common:"+commonSB.toString().replace(" ", ""));
         //System.out.println("Unique:"+uniqueSB.toString().replace(" ", "")); 
	}

}
