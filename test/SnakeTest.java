import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class SnakeTest
{
	protected Snake peter;
	protected Snake takis;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception
	{
		peter = new Snake("Peter", 10, "coffee");
		takis = new Snake("Takis", 80, "vegetables");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void Test_TC1_TestIsHealthFunction()
	{
		
	}

	@Test
	public void Test_TC2_TestFitsInCageFunction()
	{
		
	}

}
