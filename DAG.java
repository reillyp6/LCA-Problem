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
	    	boolean node1Found = false, node2Found = false;
	        Node node1  = null, node2 = null;
	        
	        for (int i = 0; i < nodeList.size(); i++)
	        {
	            if (nodeList.get(i).nodeId == id1)
	            {
	                node1Found = true;
	                node1 = nodeList.get(i);
	            }
	            if (nodeList.get(i).nodeId == id2)
	            {
	                node2Found = true;
	                node2 = nodeList.get(i);
	            }
	            if (node1Found && node2Found) break;
	        }
	        
	        
	        if (!node1Found)
	        {
	            node1 = this.addNode(id1); 
	        }
	        
	        if (!node2Found)
	        {
	            node2 = this.addNode(id2); 
	        }
	        
	        Node temp = new Node(id2);
	        temp.next = node1.next;
	        node1.next = temp;
	        
	        return;
	    }
	    
	    public Node getNode(int id)
	    {
	    	for (int i = 0; i < nodeList.size(); i++)
	        {
	            if (id == nodeList.get(i).nodeId)
	            {
	                return nodeList.get(i);
	            }
	            
	        }
	        
	        return null;
	    }
	    
	    public boolean contains(int id)
	    {
	    	if(getNode(id)== null)
	    		return false;
	    	
	    	return true;
	    }
	}
  
