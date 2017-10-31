import static org.junit.Assert.*;
import org.junit.Test;

public class DAGTest {
	
	@Test
	public void testDiGraph()
	{
	
	}
	
	
	@Test
	public void testAddEdge()
	{
		DAG test = new DAG(5);
		//This should work correctly
		test.addEdge(0, 1);
		
		//should do nothing
		test.addEdge(-4, -9);
		
		//This should not either as 11>5 
		test.addEdge(3, 11);
		assertEquals("Number of edges should be 1", 1, test.edge());

	}
	
	@Test
	public void testinDegree()
	{
		
	}
	
	@Test
	public void testOutDegree()
	{
			
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