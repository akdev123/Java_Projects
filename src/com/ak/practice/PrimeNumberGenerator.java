package com.ak.practice;

import java.util.Arrays;

public class PrimeNumberGenerator {

	
	public static boolean[] sieveOfEratosthenes(final int max) {
	    if (max < 0) {
	        throw new IllegalArgumentException("max cannot be less than zero: " + max);
	    }
	    final boolean[] primeCandidates = new boolean[max]; // defaults to false
	    for (int i = 2; i < max; i++) {
	        primeCandidates[i] = true;
	    }

	    final double maxRoot = Math.sqrt(max);
	    for (int candidate = 2; candidate < maxRoot; candidate++) {
	        if (primeCandidates[candidate]) {
	            for (int j = 2 * candidate; j < max; j += candidate) {
	                primeCandidates[j] = false;
	            }
	        }

	    }
	    return primeCandidates;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(sieveOfEratosthenes(100)));

	}

}
