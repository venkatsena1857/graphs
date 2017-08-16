package graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class WeightedGraphNode {
	HashMap<Character,ArrayList<Character>> hm = new HashMap<Character,ArrayList<Character>>();
	Edge e[];
	public WeightedGraphNode(char[] size){
		for(int i =0 ; i < size.length; i ++){
			char c = size[i];
			ArrayList<Character> al = new ArrayList<Character>();
			hm.put(c, al);
		}
	}

	public void addWeightedGraphEdge(WeightedGraphNode x,char a,char b,int w){
		 this.hm.get(a).add(b);
		 this.hm.get(b).add(a);
		 this. e = new Edge(a+""+b, w);
	}
	
	public Edge getEdge(){
		return this.e;
	}
}

class Edge{
	String name;
	int weight;
	public Edge(String name,int weight){
		this.name = name;
		this.weight = weight;
	}
}




