package PracticeQuestionarres.GraphQns;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS_Connected_Graph {

	private  static int V;
	private LinkedList<Integer> adj[];
	
	BFS_Connected_Graph(int v){
		V=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i]=new LinkedList<Integer>();
		}
	}
	public static void main(String[] args) {
		BFS_Connected_Graph g=new BFS_Connected_Graph(10);
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
		System.out.println("BFS order starting from vertex 2 is");
		g.BFS(1);
		
	}
	  void BFS(int v) {
		boolean visited[]=new boolean[V];
		LinkedList<Integer> queue=new LinkedList<Integer>();
		visited[v]=true;
		queue.add(v);
		while(queue.size()!=0) {
			v=queue.poll();
			System.out.print(""+v);
			Iterator<Integer> itr=adj[v].listIterator();
			while(itr.hasNext()) {
				int n=itr.next();
				if(!visited[n]) {
					visited[n]=true;
					queue.add(n);
				}
			}
		}
	  }
	void addEdge(int v, int w) {
		 adj[v].add(w);	
	}

}
