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
		assertEquals(true, takis.isHealthy());
		assertEquals(false, peter.isHealthy());
	}

	@Test
	public void Test_TC2_TestFitsInCageFunction()
	{
		
	}

}
