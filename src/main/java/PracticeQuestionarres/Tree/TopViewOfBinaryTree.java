package PracticeQuestionarres.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;


public class TopViewOfBinaryTree {
	static class Node{
		int data;
		Node left;Node right;
		Node(int key){
			data=key;
			left=right=null;
		}
	}
	static class Pair{
		int hd;
		Node node;
		Pair(int hd,Node node){
			this.hd=hd;
			this.node=node;
		}
	}
static ArrayList<Integer> topView(Node root){
	Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
	Queue<Pair> q=new LinkedList<Pair>();
	ArrayList<Integer> ans=new ArrayList<>();
	if(root==null) {
		return ans=null;
	}
	else 
		q.add(new Pair(0,root));
	System.out.println("The top view of the tree is::");
	while(!q.isEmpty()) {
		Pair cur=q.poll();
		if(!map.containsKey(cur.hd)) {
			map.put(cur.hd, cur.node.data);
		}
		if(cur.node.left!=null) {
			q.add(new Pair(cur.hd-1,cur.node.left));
		}
		if(cur.node.right!=null) {
			q.add(new Pair(cur.hd+1,cur.node.right));
		}
		
	}
	
	for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
		ans.add(entry.getValue());
	}
	return ans;
	
}
public static void main(String[] args) {
	Node root = new Node(6);
	root.left = new Node(2);
	root.right = new Node(1);
	root.left.right = new Node(3);
	root.right.right = new Node(5);
	root.left.right.right=new Node(4);
	System.out.println(topView(root));
}
}
