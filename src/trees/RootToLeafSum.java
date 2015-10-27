package trees;

// Source : https://www.youtube.com/watch?v=Jg4E4KZstFE
public class RootToLeafSum {

	
	public boolean rootToSum(Node root, int sum){
		
		
		if(root == null){
			return false;}
		
		// Check for leaf nodes
		
		if(root.left == null && root.right == null){
			
			if(sum == sum-root.data){
				return true;
			}
			else
			{ return false; }
			
		}
		
		// Check for left node
		
		if(rootToSum(root.left, sum- root.data)){
			return true;
		}
		// For right node
		
		if(rootToSum(root.right, sum-root.data)){
			return true;
		}
		
		
		return false;
	}
	
	
	public static void main(String[] args) {
		
	}

}
