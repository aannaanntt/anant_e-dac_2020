class Graph2h
{
	ArrayList<ArrayList<Integer>> graph;
	int v;
	
	Graph2h(int nodes)
	{
		v=nodes;
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i = 0;i<v;i++)
		{
			graph.add (new ArrayList<Integer>());
		}
	}
	void addEdge(int v,int u)
	{
		graph.get(v).add(u);
		graph.get(u).add(v);
		
	}
	void PrintGraph()
	{
		for(int i = 0;i<v;i++)
		{
			System.out.print("Node i :");
			for(int x: graph.get(i))
			{
				System.out.print("->"+x);
			
			}
			System.out.println();
		}
	}
	void BFS(int start)
	{
		boolean visited[]=new boolean[v];
		Queue<Integer> q= new LinkedList<Integer>();
		q.add(start);
		System.out.print("BFS traversal");
		visited[start] = true;
		while(q.isEmpty() == false)
		{
			int node = q.poll();
			System.out.print(node+" ");
			for(int x: graph.get(node))
					{
							if(visited[x]== false)
							{
								visited[x] = true;
								q.add(x);
							}
					}
		}
		
	}
	void DFSutil( boolean visited[],int node)
	{
		visited[node]=true;
		System.out.print(node+" ");
		for(int x: graph.get(node))
		{
			if(visited[x] == false)
			{
				visited[x]=true;
				DFSutil(visited,x);
			}
		}
			
		
	}
	void DFS(int start)
	{
		boolean visited[] = new boolean[v];
		System.out.print("DFS traversal");
		DFSutil(visited,start);
	}
	
}


public class Graph1 {

	public static void main(String[] args) 
	{
		Graph2h g=new Graph2h(5);//0 1 4
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(2,3);
		g.addEdge(3,4);
		g.addEdge(4,1);
		g.PrintGraph();
		
		g.BFS(0);
		System.out.println();
		g.DFS(0);
		
	
	
	}

}
