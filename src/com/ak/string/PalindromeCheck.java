package com.ak.string;

public class PalindromeCheck {
	
	
	public static boolean checkPalindrome(char[] a){
		
		int l1 = 0;
		int l2 = a.length-1;
		
		while(l2 > l1){
			
			if(a[l1] != a[l2]){
				
				return false;
			}
			else{
				
				l1++;
				l2--;
				
			}
			
			
		}
		return true;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "aba";
		
		char[] ch = str.toCharArray();
		
		System.out.println("Palindrome Check "+checkPalindrome(ch) );

	}

}
