package queue;

// QUEUE IMPLEMENTATION USING ARRRAYS

// Tutorial Source : https://www.youtube.com/watch?v=okr-XE8yTO8
public class QueueUsingArray {
	
			int[] a = new int[10];// Create a Queue using array
			
			int lengthOfArray = a.length;
			int N = lengthOfArray;
			
			int front = -1;
			int rear = - 1; 
	
			// Method to check if the queue is empty
			public boolean isEmpty(){
				
				if(front == -1 && rear == -1)
					return true;
				else
					return false;
		     }
	
				// Method to Insert an element in a Queue or Enqueue and element
				
				public void Enqueue(int x){
					
					// If rear is already equal to the maximum index available in array 'a' then do the following
					
					if((rear+1 ) %N == front){
						
						return; // return is simply written as written as the method is void and isn't returning anything.
					}
					// ELSE if the Queue is empty and not full then do the following
					else if(isEmpty()){
						
						front = front + 1;
						rear = rear + 1;
						a[rear] = x;
					}
					else {
						
						rear = (rear + 1)%N; // Taking Circular Idea Array concept into consideration so that empty cells can be filled 
						a[rear] = x;
					}
					
				}
	
				public void Dequeue(){
					
					if (isEmpty())
						return;
					else if (front == rear){
						
						front = rear = -1;
					}
					else {
						
						front = (front+1)%N; // Where N is total number of elements in the array, In our case its 10
					}
					
				}
	
			    public int peek(){
				
				     //if (front != -1)
					return a[front];
				}
		
		
	
	
	

	public static void main(String[] args) {
		
            
		
		
		

	}

}
