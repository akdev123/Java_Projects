package queue;

public class QueueUsingLinkedList {
	
	Node first , last;
	
	public void enqueue(Node n){
		
		if(first == null){
			
			first = n;
			last = n;
			
		}
		else{
			
			last.next = n;
			last = n;
			
		}
		
	}
	
	
	public Node deQueue(){
		
		if(first == null)
			return null;
		else
		{
			
	            Node temp = new Node(first.val);
	            first = first.next;
	            return temp;
	           

			
		}
		
		
		
	}
	

	public static void main(String[] args) {
		
		
		
		
		

	}

}
