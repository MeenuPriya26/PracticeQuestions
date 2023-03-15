package PracticeQuestionarres.GraphQns;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph_DFS_Disconnected {

	private static int V;
	private LinkedList<Integer> adj[];

	Graph_DFS_Disconnected(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}

	public static void main(String[] args) {
		Graph_DFS_Disconnected g = new Graph_DFS_Disconnected(10);
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
		System.out.println("DFS order starting from is");
		g.DFS();

	}

	void DFS() {
		boolean[] visited = new boolean[V];
		for (int i = 1; i < 8; i++) {
			if (visited[i] == false) {
				DFSUtil(i, visited);
			}
		}

	}

	void DFSUtil(int v, boolean[] visited) {
		visited[v] = true;
		System.out.print(" " + v);
		Iterator<Integer> itr = adj[v].listIterator();
		while (itr.hasNext()) {
			int n = itr.next();
			if (!visited[n]) {
				DFSUtil(n, visited);
			}
		}

	}

	void addEdge(int v, int w) {
		adj[v].add(w);
	}

}
