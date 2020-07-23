package grpID.artifactID;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentReportBaseCode {
	public static WebDriver driver;

	public static void main(String[] args) {
		// Start reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		
		//create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		//creates a toggle for the given test, adds all log events under it
		ExtentTest test1 = extent.createTest("Google search test", "This describes how to do google search");
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/jayak/eclipse-workspace_July 18_2020/artifactID/lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//log(Status,details)
		test1.log(Status.INFO, "This step shows usage of log(status, details)");
		driver.get("https://www.google.com");
		test1.pass("Navigated to google.com");
		driver.findElement(By.name("q")).sendKeys("Automation Tools", Keys.ENTER);
		test1.pass("Entered text in searchbox ");
		driver.quit();
		test1.pass("closed the browser");
		
		
		//info(details)
		test1.info("This step shows usage of info(details)");
		
		/*
		 * //log with snapshot test1.fail("details",
		 * MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		 * 
		 * //test with snapshot test1.addScreenCaptureFromPath("screenshot.png");
		 */
		
		
        ExtentTest test2 = extent.createTest("Google search test", "This describes how to do google search");
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/jayak/eclipse-workspace_July 18_2020/artifactID/lib/chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		
		//log(Status,details)
		test2.log(Status.INFO, "This step shows usage of log(status, details)");
		driver1.get("https://www.google.com");
		test2.pass("Navigated to google.com");
		driver1.findElement(By.name("q")).sendKeys("Automation Tools", Keys.ENTER);
		test2.fail("Entered text in searchbox ");
		driver1.quit();
		test2.pass("closed the browser");
		
		
		//info(details)
		test2.info("This step shows usage of info(details)");
		
		//calling flush writes everything to the log file
		extent.flush();
		
		
		
		
       
	}

}
