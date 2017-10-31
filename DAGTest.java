import static org.junit.Assert.*;
import org.junit.Test;

public class DAGTest {
	
	@Test
	public void testAddEdge()
	{
		DAG test = new DAG(5);
		//This should work correctly
		test.addEdge(0, 1);
		
		//should do nothing
		test.addEdge(-4, -9);
		
		//This should not do anything either as 11>5 
		test.addEdge(3, 11);
		assertEquals("Number of edges should be 1", 1, test.edge());

	}
	
	@Test
	public void testinDegree()
	{
		DAG test = new DAG(7);
		test.addEdge(0, 3);
		test.addEdge(0, 4);
		test.addEdge(1, 2);
		
		assertEquals(-1, test.indegree(8));
		assertEquals(0, test.indegree(1));
		assertEquals(1, test.indegree(2));

	}
	
	@Test
	public void testOutDegree()
	{
		DAG test = new DAG(7);
		test.addEdge(0, 2);
		test.addEdge(2, 3);
		test.addEdge(0, 3);
		
		assertEquals(2, test.outdegree(0));	
		assertEquals(2, test.outdegree(0));	
		assertEquals(1, test.outdegree(2));
	}
	
	@Test
	public void testFindCycle()
	{
		DAG cyclic = new DAG(20);
		cyclic.addEdge(0, 1);
		cyclic.addEdge(1, 2);
		cyclic.addEdge(2, 3);
		cyclic.addEdge(2, 6);
		cyclic.addEdge(3, 1);
	
		cyclic.findCycle(0);
		
		assertTrue(cyclic.isCyclic());
	}

	@Test
	public void testFindLCA() 
	{
		DAG test = new DAG(11);
		test.addEdge(0, 1);
		test.addEdge(1, 2);
		test.addEdge(2, 3);
		
		assertEquals(2, test.findLCA(2, 3));
		
	}
	
	@Test
	public void testFindLCAWhenCyclic()
	{
		DAG test2 = new DAG(6);
		test2.addEdge(0, 1);
		test2.addEdge(1, 2);
		test2.addEdge(2, 3);
		test2.addEdge(2, 6);
		test2.addEdge(3, 1);
		
		assertEquals("Test findLCA for cyclic graph", -1, test2.findLCA(2, 3));
	}
}