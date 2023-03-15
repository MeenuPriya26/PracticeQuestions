package PracticeQuestionarres.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalOrder {
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

	static ArrayList<Integer> verticalOrderTraversal(Node root) {
		ArrayList<Integer> ans=new ArrayList<Integer>();
		Queue<QueueObj> q = new LinkedList<QueueObj>();
		Map<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
		if (root == null)
			return ans=null;
		else
			q.add(new QueueObj(0, root));
		while (!q.isEmpty()) {
			QueueObj curr = q.poll();
			if (map.containsKey(curr.hd)) {
				map.get(curr.hd).add(curr.node.data);

			} else {
				ArrayList<Integer> res = new ArrayList<>();
				res.add(curr.node.data);
				map.put(curr.hd,res);

			}
			if (curr.node.left != null)
				q.add(new QueueObj(curr.hd - 1, curr.node.left));
			
			if (curr.node.right != null)
				q.add(new QueueObj(curr.hd + 1, curr.node.right));
		}
		for(Map.Entry<Integer, ArrayList<Integer>> entry:map.entrySet()) {
	          ans.addAll(entry.getValue());
		}
		return ans;
		/*
		 * System.out.println(ans);
		 */	}

	public static void main(String args[]) {

		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.right = new Node(50);
		root.left.right.right = new Node(40);
		System.out.println(verticalOrderTraversal(root));

	}
}
