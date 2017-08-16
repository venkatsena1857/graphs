package graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class KruskalsAlgo{

	public static void main(String args[]){
		ArrayList<Edge> graph = new ArrayList<Edge>();
		Edge ab = new Edge('a','b',3);
		Edge bc = new Edge('b','c',1);
		Edge cf = new Edge('c','f',4);
		Edge fe = new Edge('f','e',2);
		Edge ed = new Edge('e','d',6);
		Edge da = new Edge('d','a',1);		
		Edge db = new Edge('d','b',3);
		Edge dc = new Edge('d','c',1);
		Edge ce = new Edge('c','e',5);
		
		
		
		graph.add(ab);
		graph.add(bc);
		graph.add(cf);
		graph.add(fe);
		graph.add(ed);
		graph.add(da);
		graph.add(db);
		graph.add(dc);
		graph.add(ce);
		
		WeightedGraphNode graphNode = new WeightedGraphNode(graph);
		
		for(int i = 0 ; i < graphNode.wGraph.size(); i++){
			Edge e = graphNode.wGraph.get(i);
			System.out.println("the source is "+e.source+" ||the dest is "+e.dest+" baruvu "+e.weight);
			
		}
		
	}
}
