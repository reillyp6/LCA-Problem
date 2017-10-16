import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryLCATest {

	@Test
	public void findLCATest() {
		
		BinaryLCA tree = new BinaryLCA();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.right.right = new Node(4);
		tree.root.right.left = new Node(5);
		
		assertEquals("Test findLCA method works correctly",3,tree.findLCA(4,5).value);
		
	}
	
	

}
