import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryLCATest {

	@Test
	public void findLCATest1() 
	{
		BinaryLCA<Integer, Integer> bst = new BinaryLCA<Integer, Integer>();
		 bst.put(7, 7);   //        _7_
	     bst.put(8, 8);   //      /     \
	     bst.put(3, 3);   //    _3_      8
	     bst.put(1, 1);   //  /     \
	     bst.put(2, 2);   // 1       6
	     bst.put(6, 6);   //  \     / 
	     bst.put(4, 4);   //   2   4          
	     
	     assertEquals("Test findLCA method works correctly","7",bst.findLCA(3,8).toString());
	     assertEquals("Test findLCA method works correctly","3",bst.findLCA(4,1).toString());
	}
	
	@Test
	public void testNullCase()
	{
		BinaryLCA<Integer, Integer> bst = new BinaryLCA<Integer, Integer>();
		assertNull("Test findLCA method works correctly for the null case",bst.findLCA(3,8));
	}
	
	@Test
	public void testForNonPresentNodes()
	{
		BinaryLCA<Integer, Integer> bst = new BinaryLCA<Integer, Integer>();
		 bst.put(7, 7);   //        _7_
	     bst.put(8, 8);   //      /     \
	     bst.put(3, 3);   //    _3_      8
	     bst.put(1, 1);   //  /     \
	     bst.put(2, 2);   // 1       6
	     bst.put(6, 6);   //  \     / 
	     bst.put(4, 4);   //   2   4   
	     
	     assertNull("Test findLCA method works when one of the passed values is not present",bst.findLCA(7,5));
	     assertNull("Test findLCA method works when both of the passed values are not present",bst.findLCA(9,5));
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
		 BinaryLCA<Integer, Integer> bst = new BinaryLCA<Integer, Integer>();
		 bst.put(7, 7);       
	     bst.put(8, 8);       
	     bst.put(3, 3);
	     assertNull(bst.get(9));
	     assertEquals("check function works correctly and returns correct value", "7", bst.get(7).toString());
	 }
	 
	 @Test
	 public void testContains()
	 {
		 BinaryLCA<Integer, Integer> bst = new BinaryLCA<Integer, Integer>();
		 assertFalse("check function works for empty list", bst.contains(1));
		 bst.put(7, 7);       
	     bst.put(8, 8);       
	     bst.put(3, 3);
	     assertTrue("check function works correctly",bst.contains(7));
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
	 
	 @Test 
	 public void testPrintKeysInOrder()
	 {
		 BinaryLCA<Integer, Integer> bst = new BinaryLCA<Integer, Integer>();
		 assertEquals("Test for empty tree", "()", bst.printKeysInOrder());
		 
		 bst.put(7, 7);       
	     bst.put(8, 8);       
	     bst.put(3, 3);       
	     bst.put(1, 1);      
	     bst.put(2, 2);
	     bst.put(6, 6);
	     bst.put(4, 4);
	     bst.put(5, 5);
	     
	     assertEquals("test method works for non-empty tree",
	             "(((()1(()2()))3((()4(()5()))6()))7(()8()))", bst.printKeysInOrder()); 
	 }
	
	
	
	

}
