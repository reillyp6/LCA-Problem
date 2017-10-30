import java.util.ArrayList;

import DAG_LCA.Node;

public class  DAG
	{
	    public class Node
	    {
	        int nodeId;
	        Node next;
	        
	        public Node(int id)
	        {
	            this.nodeId = id;
	        }
	    }
	    
	    ArrayList<Node> nodeList;
	    
	    public DAG()
	    {
	        nodeList = new ArrayList<Node>();
	    }
	    
	    public Node findLCA (int id1, int id2)
	    {
	    	
	    }
	    
	    public Node addNode(int id)
	    {
	    	Node node = new Node(id);
	        nodeList.add(0, node);
	
	        return nodeList.get(0);
	    }
	    
	    
	    public void addEdge(int id1, int id2)
	    {
	    	
	    }
	    
	    public Node getNode(int id)
	    {
	    	
	    }
	    
	    public boolean contains(int id)
	    {
	    	if(getNode(id)== null)
	    		return false;
	    	
	    	return true;
	    }
	}
  
