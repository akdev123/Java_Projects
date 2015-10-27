package com.ak.practice;

public class LargestSumArray {
	
	
	public static int findMaxSum(int[] array) {

		int currentSum = 0;
		int larGestSum = 0;

		for (int i = 0; i < array.length; i++) {

			currentSum = currentSum + array[i];

			if (currentSum > larGestSum) {

				larGestSum = currentSum;

			} else if (currentSum < 0) {

				currentSum = 0;
			}

		}

		return larGestSum;

	}

	
	// Another Approach 
	
	
	public static int sumAnotherWay(int[] array){
		
		int sum = array[0]; int maxSum = array[0];
		
		for(int i = 0 ; i < array.length; i++){
			
			sum = Max(sum + array[i], maxSum);
			
			maxSum = Max(sum,maxSum);
			
			
		}
		
		return maxSum;
		
	}
	
	
	public static int Max(int a , int b){
		
		return a > b ? a : b;
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		
		
		System.out.println("Largest Sum is as follows: "+findMaxSum(a));
		
		

	}

}
