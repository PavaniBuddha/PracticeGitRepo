package grpID.artifactID;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sampleTestNG {

	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/jayak/eclipse-workspace_July 18_2020/artifactID/lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		System.out.println("the tiggered app is :" + driver.getTitle());
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nintendo Switch console", Keys.ENTER);
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();

		driver.findElement(By.xpath("//*[@id='search']//div[3]//h2/a/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']")).click();
		Thread.sleep(3000);

		
		/*
		 * WebElement signIn = driver.findElement(By.id("nav-link-accountList"));
		 * signIn.click(); driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys(
		 * "jayakumardadi@gmail.com");
		 * driver.findElement(By.xpath("//*[@type='submit']")).click();
		 * Thread.sleep(5000);
		 * driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("*******");
		 * driver.findElement(By.id("signInSubmit")).click();
		 */
		 Thread.sleep(5000);
		driver.findElement(By.id("nav-cart-count")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
