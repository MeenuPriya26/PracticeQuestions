package PracticeQuestionarres.Tree;

import java.util.LinkedList;
import java.util.Queue;


public class TreeBFSAndDFS {
static class TreeNode{
	String data;
	TreeNode left;
	TreeNode right;
	
	TreeNode(String key){
		data=key;
		left=right=null;
	}
}
static void InOrderTraversal(TreeNode treenode) {
	if(treenode == null)
		return;
	InOrderTraversal(treenode.left);
	System.out.print(treenode.data + " ");
	InOrderTraversal(treenode.right);
	
}
static void PreOrderTraversal(TreeNode treenode) {
	if(treenode == null)
		return;
	System.out.print(treenode.data + " ");
	PreOrderTraversal(treenode.left);
	PreOrderTraversal(treenode.right);
	
}

static void PostOrderTraversal(TreeNode treenode) {
	if(treenode == null)
		return;
	PostOrderTraversal(treenode.left);
	PostOrderTraversal(treenode.right);
	System.out.print(treenode.data + " ");
}

static void LevelOrderTraversal(TreeNode root) {
	
	Queue<TreeNode> queue=new LinkedList<TreeNode>();
	queue.add(root);
	while(!queue.isEmpty()) {
		TreeNode tempNode=queue.poll();
		System.out.print(tempNode.data+"");
		if(tempNode.left!=null) {
			queue.add(tempNode.left);
		}
		if(tempNode.right!=null) {
			queue.add(tempNode.right);
		}
	}
	
}
public static void main(String[] args) {
	TreeNode root = new TreeNode("Les");
    root.left = new TreeNode("Cathy");
    root.right = new TreeNode("Sam");
    root.left.left = new TreeNode("Alex");
    root.left.right = new TreeNode("France");
    root.right.left=new TreeNode("Nancy");
    root.right.right=new TreeNode("Violet");
    root.right.right.left=new TreeNode("Tony");
    root.right.right.right=new TreeNode("Wendy");
    System.out.println("Inorder traversal");
    InOrderTraversal(root);
    System.out.println("\nPreOrderTraversal traversal");
    PreOrderTraversal(root);
    System.out.println("\nPostOrderTraversal traversal");
    PostOrderTraversal(root);
    System.out.println("\nLevelOrderTraversal traversal");
    LevelOrderTraversal(root);
}
}
