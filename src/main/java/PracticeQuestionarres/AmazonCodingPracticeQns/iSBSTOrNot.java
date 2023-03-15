package PracticeQuestionarres.AmazonCodingPracticeQns;


public class iSBSTOrNot {
	static class Node {
		int Data;
		Node left;
		Node right;

		Node(int data) {
			Data = data;
			left = right = null;
		}
	}

	public static void main(String[] args) {
		Node root = new Node(100);
		root.left = new Node(50);
		root.right = new Node(200);
		root.left.left = new Node(25);
		root.left.right = new Node(75);
		root.right.right = new Node(40);
		System.out.println(isBST(root));

	}

	 static boolean isBST(Node root) {
		
		 return isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}

	 static boolean isBSTUtil(Node root, int min, int max) {
		if(root == null)
			return true;
		if(root.Data<min || root.Data>max)
			return false;
		
		return isBSTUtil(root.left,min,Math.min(root.Data, max)) &&
				isBSTUtil(root.right,Math.max(root.Data, min),max);
	}
}
