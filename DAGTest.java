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
	public void testIsCyclic()
	{
		
	}
	
	@Test
	public void testFindCycle()
	{
			
	}

	@Test
	public void testFindLCA() 
	{
		
	}
	
}