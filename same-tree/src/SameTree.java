public class SameTree {
	
	
    public static boolean isSameTree(TreeNode p, TreeNode q) {
    	if(p == null && q == null) {
    		return true;
    	} else {
    		if(p != null && q != null) {
    	        if(p.val == q.val) {
    	        	boolean left = isSameTree(p.left, q.left);
    	        	boolean right = isSameTree(p.right, q.right);
    	        	
    	        	if ( left && right ) {
    	        		return true;
    	        	} else { 
    	        		return false;
    	        	}
    	        }
    		} else {
    			return false;
    		}
    	}

    	return false;
    }
	public static void main(String args[]) {
//		TreeNode P1Leaf1 = new TreeNode(2, null, null);
//		TreeNode P1Leaf2 = new TreeNode(3, null, null);
//		TreeNode P1Root = new TreeNode(1, P1Leaf1, P1Leaf2);
//		
//		TreeNode P2Leaf1 = new TreeNode(2, null, null);
//		TreeNode P2Leaf2 = new TreeNode(3, null, null);
//		TreeNode P2Root = new TreeNode(1, P2Leaf1, P2Leaf2);
//		
//		System.out.println(isSameTree(P1Root, P2Root));
//		
//		TreeNode P3Leaf1 = new TreeNode(2, null, null);
//		TreeNode P3Root = new TreeNode(1, P3Leaf1, null);
//		
//		TreeNode P4Leaf1 = new TreeNode(2, null, null);
//		TreeNode P4Root = new TreeNode(1, null, P4Leaf1);
//		
//		System.out.println(isSameTree(P3Root, P4Root));
		
		TreeNode P5Leaf1 = new TreeNode(5, null, null);
		TreeNode P5Leaf2 = new TreeNode(15, null, null);
		TreeNode P5Root = new TreeNode(10, P5Leaf1, P5Leaf2);
		
		
		TreeNode P6Leaf1 = new TreeNode(15, null, null);
		TreeNode P6Limb1 = new TreeNode(5, null, P6Leaf1);
		TreeNode P6Root = new TreeNode(10, P6Limb1, null);
		
		System.out.println(isSameTree(P5Root, P6Root));
	}
}
