package graphs;

import java.util.LinkedList;

public class GraphNode {

	int v; 
	boolean visited[];
	LinkedList<Integer> adj[] = null; 
	
	@SuppressWarnings("unchecked")
	GraphNode(int v){
		adj = new LinkedList[v];
		this.v = v;
		for(int i = 0 ; i < v ; i++){
			adj[i] = new LinkedList<Integer>();
		}
	}
}
