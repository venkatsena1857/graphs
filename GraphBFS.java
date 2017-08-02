package graphs;

public class GraphBFS {
	public static void main(String ar[]){
		
		Graph g = new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		//g.addEdge(3, 3);
		//g.printGraph();
		//g.GraphBFS(2);
		//System.out.println("dfs");
		//g.GraphDFS(2);
		//System.out.println("graph is cyclic : "+g.isCyclic(2));
		Graph g2 = new Graph(3);
		g2.addEdge(0, 1);
		g2.addEdge(0, 2);
		//g2.addEdge(2, 1);
		System.out.println("graph is cyclic : "+g2.isCyclic(0));
	}
}
