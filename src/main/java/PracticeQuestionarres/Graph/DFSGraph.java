package PracticeQuestionarres.Graph;

import java.util.ArrayList;

class DFSGraph {
	public static void main(String[] args) {
		int V = 7;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <=V; i++)
			adj.add(new ArrayList<Integer>());
		addEdge(adj, 1,2);
		addEdge(adj, 1,3);
		addEdge(adj, 2,4);
		addEdge(adj, 2,5);
		addEdge(adj, 3,6);
		
		  addEdge(adj, 3,7);
		 		/*
		 * addEdge(adj, 3, 4);
		 */		System.out.println(dfsOfGraph(V, adj));

	}

	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

		ArrayList<Integer> dfsvalue = new ArrayList<>();
		boolean[] visited = new boolean[V];
		for (int i = 0; i < V; ++i) {
			if (!visited[i])
				dfs(i, dfsvalue, visited, adj);
		}
		return dfsvalue;
	}

	public static void dfs(Integer node, ArrayList<Integer> dfsvalue, boolean[] visited,
			ArrayList<ArrayList<Integer>> adj) {
		visited[node] = true;
		dfsvalue.add(node);
		for (Integer it : adj.get(node)) {
			if (!visited[it])
				dfs(it, dfsvalue, visited, adj);
		}

	}

}