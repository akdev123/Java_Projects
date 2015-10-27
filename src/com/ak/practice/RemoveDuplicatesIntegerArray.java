package com.ak.practice;

// Nice and easy solution, found it from here https://www.youtube.com/watch?v=POtRgIX8WhY
public class RemoveDuplicatesIntegerArray {

	// Given a sorted array in Ascending order, remove the duplicates and return the array without using extra memory
	
	public static int[] removeDuplicates(int[] input) {

		int len = input.length;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {

				if (input[i] == input[j]) {

					input[i] = -1;

				}

			} // for j

		} // for i

		for (int i = 0; i < len; i++) {
			if (input[i] != -1) {

				System.out.print(input[i] + ",");
			}

		}
		
		
		
		
		return input;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int[] input = new int[]{1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
		
		int[] input = new int[]{ 9, 9, 9, 10,1, 1, 3, 7, 7, 8};
		
		removeDuplicates(input );
		
	}

}
