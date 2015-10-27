package linkedlist;

/*
 * 
 * http://stackoverflow.com/questions/2663115/how-to-detect-a-loop-in-a-linked-list
 * 
 * The idea is to have two references to the list and move them at different speeds. Move one forward by 1 node and the other by 2 nodes.
		public boolean hasLoop(Node first){
			
			Node slow = first;
			Node fast = first;
			
			while(fast != null && fast.next!=null){
				
				slow = first.next;
				fast = first.next.next;
				
				if(slow == fast)
				     return true;
				
				
				
			}
			
			return false;
			
			
		}*/

public class DetectLoopInLinkedList {

}
