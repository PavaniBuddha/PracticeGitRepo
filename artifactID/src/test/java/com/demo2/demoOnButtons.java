package com.demo2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demoOnButtons {
	public String baseurl = "https://www.browserstack.com";
	String driverpath = "C:/Users/jayak/git/PracticeGitRepo/artifactID/lib/chromedriver.exe";
	public static WebDriver driver;
	
	@BeforeTest
	void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	@Test
	void mouseHov() 
	{
		//driver.get("https://www.browserstack.com");
		WebElement products = driver.findElement(By.id("product-menu-toggle"));
		Actions mousehover = new Actions(driver);
		mousehover.moveToElement(products).perform();
		/*
		 * WebElement links =
		 * driver.findElement(By.xpath("//*[@id=\"product-menu-dropdown\"]/div/ul"));
		 * Thread.sleep(3000);
		 */
		/*
		 * Dimension totalcount = links.getSize(); for(int i=0; i<totalcount; i++ ) {
		 * WebElement ele = links.get(i); String text = ele.getAttribute("innerHTML");
		 * boolean status = ele.isEnabled();
		 * System.out.println("The link name is"+text+"and"+status);
		 * if(text.equalsIgnoreCase("App Automate")) { ele.click(); break; } }
		 */
		
	}
	
	@Test
	void doublclk()
	{
	System.out.print("This is a Method\n");	
	}
	
	@AfterTest
	void closeBrowser()
	{
		driver.quit();

}
}
