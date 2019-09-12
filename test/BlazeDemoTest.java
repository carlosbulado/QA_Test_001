import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
		// Wait 1 second before continue the test case
        Thread.sleep(1000);
	}

	@After
	public void tearDown() throws Exception
	{
		// Wait 4 seconds before close the browser
		Thread.sleep(4000);
        driver.close();
	}

	@Test
	public void Test_TC1_DepartureCities()
	{
        WebElement departuresSelect = driver.findElement(By.name("fromPort"));
        int quant_opts_departure = departuresSelect.findElements(By.tagName("option")).size();
        assertEquals(7, quant_opts_departure);
	}

	@Test
	public void Test_TC2_VirginAmericaFligthNumber12Details() throws InterruptedException 
	{
        WebElement findFlightsBtn = driver.findElement(By.tagName("input"));
        findFlightsBtn.click();
		Thread.sleep(1000);
		
		WebElement virginAmericaNumber12Details = driver.findElement(By.name("VA12"));
		WebElement parentVirginAmericaNumber12Details = (WebElement) ((JavascriptExecutor) driver).executeScript(
                "return arguments[0].parentNode;", virginAmericaNumber12Details);
		List<WebElement> details = parentVirginAmericaNumber12Details.findElements(By.tagName("td"));
		String departTime = details.get(3).getText();
		String arriveTime = details.get(4).getText();
		String cost = details.get(5).getText();
		
		assertEquals("11:23 AM", departTime);
		assertEquals("1:45 PM", arriveTime);
		assertEquals("$765.32", cost);
	}

	@Test
	public void Test_TC3_PurchaseConfirmationPage()
	{
		
	}

}
