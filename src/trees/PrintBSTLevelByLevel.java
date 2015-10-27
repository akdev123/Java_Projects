package trees;

// Source : http://algorithms.tutorialhorizon.com/level-order-traversal-print-each-level-in-separate-line/
import java.util.LinkedList;
import java.util.Queue;

public class PrintBSTLevelByLevel {
	
	
     public static class Node {
		
		int data;
		Node left;
		Node right;
		
		Node(int val){
			
			this.data = val;
			Node left = null;
			Node right = null;
			
		}
	}
      
      public void LevelOrderQueue(Node root){
    	  
    	  Queue<Node> q = new LinkedList<Node>();
    	  int levelNodes = 0;
    	  
    	  if(root == null) return;
    	  q.add(root);
    	  
    	  while(!q.isEmpty()){
    		  
    		  levelNodes = q.size();
    		  
    		  while (levelNodes > 0){
    			  
    			  Node n = q.remove();
    			  System.out.print(""+n.data);
    			  if(n.left!= null)
    				  q.add(n.left);
    			  if(n.right!=null)
    				  q.add(n.right);
    			  levelNodes--;
    			  
    		  }
    		  System.out.println("");
    		  
    		  
    		  
    		  
    	  }
    	  
    	  
    	  
    	  //return null;
      }

	public static void main(String[] args) {
		
		Node root = new Node(5);
		
		root.left = new Node(10);
		root.right = new Node(15);
		root.left.left = new Node(20);
		root.left.right = new Node(25);
		root.right.left = new Node(30);
		root.right.right = new Node(35);
		
		PrintBSTLevelByLevel l = new PrintBSTLevelByLevel();
		
		System.out.println(" Output by Better Approach : ");
		l.LevelOrderQueue(root);
		
		
		

	}
	
	
	

}
