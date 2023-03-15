package PracticeQuestionarres.RecursionProblems;

public class heightOfBinaryTree {
	static class Node{
		int data;
		Node left, right; 
		Node(int item) {
			data = item;
			left = right = null;
		}
	}
	
	static int Height(Node root) {
		if(root == null) {
			return 0;
		}
		return(1+Integer.max(Height(root.left),Height(root.right)));
		
	}
public static void main(String[] args) {
	Node root = new Node(1);
	root.left = new Node(2);
	root.right = new Node(3);
	root.left.left = new Node(4);
	root.left.right = new Node(5);
	root.right.left = new Node(6);
	root.right.right = new Node(7);
	root.left.left.right = new Node(8);
	int h =Height(root);
	System.out.println(h);
}
}
