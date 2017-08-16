package graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class WeightedGraphNode {
	ArrayList<Edge> wGraph = new ArrayList<Edge>();
	WeightedGraphNode(ArrayList<Edge> wGraph){
		this.wGraph = wGraph;
	}
}

class Edge{
	char source;
	char dest;
	int weight;
	
	Edge(char source,char dest, int weight){
		this.source = source;
		this.dest = dest;
		this.weight = weight;
	}
}




