package com.ak.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequencyFromArray {

	public static void main(String[] args) {
		
		
		int[] a = {1,1,2,2,2,2,3,3,3,3,3,3,3,3,4,4,4,4,4,4};
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0 ; i < a.length ; i++){
			
			if(map.containsKey(a[i])){
				
				map.put(a[i], map.get(a[i])+1);
			}
			else{
				
				map.put(a[i], 1);
			}
			
			
		}// End For
		
		//System.out.println(Collections.max(map.values()));
		
		// Converting Map into array
		
		/*
		for(Map.Entry<Integer, Integer> mp : map.entrySet()){
			
			System.out.println("Keys are:" +mp.getKey()+ "Values are: "+mp.getValue());
		}
		*/
		
		Integer[] keys = new Integer[map.size()];
		Integer[] values = new Integer[map.size()];
		int index = 0;
		
       for(Map.Entry<Integer, Integer> mp : map.entrySet()){
    	   
    	   keys[index] = mp.getKey();
    	   values[index] = mp.getValue();
    	   index++;
			
			
		}
		
       
       // Print array test 
       
       for (int i = 0 ; i < keys.length; i++){
    	   
    	   System.out.println("Keys"+keys[i]);
       }
       
       Arrays.sort(values);
      for (int i = 0 ; i < values.length; i++){
    	   
    	   System.out.println("Values:"+values[i]);
       }

      //System.out.println();
      
	}

}
