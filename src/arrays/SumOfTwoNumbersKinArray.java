package arrays;

public class SumOfTwoNumbersKinArray {

	//Source :https://www.youtube.com/watch?v=l5orcTJlT54
	
	
	public static void main(String[] args) {
		// Array is Sorted array
		
		int[] a = {1,2,3,4,8,9,10};
		
		System.out.println("Length of Array: " + a.length);
		// We need to print out those two numbers whose sum equals K = 12
		
		int left = 0; 
		int right = a.length-1;
		
		while (left < right){
			
			
			int sum = a[left] + a[right];
			
			if(sum == 12){
				
				System.out.println("Pairs are :" +a[left]+","+a[right]);
				left++;
				right--;
				
			}
			else if( sum < 12){
				
				left++;
				
			}
			else {
				
				right --;
			}
			
		}
		
		
		

	}

}
