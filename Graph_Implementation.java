package graphs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Graph_Implementation extends GraphNode{
	
	Graph_Implementation(int v) {
		super(v);
	}


	boolean visited[];

	public void addEdge(int v, int w){
		adj[v].add(w);
	}
	
	public void GraphBFS(int start){
		boolean visited[] = new boolean[this.v];
		Queue<Integer> qu = new LinkedList<Integer>();
		visited[start] = true;
		qu.add(start);
		while(qu.size() != 0){
			int print = qu.poll();
			System.out.println(print);
			Iterator<Integer> i = adj[print].iterator();
			while(i.hasNext()){
				int next = i.next();
				//System.out.println("trying to add "+next);
				if(!visited[next]){
					visited[next] = true;
					//System.out.println("adding "+next);
					qu.add(next);
				}
			}	
		}
	}
	
	public void GraphDFS(int start){
		visited = new boolean[v];
		
		GraphDFSfriendS(start);
	}
	
	private void GraphDFSfriendS(int start) {
		Iterator<Integer> dfsIt = adj[start].iterator();
		if(!visited[start]){
			System.out.println(start); 
			visited[start] = true;
		}
		while(dfsIt.hasNext()){
			int next_num = dfsIt.next();
			if(!visited[next_num])
			GraphDFSfriendS(next_num);
		}
	}

	
	public void printGraph() {
		for(int i = 0 ; i < v ; i++){
			System.out.println("list "+i);
			for(int j = 0; j < adj[i].size(); j++){
				System.out.print("->"+adj[i].get(j) );
			}
			System.out.println();
		}	
	}

	
	public boolean isCyclic(int start) {
		Queue<Integer> qu = new LinkedList<Integer>();
		Set<Integer> hs = new HashSet<Integer>();
		qu.add(start);
		while(qu.size() != 0){
			int print = qu.poll();
			Iterator<Integer> i = adj[print].iterator();
			while(i.hasNext()){
				int next = i.next();
				if(hs.add(next)){
					qu.add(next);
				}
				else
					return true;
			}
			
		}
		
		return false;
	}
	
	

}
