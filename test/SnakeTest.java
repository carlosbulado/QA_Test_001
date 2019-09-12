import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SnakeTest
{
	protected Snake peter;
	protected Snake takis;
	
	@Before
	public void setUp() throws Exception
	{
		peter = new Snake("Peter", 10, "coffee");
		takis = new Snake("Takis", 80, "vegetables");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Test_TC1_TestIsHealthFunction()
	{
		// Looking at isHealthy function, a snake is healthy when its favorite food is vegetables
		assertTrue(takis.isHealthy());
		assertFalse(peter.isHealthy());
	}

	@Test
	public void Test_TC2_TestFitsInCageFunction()
	{
		// Looking at fitsInCage, it receive a param which is the cage lenght, this test should be correct if
		//    the snake's lenght is less than cage's length ONLY
		assertTrue(peter.fitsInCage(11));
		assertTrue(takis.fitsInCage(81));
		
		assertFalse(peter.fitsInCage(10));
		assertFalse(takis.fitsInCage(80));

		assertFalse(peter.fitsInCage(9));
		assertFalse(takis.fitsInCage(79));
	}

}
