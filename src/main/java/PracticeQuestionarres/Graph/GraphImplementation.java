package PracticeQuestionarres.Graph;

import java.util.ArrayList;

public class GraphImplementation {
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	static void printGraph(ArrayList<ArrayList<Integer>> adj) {
		for (int i = 0; i < adj.size(); i++) {
			System.out.println("\nAdjacency list of vertex" + i);
			System.out.print("head");
			for (int j = 0; j < adj.get(i).size(); j++) {
				System.out.print(" -> " + adj.get(i).get(j));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int V = 10;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
		for (int i = 0; i < V; i++)
		adj.add(new ArrayList<Integer>());

		addEdge(adj, 2,5);
		addEdge(adj, 3,5);
		addEdge(adj, 1, 2);
		addEdge(adj, 2, 4);
		addEdge(adj, 4,1);
		addEdge(adj, 6,2);
		
		addEdge(adj, 5,6);
		addEdge(adj, 1,6);
		addEdge(adj, 6,3);
		addEdge(adj, 3,1);
		addEdge(adj, 7,3);
		addEdge(adj, 3,7);
		addEdge(adj, 7,5);

		/* addEdge(adj, 3, 4); */

		printGraph(adj);
	}
}
