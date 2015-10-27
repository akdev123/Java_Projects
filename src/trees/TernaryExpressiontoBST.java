/*
 * Source : http://stackoverflow.com/questions/28487831/how-to-convert-a-ternary-expression-to-a-binary-tree-structure
 * package trees;

import java.util.Stack;

public class TernaryExpressiontoBST {

	
	public class TreeNode {
		
		char c; 
		TreeNode left;
		TreeNode right;
		
		public TreeNode(char c){
			this.c = c;
			left = null;
			right = null;
		}
	}
	
	
	public static TreeNode terNarytoBST(String s){
		
					if(s.length() == 0){
						return null;
					}
		
					TreeNode root = new TreeNode(s.charAt(0));
		
					Stack<TreeNode> stk = new Stack<TreeNode>();
					stk.push(root);
		
					for(int i = 0 ; i < s.length(); i++){
			
								if(s.charAt(i) == '?'){
						
									TreeNode node = stk.peek();
						
									node.left = new TreeNode(s.charAt(i+1));
									stk.push(node.left);	
								}
							else if (s.charAt(i) == ':'){
								stk.pop();
								TreeNode node = stk.pop();
								node.right = new TreeNode(s.charAt(i+1));
								stk.push(node.right);
					
					
							}
			
			
		}
		
					return root;
		
		
	}
	
	public static void main(String[] args) {
		

	}

}*/

