package com.ak.string;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		
		
		String str = "teeter";
		
		Map<Character, Integer> numChars = new HashMap<Character,Integer>();
		
		   for (int i = 0 ; i < str.length(); i++){
			
			   			char c = str.charAt(i);
			
			   			if(!numChars.containsKey(c)){
				
			   				numChars.put(c, 1);
			   			}
			   			else{
				
			   				//numChars.put(c, numChars.get(c)+1);
			   				numChars.remove(c);
				
			   			}
		   }
			   
			   for(Map.Entry<Character, Integer> entry : numChars.entrySet()){
				   
				   System.out.println("Key = "+entry.getKey()+" Value = "+entry.getValue());
			   }
			   
		
		

	}

	}
