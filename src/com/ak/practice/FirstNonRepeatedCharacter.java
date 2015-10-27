package com.ak.practice;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		
		
			String str = "stress";
		
			char[] ch = str.toCharArray();
		
			int length = ch.length;
			//System.out.println(length);
			Map<Character, Integer> map = new HashMap<Character,Integer>();
			for(int i = 0; i<length;i++){
					char character = str.charAt(i); 
					
					if(map.containsKey(character)){
						map.put(character, map.get(character)+1);
					}
					else{
						map.put(character, 1);
					}
			
					
			
		   }
			
			for(Map.Entry<Character, Integer> m : map.entrySet()){
				//Integer ill = m.getValue();
				//Character ch1 = m.getKey();
				//if(ill == 1){

					System.out.println("Key: "+m.getKey()+" Value: "+m.getValue());

				//}

		
		
		

	}
			
	}}


