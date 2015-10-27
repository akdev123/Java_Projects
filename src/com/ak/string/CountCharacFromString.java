package com.ak.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class CountCharacFromString {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          String str = "aabcdeefg";
		
		// To find number of characters in the String
		Map<Character, Integer> numChars = new HashMap<Character,Integer>();
		
		   for (int i = 0 ; i < str.length(); i++){
			
			   char c = str.charAt(i);
			
			   if(!numChars.containsKey(c)){
				
				   numChars.put(c, 1);
			   }
			   else{
				
				numChars.put(c, numChars.get(c)+1);
				
			   }
			   
			   for(Map.Entry<Character, Integer> entry : numChars.entrySet()){
				   
				   System.out.println("Key = "+entry.getKey()+" Value = "+entry.getValue());
			   }
			   
			   /*Iterator it = numChars.entrySet().iterator();
			    while (it.hasNext()) {
			        Map.Entry pair = (Map.Entry)it.next();
			        System.out.println(pair.getKey() + " = " + pair.getValue());
			        it.remove(); // avoids a ConcurrentModificationException
			    }*/
			   
			   /*Set<Character> charInString = numChars.keySet();
			   
			   
			   for ( char ch : charInString){
				
				   if(numChars.get(ch) > 1){
					   
					   System.out.println("Printing"+ch);
				   
			   }
			   }*/
			   
			   

	}}}


