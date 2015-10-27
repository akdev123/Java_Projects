package stack;

// Source Video : https://www.youtube.com/watch?v=Wn45fJKBTTc
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
	
	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();
	
	public  void push(int data){
		
		if(q1.isEmpty()){
			q2.add(data);
		}
		else{
			
			q1.add(data);
		}
		
		
		
	}
	
	public int pop(){
		int x;
		if(q1.isEmpty()){
					if(q2.isEmpty()){
						
						System.out.println("Stack Underflow");
						System.exit(0);
						
					} else {
							/* I will keep on removing elements from the Queue q1 and adding
							   it to Queue 2 until only one element remains in Queue q1, then 
							   I will be removing that particular element from the Queue q1 to
							    accomplish the Stack Pop operation */ 
							
								    while(q1.size()!=1){
								    	
								    x =	q1.remove();
								    q2.add(x);
								    	
								    }
						         return q1.remove();
						  }}
						else {
							
								while(q2.size()!=1){
							    	
								    x =	q2.remove();
								    q1.add(x);
								    	
								    }
								    return q2.remove();
							
							
							}
			
		return 0;
			
		}
		
		
	
	public static void main(String[] args) {
	
		
		StackUsingQueues st = new StackUsingQueues();
		
		st.push(1);
		st.push(2);
		
		
		


	}

}
