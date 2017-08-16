package graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class KruskalsAlgo extends WeightedGraphNode{

	public KruskalsAlgo(char[] a) {
		super(a);
	}
	
	public static void main(String args[]){
		char[] ch = {'a','b','c','d','e','f'};
		
		WeightedGraphNode wg = new WeightedGraphNode(ch);
		
		wg.addWeightedGraphEdge(wg, 'a', 'b', 3);
		wg.addWeightedGraphEdge(wg, 'a', 'd', 1);
		wg.addWeightedGraphEdge(wg, 'b', 'c', 1);
		wg.addWeightedGraphEdge(wg, 'b', 'd', 3);
		wg.addWeightedGraphEdge(wg, 'c', 'd', 1);
		wg.addWeightedGraphEdge(wg, 'c', 'e', 5);
		wg.addWeightedGraphEdge(wg, 'd', 'e', 6);
		wg.addWeightedGraphEdge(wg, 'c', 'f', 4);
		wg.addWeightedGraphEdge(wg, 'e', 'f', 2);

		
		
		
		Iterator i =  wg.hm.entrySet().iterator();
		while(i.hasNext()){
			 Map.Entry pair = (Map.Entry)i.next();
			 System.out.println(pair.getKey());
			 System.out.println(pair.getValue());
		}
		
	}
}
