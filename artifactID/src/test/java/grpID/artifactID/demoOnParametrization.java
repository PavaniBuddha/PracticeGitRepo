package grpID.artifactID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demoOnParametrization {

	@Test
	@Parameters({"username", "password"})
	public void parameters(String userNameFromxml, String passwordFromxml) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/jayak/eclipse-workspace_July 18_2020/artifactID/lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	    driver.findElement(By.id("email")).sendKeys(userNameFromxml);
	    driver.findElement(By.id("passwd")).sendKeys(passwordFromxml);
	    Thread.sleep(3000);
	    driver.findElement(By.id("SubmitLogin")).click();
	    Thread.sleep(3000);
	    driver.quit();
		
		
	}
}
