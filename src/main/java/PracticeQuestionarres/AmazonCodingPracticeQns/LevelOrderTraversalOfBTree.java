package PracticeQuestionarres.AmazonCodingPracticeQns;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalOfBTree {
	static class Tree {
		int root;
		Tree left;
		Tree right;

		Tree(int data) {
			root = data;
			left = right = null;
		}
	}

	public static void main(String[] args) {
		Tree root = new Tree(100);
		root.left = new Tree(50);
		root.right = new Tree(200);
		root.left.left = new Tree(25);
		root.left.right = new Tree(75);
		root.right.right = new Tree(350);
		levelOrderTraversal(root);

	}

	static void levelOrderTraversal(Tree root) {
		if(root == null)
			return;
		Queue<Tree> q=new LinkedList<Tree>();
		q.add(root);
		while(!q.isEmpty()) {
			Tree temp=q.poll();
			System.out.print(temp.root+" ");
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
	}
}
