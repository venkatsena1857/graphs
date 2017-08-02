package graphs;

public class Graph_Init {
	public static void main(String ar[]){
		
		Graph_Implementation g = new Graph_Implementation(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		g.printGraph();
		g.GraphBFS(2);
		System.out.println("dfs");
		g.GraphDFS(2);
		System.out.println("graph is cyclic : "+g.isCyclic(2));
		Graph_Implementation g2 = new Graph_Implementation(3);
		g2.addEdge(0, 1);
		g2.addEdge(0, 2);
		g2.addEdge(2, 1);
		System.out.println("graph is cyclic : "+g2.isCyclic(0));
	}
}
