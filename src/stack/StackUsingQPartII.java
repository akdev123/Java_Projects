package stack;

// THIS ONE WORKS and REFER THIS CODE
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// My StackOverflow Post : http://stackoverflow.com/questions/33057991/iterating-over-object-of-the-class/33058138#33058138

// Original Code taken from here : http://stackoverflow.com/questions/688276/implement-stack-using-two-queues

// More Explanation on the Methods, My SOF post : http://stackoverflow.com/questions/33061134/understanding-pop-and-push-operation-logic-of-a-stack-implemented-by-two-queues/33061202#33061202

public class StackUsingQPartII implements Iterator<Integer> {
	
	Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    public int pop() {
        if (q1.peek() == null) {
            System.out.println("The stack is empty, nothing to return");
            int i = 0;
            return i;
        } else {
            int pop = q1.remove();
            return pop;
        }
    }

    public void push(int data) {

        if (q1.peek() == null) {
            q1.add(data);
        } else {
        	    // The below for loop is removing the contents from q1 to q2 until the size of q1 is one, then add data to the queue 
	            for (int i = q1.size(); i > 0; i--) {
	                q2.add(q1.remove());
	            }
	            q1.add(data);
	            for (int j = q2.size(); j > 0; j--) {
	                q1.add(q2.remove());
	            }

             }
    }
    
    
    public Iterator<Integer> iterator() {
        return q1.iterator();
    }
	
	
	
	public static void main(String[] args) {
		

		StackUsingQPartII st = new StackUsingQPartII ();
		
		st.push(2);
		st.push(3);
		st.push(4);
		st.pop();
		st.pop();
		st.pop();
		

        Iterator<Integer> it = st.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println(i);
        }
		
		
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return null;
	}

}
