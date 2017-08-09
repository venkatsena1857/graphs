package graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class GraphCourseSchedule{
	
	ArrayList<Integer> adj[];
	public GraphCourseSchedule(int val){
		adj = new ArrayList[val];
		for(int i  =0; i < val; i ++){
			adj[i] =  new ArrayList<Integer>();
		}
	}
}

public class CourseSchedule {
	
	public static void main(String ar[]){
		int numCourses = 2;
		int[][] prerequisites =  {{0,1},{1,0}};
		System.out.print(canFinish(numCourses, prerequisites));
	}
	public static boolean canFinish(int numCourses, int[][] prerequisites) {
		GraphCourseSchedule gcs = new GraphCourseSchedule(prerequisites.length); 
		for(int i = 0 ; i < prerequisites.length; i++){
				gcs.adj[prerequisites[i][0]].add(prerequisites[i][1]);
				System.out.println("hi "+prerequisites[i][0]+" is index of "+gcs.adj[prerequisites[i][0]]);
		}
		
		return isCycle(gcs, prerequisites.length);
    }

	private static boolean  isCycle(GraphCourseSchedule start, int length) {
		Queue<Integer> q =  new LinkedList<Integer>();
		Set<Integer> hs = new HashSet<Integer>();
		q.add(start.adj[0].get(0));
		while(!q.isEmpty())
		{
			int pop =  q.poll();
			List<Integer> inList = start.adj[pop];
		}
		return true;
	}

	

}
