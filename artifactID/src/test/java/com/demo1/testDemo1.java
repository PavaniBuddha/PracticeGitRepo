package com.demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.ObjectArrays;

public class testDemo1 {

	
	@Test(dataProvider = "getallsearchitems" , enabled = true)
	public void demo1(String wordNumber , String searchKeywords) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/jayak/eclipse-workspace_July 18_2020/artifactID/lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		System.out.println("Just testing Demo1 testcase"+driver.getTitle());
		Thread.sleep(3000);
		WebElement searchbox = driver.findElement(By.id("search_query_top"));
		searchbox.sendKeys(searchKeywords , Keys.ENTER);
		Thread.sleep(3000);
		System.out.println("Just testing Data Provider , the current number "+wordNumber+"and"+searchKeywords);
		driver.quit();
		
	}

@DataProvider(name = "getallsearchitems" , parallel = false)
public Object[][] sendAllSearchKeywords()
{
	String[][] searchKeywords = {{"number1" , "Dresses"} , {"number2" , "Summer"} , {"number3", "Printed"}};
	return searchKeywords;
	
}
}
