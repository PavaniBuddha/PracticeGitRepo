package grpID.artifactID;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class shantest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:/Users/jayak/eclipse-workspace_July 18_2020/artifactID/lib/chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.youtube.com");
		    driver.manage().window().maximize();
		    WebElement Search = driver.findElement(By.xpath("//input[@id='search']"));
		    Search.sendKeys("Flamingo", Keys.ENTER);
		    WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		    Actions action = new Actions(driver);
		    
		    WebElement select = driver.findElement(By.xpath("//*[@title='Roblox games keep banning me...']"));
		    //action.moveToElement(select).build().perform();
		    action.moveToElement(select).moveToElement( driver.findElement(By.xpath("//*[@title='Roblox games keep banning me...']")));
		    select.click();
		    Thread.sleep(5000);
		     driver.findElement(By.id("ad-text:9")).click();
		     Thread.sleep(15000);
	}

}
