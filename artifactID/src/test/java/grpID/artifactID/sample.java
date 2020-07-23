package grpID.artifactID;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:/Users/jayak/eclipse-workspace_July 18_2020/artifactID/lib/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.youtube.com");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    WebElement Search = driver.findElement(By.xpath("//input[@id='search']"));
    Search.sendKeys("Biriyani recipes", Keys.ENTER);
    Actions action = new Actions(driver);
    WebElement select = driver.findElement(By.xpath("//*[@title='SIMPLE CHICKEN BIRYANI FOR BEGINNERS | CHICKEN BIRYANI RECIPE FOR BACHELORS']"));
    //action.moveToElement(select).build().perform();
    action.moveToElement(select).moveToElement( driver.findElement(By.xpath("//*[@title='SIMPLE CHICKEN BIRYANI FOR BEGINNERS | CHICKEN BIRYANI RECIPE FOR BACHELORS']")));
    select.click();
    Thread.sleep(5000);
    driver.close();
	}

}
