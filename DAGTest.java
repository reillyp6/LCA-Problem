import static org.junit.Assert.*;

import org.junit.Test;

public class DAGTest {

	@Test
	public void addNodeTest() 
	{
		DAG dag = new DAG();
		
		assertEquals("Test addNode method works correctly",7,dag.addNode(7).nodeId);
		assertEquals("Test addNode method works correctly",9,dag.addNode(9).nodeId);

	}
	
	@Test
	public void containsTest()
	{
		DAG dag = new DAG();
		
		assertFalse("Test method works for empty graph",dag.contains(2));
		
		dag.addNode(3);
		dag.addNode(4);
		
		dag.addEdge(1, 3);
		
		assertTrue("Test method works correctly for non-empty",dag.contains(1));
	}
	
	@Test
	public void addEdgeTest()
	{
		
	}
	
	@Test
	public void getNodeTest()
	{
		
	}
	
	@Test
	public void findLCATest()
	{
		
	}
}
