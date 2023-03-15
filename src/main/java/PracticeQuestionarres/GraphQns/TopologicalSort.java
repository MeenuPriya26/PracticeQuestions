package PracticeQuestionarres.GraphQns;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSort {
	private static int V;
	LinkedList<Integer> adj[];

	TopologicalSort(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}

	void addEdge(int u, int v) {
		adj[u].add(v);
	}

	public static void main(String[] args) {
		TopologicalSort g = new TopologicalSort(6);
		g.addEdge(2, 3);
		g.addEdge(3, 1);
		g.addEdge(4, 0);
		g.addEdge(4, 1);
		g.addEdge(5, 0);
		g.addEdge(5, 2);
		System.out.println("Following is a Topological " + "sort of the given graph");
		g.TopologicalSort();

	}

	void TopologicalSort() {
		Stack stack = new Stack();
		boolean visited[] = new boolean[V];
		for (int i = 0; i < V; i++)
			if (visited[i] == false)
				TopologicalSortUtil(i, visited, stack);

		while (stack.empty() == false)
			System.out.print(stack.pop() + "");
	}

	void TopologicalSortUtil(int i, boolean[] visited, Stack stack) {
		visited[i] = true;
		Integer n;
		Iterator<Integer> itr = adj[i].iterator();
		while (itr.hasNext()) {
			n = itr.next();
			if (!visited[n])
				TopologicalSortUtil(n, visited, stack);
		}
		stack.push(new Integer(i));
	}
}
