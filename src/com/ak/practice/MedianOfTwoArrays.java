package com.ak.practice;

// MERGED SORT USED HERE
public class MedianOfTwoArrays {
	
	public static void main(String[] args){
	// Given two sorted arrays of same size
		int[] a1 = {1,2,3,4,5,6};
		int[] a2 = {7,8,9,10,11,12};
		int[] mergedArray = new int[a1.length + a2.length];
		for(int i=0 ; i < a1.length; i++){
						mergedArray[i] = a1[i];
			}
	
	//System.out.println("Length:"+2*(a1.length));
		for(int i= a1.length ; i < 2*(a1.length); i++){
		   mergedArray[i] = a2[i-a1.length];
		}
	
		for(int i=0 ; i < 2*(a1.length); i++){
			System.out.println("Part of Array: "+mergedArray[i]+ " Length is: "+mergedArray.length);
		}
	
	}
}
