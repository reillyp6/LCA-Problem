

public class BinaryLCA<Key extends Comparable<Key>, Value> 
{
	
    private Node root;             // root of BST

   
    private class Node 
    {
        private Key key;           // sorted by key
        private Value val;         // associated data
        private Node left, right;  // left and right subtrees
        private int N;             // number of nodes in subtree

        public Node(Key key, Value val, int N) {
            this.key = key;
            this.val = val;
            this.N = N;
        }
    }

    //are there any nodes in the tree?
    public boolean isEmpty() 
    {
    	return size(root) == 0; 
    }

    //returns the number of key/value pairs that are present in tree
    private int size(Node x) 
    {
    	if (x == null) return 0;
        else return x.N;
    }

    //searches for node with given key value
    //return true if found or false otherwise
    public boolean contains(Key key) 
    {
        return get(key) != null;
    }
    
    //returns the Lowest Common Ancestor for 2 passed values
    public Value findLCA(Key key1, Key key2)
    {
    	return findLCA(root, key1, key2);
    }
    
    private Value findLCA(Node node, Key key1, Key key2)
    {
    	//if empty tree
		 if (node == null)
			 return null;
		 
		 //keys aren't present in tree
		 if(contains(key1)==false || contains(key2)==false)
			 return null;
	 
	     if (node.key == key1 || node.key == key2)
	    	 return node.val;
	
	     Value left_lca = findLCA(node.left, key1, key2);
	     Value right_lca = findLCA(node.right, key1, key2);
	
	     if (left_lca!=null && right_lca!=null)
	    	 return node.val;
	 
	     return (left_lca != null) ? left_lca : right_lca;
    }

    //returns the value associated with the passed key
    public Value get(Key key)
    { 
    	return get(root, key);
    }

    private Value get(Node x, Key key) 
    {
    	if (x == null)
        {
        	return null;
       	}
        int cmp = key.compareTo(x.key);
        if(cmp < 0)
        {
        	return get(x.left, key);
       	}
        else if (cmp > 0)
        {
        	 return get(x.right, key);
        }
        else
        {
        	return x.val;
       	}
    }

   //inserts a key/value pair into tree
    public void put(Key key, Value val) 
    {
        root = put(root, key, val);
    }

    private Node put(Node x, Key key, Value val) 
    {
    	if (x == null) return new Node(key, val, 1);
        int cmp = key.compareTo(x.key);
        if      (cmp < 0) x.left  = put(x.left,  key, val);
        else if (cmp > 0) x.right = put(x.right, key, val);
        else              x.val   = val;
        x.N = 1 + size(x.left) + size(x.right);
        return x;
    }
    
    //returns a String with all keys of tree in order
    public String printKeysInOrder() 
    {
      if (isEmpty()) 
	  {
    	  return "()";
      }

      return printKeysInOrder(root);
    }
    
    private String printKeysInOrder(Node a)
    {
    	if(a == null)
    	{
    		return "()";
    	}
    	
    	else
    	{
    		return "(" + (printKeysInOrder(a.left)) + (a.key.toString()) + printKeysInOrder(a.right) + ")";
    	}
    }
    
}
