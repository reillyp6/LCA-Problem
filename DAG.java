import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class DAG {
	private int vert;           
	private int edge;                 
	private ArrayList<Integer>[] adj;    
	private int[] indegree;        
	private boolean visited[];		
	private boolean cyclic;		
    private boolean stack[];		

	
	public DAG(int vert)
	{
		   
	}
	
	public void addEdge(int a, int b)
	{
	    	
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
        
    }

	public int indegree(int v)
	{
		
	}
	
	public int outdegree(int v)
	{
		
    }
		
	public Iterable<Integer> adj(int v)
	{ 
		return adj[v]; 
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