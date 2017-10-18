import BinaryLCA.Node;


public class BinaryLCA<Key extends Comparable<Key>, Value> {
    private Node root;             // root of BST

    /**
     * Private node class.
     */
    private class Node {
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
    public boolean isEmpty() { return size() == 0; }

    //returns the number of key/value pairs that are present in tree
    private int size(Node x) {
        
    }

    //searches for node with given key value
    //return true if found or false otherwise
    public boolean contains(Key key) {
        return get(key) != null;
    }
    
    //returns the Lowest Common Ancestor for 2 passed values
    public Value findLCA(Key key1, Key key2)
    {
    	return findLCA(root, key1, key2);
    }
    
    private Value findLCA(Node node, Key key1, Key key2)
    {
    	
    }

    //returns the value associated with the passed key
    public Value get(Key key)
    { 
    	return get(root, key);
    }

    private Value get(Node x, Key key) {
        
    }

   //inserts a key/value pair into tree
   //if the key is already present update with new value
    public void put(Key key, Value val) {
        if (val == null) { delete(key); return; }
        root = put(root, key, val);
    }

    private Node put(Node x, Key key, Value val) {
        
    }

}
