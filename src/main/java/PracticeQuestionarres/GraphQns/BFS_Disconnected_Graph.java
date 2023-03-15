package PracticeQuestionarres.GraphQns;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS_Disconnected_Graph {
	private  static int V;
	private LinkedList<Integer> adj[];
	
	BFS_Disconnected_Graph(int v){
		V=v;
		adj=new LinkedList[v];
		for(int i=0;i<V;i++) {
			adj[i]=new LinkedList<Integer>();
		}
	}
	public static void main(String[] args) {
		BFS_Disconnected_Graph g=new BFS_Disconnected_Graph(10);
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
		System.out.println("BFS order starting from is");
		g.BFS();
		
	}
	  void BFS() {
		  
		boolean visited[]=new boolean[V];
		for(int i=1;i<8;i++) {
			if(visited[i]==false) {
				LinkedList<Integer> queue=new LinkedList<Integer>();
				visited[i]=true;
				queue.add(i);
				while(queue.size()!=0) {
					i=queue.poll();
					System.out.print(""+i);
					Iterator<Integer> itr=adj[i].listIterator();
					while(itr.hasNext()) {
						int n=itr.next();
						if(visited[n]==false) {
							visited[n]=true;
							queue.add(n);
						}
					}
				}
			}
		}
	
	  }
	void addEdge(int v, int w) {
		 adj[v].add(w);	
	}
}
