package PracticeQuestionarres.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree_Diff_Traversal {
    static class TreeNode {
        String data;
        TreeNode left, right;

        public TreeNode(String key) {
            data = key;
            left = right = null;
        }
    }

    static void preorder(TreeNode TreeNode) {
        if (TreeNode == null)
            return;

        // Traverse root
        System.out.print(TreeNode.data + " ");
        // Traverse left
        preorder(TreeNode.left);
        // Traverse right
        preorder(TreeNode.right);
    }

    static void inorder(TreeNode TreeNode) {
        if (TreeNode == null)
            return;

        // Traverse left
        inorder(TreeNode.left);
        // Traverse root
        System.out.print(TreeNode.data + " ");
        // Traverse right
        inorder(TreeNode.right);
    }

    static void postorder(TreeNode TreeNode) {
        if (TreeNode == null)
            return;

        // Traverse left
        postorder(TreeNode.left);
        // Traverse right
        postorder(TreeNode.right);
        // Traverse root
        System.out.print(TreeNode.data + " ");
    }
   static void printLevelOrder(TreeNode root) {
       Queue<TreeNode> queue = new LinkedList<TreeNode>();
       queue.add(root);
       while (!queue.isEmpty()) {
           TreeNode tempNode = queue.poll();
           System.out.print(tempNode.data + " ");

           /*add left child to the queue */
           if (tempNode.left != null) {
               queue.add(tempNode.left);
           }

           /*add right right child to the queue */
           if (tempNode.right != null) {
               queue.add(tempNode.right);
           }
       }
   }

    public static void main(String args[])
            
    {
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
        inorder(root);

        System.out.println("\nPreorder traversal ");
        preorder(root);

        System.out.println("\nPostorder traversal");
       postorder(root);

        System.out.println("\nLevelorder traversal");
        printLevelOrder(root);

    }

}