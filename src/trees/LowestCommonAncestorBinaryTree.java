package trees;

public class LowestCommonAncestorBinaryTree {
	
	static class Node {
	    Node left;
	    Node right;
	    int value;
	     
	    public Node(int value) {
	        left = null;
	        right = null;
	        this.value = value;
	    }
	}
	// Source for below method : http://stackoverflow.com/questions/12056068/finding-least-common-ancestor-in-binary-tree
	public static Node findLca(Node node, int t1, int t2) {
	    if(node == null) {
	        return null;
	    }
	    if(node.value > t2 && node.value > t1) {
	        // both targets are left
	        return findLca(node.left, t1, t2);
	    } else if (node.value < t2 && node.value < t1) {
	        // both targets are right
	        return findLca(node.right, t1, t2);
	    } else {
	        // either we are diverging or both targets are equal
	        // in both cases so we've found the LCA
	        // check for actual existence of targets here, if you like
	        return node;
	    }
	}


	public static void main(String[] args) {
		
		/**
         * Create a sample Binary Tree. A Binary tree does not have to maintain
         * left <root < right relationship.
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(4);
        root.left.left = new Node(6);
        root.left.right = new Node(5);
 
        root.right.left = new Node(9);
        root.right.right = new Node(11);
        root.right.right.left = new Node(7);
        root.right.right.right = new Node(3);
        
        
        System.out.println("Lowest Common Ancestor of Node 3 and 9 is: "
                + findLca(root, 3,9).value);
		

	}

}
