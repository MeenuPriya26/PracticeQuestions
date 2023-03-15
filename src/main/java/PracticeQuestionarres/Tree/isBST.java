package PracticeQuestionarres.Tree;

import java.util.ArrayList;

public class isBST
{
	static class Node{
		int data;
		Node left;Node right;
		Node(int key){
			data=key;
			left=right=null;
		}
	}
    static boolean isBST(Node root)
    {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    static boolean isBSTUtil(Node root, int min, int max)
    {
        if(root==null)
        	return true;
        if(root.data<min  ||  root.data>max)
        	return false;
        return isBSTUtil(root.left,min,Math.min(root.data, max))
        		&& isBSTUtil(root.right,Math.max(min, root.data),max);
        	
    }
    
    public static void main(String args[]) {

		Node root = new Node(50);
		root.left = new Node(10);
		root.right = new Node(70);
		root.right.left = new Node(20);
		root.right.right = new Node(80);
		 
		
		/*
		 * Node root = new Node(20); root.left = new Node(10); root.right = new
		 * Node(40); root.left.left = new Node(5); root.left.right = new Node(15);
		 * root.right.left = new Node(30); root.right.right = new Node(50);
		 */
		boolean ans=isBST(root);
		System.out.print(ans);
		
		/*
		 * if (root==null) { return true; }
		 * 
		 * if (root.data < min || root.data > max) { return false; }
		 * 
		 * return isBSTUtil(root.left, min, Integer.min(root.data, max)) &&
		 * isBSTUtil(root.right, Integer.max(min, root.data), max);
		 */

	}
}