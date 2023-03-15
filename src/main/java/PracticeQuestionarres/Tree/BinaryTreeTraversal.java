package PracticeQuestionarres.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTraversal {
	static class Node {
		String data;
		Node left;
		Node right;

		Node(String key) {
			data = key;
			left = right = null;
		}
	}

	static void InOrderTraversal(Node root) {
		if (root == null)
			return;
		InOrderTraversal(root.left);
		System.out.print(root.data + " ");
		InOrderTraversal(root.right);

	}

	static void PreOrderTraversal(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		PreOrderTraversal(root.left);
		PreOrderTraversal(root.right);

	}
	static void PostOrderTraversal(Node root) {
		if (root == null)
			return;
		PostOrderTraversal(root.left);
		PostOrderTraversal(root.right);
		System.out.print(root.data + " ");

	}
	static void LevelOrderTraversal(Node root) {
		if(root==null)
			return;
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
			Node temp=q.poll();
			System.out.print(temp.data+" ");
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
	}

	public static void main(String[] args) {

		Node root = new Node("L");
		root.left = new Node("C");
		root.left.left = new Node("A");
		root.left.right = new Node("F");
		root.right = new Node("S");
		root.right.left = new Node("N");
		root.right.right = new Node("V");
		root.right.right.left = new Node("T");
		root.right.right.right = new Node("W");
		System.out.println("InOrder Traversal is ::");
		InOrderTraversal(root);
		System.out.println();
		System.out.println("PreOrder Traversal is ::");
		PreOrderTraversal(root);
		System.out.println();
		System.out.println("PostOrder Traversal is ::");
		PostOrderTraversal(root);
		System.out.println("LevelOrderTraversal is");
		LevelOrderTraversal(root);
		

	}
}
