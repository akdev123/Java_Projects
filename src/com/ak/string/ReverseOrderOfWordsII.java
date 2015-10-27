package com.ak.string;

public class ReverseOrderOfWordsII {
	
	public static String reverseWords2(String sentence) {
	    StringBuilder sb = new StringBuilder(sentence.length() + 1);
	    String[] words = sentence.split(" ");
	    for (int i = words.length - 1; i >= 0; i--) {
	        sb.append(words[i]).append(' ');
	    }
	    sb.setLength(sb.length() - 1);  // Strip trailing space
	    return sb.toString();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//StringBuilder sb = new StringBuilder();
		String str = "My favourite language is JAVA";
		
		//System.out.println("See this aparoach:"+reverseWords2(str));
		
		String[] words = str.split("");
		String orderRev = "";
		
		for(int i = words.length-1 ; i >=0 ; i-- ){
			
			//sb.append(words[i]).append(' ');
			orderRev += words[i]+"";
			
			
		}
	//	sb.setLength(sb.length()-1);
		System.out.print(orderRev);
		

	/*	
		String str = "My favourite language is JAVA";
		
		//char[] c = str.toCharArray();
		String rev = "";
		
		for(int i = str.length()-1; i>0; i--){
			
			char c = str.charAt(i);
			
			rev += c;
			
		}
		
		System.out.println(rev);
		
		String revAgain = "";
		
      for(int i = rev.length()-1; i>0; i--){
			
			char c1 = rev.charAt(i);
			
			revAgain += c1;
			
		}
      System.out.println(revAgain);*/
      
	}

}
