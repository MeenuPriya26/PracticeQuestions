package PracticeQuestionarres.Tree;

public class RightViewOfBinaryTree {

	static int max_level = 0;

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int key) {
			data = key;
			left = right = null;
		}
	}

	static void leftViewUtil(Node root, int level) {
		if (root == null) {
			return;
		}
		if (max_level < level) {
			System.out.print(" " + root.data);
			max_level = level;
		}
		leftViewUtil(root.right, level + 1);
		leftViewUtil(root.left, level + 1);//Swap these recursion calls for right view of binary tree.
	}

	static void leftView(Node root) {
		max_level = 0;
		leftViewUtil(root, 1);

	}

	public static void main(String args[]) {

		Node root = new Node(4);
		root.left = new Node(7);
		root.right = new Node(6);
		root.right.right = new Node(2);
		root.right.right.left = new Node(5);
		root.right.right.right = new Node(1);
		root.right.right.right.left = new Node(3);
		leftView(root);

	}

}
