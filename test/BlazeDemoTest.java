import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemoTest
{

	// Names 
	//    departure select: fromPort
	//    destination select: toPort
	// Classes
	//    find flights: btn
	

	final String CHROMEDRIVER_LOCATION = "/Users/cjb/Downloads/chromedriver";
	final String URL_TO_TEST = "http://blazedemo.com/";
	
	WebDriver driver;

	@Before
	public void setUp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_LOCATION);
        driver = new ChromeDriver();
		driver.get(URL_TO_TEST);
        Thread.sleep(1000);
	}

	@After
	public void tearDown() throws Exception
	{
		
	}

	@Test
	public void Test_TC1_DepartureCities()
	{
		
	}

	@Test
	public void Test_TC2_VirginAmericaFligthNumber12Details()
	{
		
	}

	@Test
	public void Test_TC3_PurchaseConfirmationPage()
	{
		
	}

}
