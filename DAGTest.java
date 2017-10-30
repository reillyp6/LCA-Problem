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
		DAG dag = new DAG();
		
		dag.addEdge(1, 2);
		
		assertTrue("Test method works correctly for empty graph",(dag.contains(1)));
		assertTrue("Test method works correctly for empty graph",(dag.contains(2)));
		
		assertEquals(2, dag.nodeList.get(1).next.nodeId);
		
		dag.addNode(3);
		dag.addNode(4);
		
		dag.addEdge(1, 3);
		dag.addEdge(3, 4);
		
		assertEquals("test method works when both nodes are in graph",4, dag.nodeList.get(1).next.nodeId);
		
		dag.addEdge(4,7);
		
		assertEquals("Test method works when one of the mentioned nodes is in graph",7,dag.nodeList.get(1).next.nodeId);
	}
	
	@Test
	public void getNodeTest()
	{
		DAG dag = new DAG();
		
		dag.addEdge(1, 2);
		dag.addEdge(2, 4);
		
		assertEquals("Test getNode method works correctly", 1, dag.getNode(1).nodeId);
	}
	
	@Test
	public void findLCATest()
	{
		DAG dag = new DAG();
		
		dag.addEdge(1, 2);
		dag.addEdge(2, 4);
		dag.addEdge(1, 3);
		dag.addEdge(3, 5);
		
		assertEquals("Test method works correctly",3, findLCA(3, 5).nodeId);
		
	}
}
