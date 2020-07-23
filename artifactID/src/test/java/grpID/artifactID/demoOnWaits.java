package grpID.artifactID;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class demoOnWaits {
	WebDriver driver;
	
	/*
	 * @BeforeTest public void launchBrowser() {
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:/Users/jayak/eclipse-workspace_July 18_2020/artifactID/lib/chromedriver.exe"
	 * ); }
	 */
	
	@Test(priority = 1)
	public void testImplicitWait()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/jayak/eclipse-workspace_July 18_2020/artifactID/lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.close();
		
	}
	
	@Test(groups = {"smoke" , "regression"} , priority = 2)
	public void testExplictWait()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/jayak/eclipse-workspace_July 18_2020/artifactID/lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Automation", Keys.ENTER);
		WebDriverWait Wait = new WebDriverWait(driver, 75);
		Wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("search"))); //'q' represents path of search element.
		driver.close();
	}
	
	/*
	 * @Test(groups = {"smoke" , "regression"} , priority = 1) public void
	 * testFluentWait() { driver.get("https://www.facebook.com");
	 * FluentWait<WebDriver> wait = new
	 * FluentWait<WebDriver>(driver).withTimeout(120 ,
	 * TimeUnit.SECONDS).pollingEvery(10,
	 * TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	 * 
	 * }
	 */
	
	/*
	 * @AfterTest public void closeBrowser() { driver.quit(); }
	 */
}

