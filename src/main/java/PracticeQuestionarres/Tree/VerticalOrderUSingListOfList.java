package PracticeQuestionarres.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;


public class VerticalOrderUSingListOfList {
	static List<List<Integer>> ans;

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int key) {
			data = key;
			left = right = null;
		}
	}

	static class QueueObj {
		Node node;
		int hd;

		QueueObj(int hd, Node node) {
			this.hd = hd;
			this.node = node;
		}
	}

	static List<List<Integer>> verticalOrderTraversal(Node root) {
		ans=new ArrayList<List<Integer>>();
		Queue<QueueObj> q = new LinkedList<QueueObj>();
		Map<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
		if (root == null)
			return null;
		else
			q.add(new QueueObj(0, root));
		while (!q.isEmpty()) {
			QueueObj curr = q.poll();
			if(ans.get(curr.hd) != null) {
				((ArrayList<Integer>)ans.get(curr.hd)).add(curr.node.data);

			} else {
				ArrayList<Integer> res = new ArrayList<>();
				int[] hdArray=new int[10];
				res.add(curr.node.data);
				ans.add(curr.hd, res);
			}
			if (curr.node.left != null)
				q.add(new QueueObj(curr.hd - 1, curr.node.left));
			
			if (curr.node.right != null)
				q.add(new QueueObj(curr.hd + 1, curr.node.right));
		}
		 return (List<List<Integer>>) ans;
		
		 	}


	public static void main(String args[]) {

		Node root = new Node(10);
		root.right = new Node(30);
		root.right.right = new Node(40);
		root.right.left = new Node(5);
		System.out.println(verticalOrderTraversal(root));

	}
}
