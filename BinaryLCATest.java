import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryLCATest {

	@Test
	public void findLCATest1() {
		
		
	}
	
	@Test
	public void testNullCase()
	{

	}
	
	public void testPut() 
	 {
		BinaryLCA<Integer, Integer> bst = new BinaryLCA<Integer, Integer>();
		 
		 bst.put(7, 7);       
	     bst.put(8, 8);       
	     bst.put(3, 3);       
	     bst.put(1, 1);      
	     bst.put(2, 2);
	     bst.put(6, 6);
	     bst.put(4, 4);
	     bst.put(5, 5);
	     
	     assertEquals("test method works correctly",
	             "(((()1(()2()))3((()4(()5()))6()))7(()8()))", bst.printKeysInOrder());  
	 }
	 
	 @Test
	 public void testGet()
	 {
		 
	 }
	 
	 @Test
	 public void testContains()
	 {
		 
	 }
	 
	 
	 @Test 
	 public void testEmpty()
	 {
		 BinaryLCA<Integer, Integer> bst = new BinaryLCA<Integer, Integer>();
		 assertTrue("Check if tree is empty", bst.isEmpty());
		 
		 bst.put(7, 7);       
	     bst.put(8, 8);       
	     bst.put(3, 3);       
	     bst.put(1, 1);      
	     bst.put(2, 2); 
	     
	     assertFalse("Check function returns false for non-empty tree.", bst.isEmpty()); 
	 }
	
	
	
	

}
