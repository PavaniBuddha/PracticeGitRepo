package com.demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testDemo2 {
	public WebDriver driver;
	@BeforeTest
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/jayak/eclipse-workspace_July 18_2020/artifactID/lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println("Test Pass");
		
	}
 @Test(description = "Desc1 of this test" , priority = 1)
 public void sampleTest() throws InterruptedException 
 {
  WebElement email = driver.findElement(By.id("email"));
  email.sendKeys("jayapavaniudadi@gmail.com");
  Thread.sleep(3000);
	 System.out.println("Sample Test Pass");
 }
 
 @Test(description = "Desc2 of this test" , priority = 2)
 public void desctest() throws InterruptedException
 {
	 WebElement Password = driver.findElement(By.id("pass"));
	 Password.sendKeys("Jashp@6212");
	 Thread.sleep(3000);
	 System.out.println("Desc Test Pass"); 
 }
 @Test(description = "Desc3 of this test" , dependsOnMethods = {"desctest","sampleTest"} , priority = 3)
 public void signIntest() throws InterruptedException
 {
	driver.findElement(By.id("loginbutton")).click();
	Thread.sleep(5000);
	System.out.println("Desc Test Pass"); 
 }
 @AfterTest
 public void closeBrowser()
 {
	 System.out.println("Third Test Pass");
	 WebDriver driver = new ChromeDriver();
	driver.quit();
 }
}
