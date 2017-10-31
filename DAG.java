import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class DAG {
	private int vert;           
	private int edge;                 
	private ArrayList<Integer>[] neighbours;    
	private int[] indegree;        
	private boolean visited[];		
	private boolean cyclic;		
    private boolean stack[];		

	//constructor method for Directed Acyclic Graph
	public DAG(int vert)
	{
	    this.vert = vert;
	    this.edge = 0;
	    indegree = new int[vert];
	    visited = new boolean[vert];
	    stack = new boolean[vert];
	    neighbours = (ArrayList<Integer>[]) new ArrayList[vert];
	    for (int v = 0; v < vert; v++)
	    {
	        neighbours[v] = new ArrayList<Integer>();
	    }              
   
	}
	
	//adds edge between 2 integer values a and b
	public void addEdge(int a, int b)
	{
		if((checkVert(a)>0)&&(checkVert(b)>0))
	    {
	    	neighbours[a].add(b);
	    	indegree[b]++;
	    	edge++;
	    }
	    else
	    {
	    	System.out.println("Please enter vertices between 0 & n-1");
	    }
	
	}

	public int vert() 
	{
		return vert;	
	}
	
	public int edge() 
	{
        return edge;
    }
	
	private int checkVert(int v)
	{
		if (v < 0 || v >= vert)
        	return -1;
        else
        	return 1;
    }

	public int indegree(int v)
	{
		
	}
	
	public int outdegree(int v)
	{
		
    }
		
	public Iterable<Integer> neighbours(int v)
	{ 
		return neighbours[v]; 
	}

	public boolean isCyclic() 
	{

        return cyclic;
    }
	
	 public void findCycle(int v) 
	 {

	        
	 }
	 
	public int findLCA(int v, int w)
	{
		
	}
	
	
	
    public ArrayList<Integer> BFS(int s)
    {
       
        
    }
    
    public DAG reverse() 
    {
       
    }
}