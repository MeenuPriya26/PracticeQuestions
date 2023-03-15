package PracticeQuestionarres.GraphQns;

import java.util.*;

class Graph_DFS_Connected {
	private  static int V;
	private static LinkedList<Integer> adj[];
	
	Graph_DFS_Connected(int v){
		V=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i]=new LinkedList<Integer>();
		}
	}
	public static void main(String[] args) {
		Graph_DFS_Connected g=new Graph_DFS_Connected(10);
		g.addEdge(2,5);
		g.addEdge(3,5);
		g.addEdge(1,2);
		g.addEdge(2,4);
		g.addEdge(4,1);
		g.addEdge(6,2);
		g.addEdge(5,6);
		g.addEdge(1,6);
		g.addEdge(6,3);
		g.addEdge(3,1);
		g.addEdge(7,3);
		g.addEdge(3,7);
		g.addEdge(7,5);
		
		System.out.println("DFS order starting from vertex 2 is");
		g.DFS(2);
		
	}
	  void DFS(int v) {
		boolean[] visited=new boolean[V];
		DFSUtil(v,visited);
		
	}
	  void DFSUtil(int v,boolean[] visited) {
		  visited[v]=true;
		  System.out.print(" "+v);
		  Iterator<Integer> itr=adj[v].listIterator();
		  while(itr.hasNext()) {
			  int n=itr.next();
			  if(!visited[n]) {
				  DFSUtil(n,visited);
			  }
		  }
		  
	  }
	void addEdge(int v, int w) {
		 adj[v].add(w);	
	}
	
	/*
	 * static void printGraph(LinkedList<Integer> adj) { for (int i = 0; i <
	 * adj.size(); i++) { System.out.println("\nAdjacency list of vertex" + i);
	 * System.out.print("head");
	 * 
	 * for (int j = 0; j < list.get(i).SIZE; j++) { System.out.print(" -> " +
	 * list.get(i));
	 * 
	 * } System.out.println(); } }
	 */

}