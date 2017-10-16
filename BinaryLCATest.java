import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryLCATest {

	@Test
	public void findLCATest1() {
		
		BinaryLCA tree = new BinaryLCA();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.right.right = new Node(4);
		tree.root.right.left = new Node(5);
		
		assertEquals("Test findLCA method works correctly",3,tree.findLCA(4,5).value);	
	}
	
	@Test
	public void overrideDataTest()
	{
		BinaryLCA tree = new BinaryLCA();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.right = new Node(6);
		tree.root.left = new Node (4);
		
		assertEquals("Test findLCA works correcty after overriding data in tree", 1, tree.findLCA(6,4).value);
	}
	
	@Test
	public void testNullCase()
	{
		BinaryLCA tree = new BinaryLCA();
		
		assertNull("Test method returns null for an empty tree", tree.findLCA(1,2));
	}
	
	
	
	

}
