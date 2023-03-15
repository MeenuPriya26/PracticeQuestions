package PracticeQuestionarres.Tree;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


class BottomViewOfBinaryTree_leetcode
{
	static class Node{
		int data;
		Node left;Node right;
		Node(int key){
			data=key;
			left=right=null;
		}
	}
	public static ArrayList <Integer> bottomView(Node root)
    {
        
        Map<Integer,Integer> m1 = new TreeMap<>();
        Map<Integer,Integer> m2 = new TreeMap<>();
        
        ArrayList<Integer> a1 = new ArrayList<>();
        
        rec(root,m1,m2,0,0);
        
        for(Map.Entry<Integer, Integer> e: m1.entrySet()){
               
            a1.add(e.getValue());

        }
        
        return a1;

        // Code here
    }
  
  static void rec(Node root,Map<Integer,Integer> m1,Map<Integer,Integer> m2,int hlev,int vlev){
      
      if(root == null){
          return;
      }
      
      if(m1.containsKey(hlev) == false){
          m1.put(hlev,root.data);
          m2.put(hlev,vlev);
      }else{
          if(m2.get(hlev) <= vlev){
              m1.put(hlev,root.data);
              m2.put(hlev,vlev);
          }
      }
      
      
      rec(root.left,m1,m2,hlev-1,vlev+1);
      rec(root.right,m1,m2,hlev+1,vlev+1);
      
  }
  
  public static void main(String[] args) {
	  Node root = new Node(20);
		root.left = new Node(8);
		root.right = new Node(22);
		root.left.left = new Node(5);
		root.left.right = new Node(3);
		root.right.right = new Node(25);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(14);
		ArrayList<Integer> list=bottomView(root);
		System.out.println(list);
}

}