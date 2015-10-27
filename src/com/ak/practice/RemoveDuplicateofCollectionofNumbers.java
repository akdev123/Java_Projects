package com.ak.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Refer this question  http://www.careercup.com/question?id=5747603499122688
public class RemoveDuplicateofCollectionofNumbers {
	
	
	public static int removeDup(ArrayList<Integer> input) throws NullPointerException{
		
		
		if(input==null){
			
			throw new NullPointerException();
		}
		
		if(input.isEmpty()){
			
			return 0;
		}
		
		HashMap<Integer, Boolean> map = new HashMap<Integer,Boolean>();
		
		int size = map.size();
		
		for(Integer x : input){
			
			if(!map.containsKey(x))
			{
				map.put(x, true);
			}
			else{
				input.remove(x);
				size--;
			}
			
			
		}
		
		return size;
		
		
		
		
	}

	public static void main(String[] args) {
		
       ArrayList<Integer> list = new ArrayList<Integer>();
       
       list.add(1);
       list.add(1);
       list.add(5);
       list.add(3);
       list.add(8);
       list.add(3);
       list.add(7);
       list.add(32);
       list.add(32);
       
       for(Integer l : list){
    	   
    	   System.out.println(removeDup(list));
       }
       
       System.out.println();
       

	}

}
