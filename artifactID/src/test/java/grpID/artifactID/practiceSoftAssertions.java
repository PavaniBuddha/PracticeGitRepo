package grpID.artifactID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Verify;

public class practiceSoftAssertions {

	
	@Test
	public void verifyTest()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/jayak/eclipse-workspace_July 18_2020/artifactID/lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		SoftAssert softAssert = new SoftAssert();
		driver.navigate().to("https://www.browserstack.com");
		String ActualTitle = driver.getTitle();
		String verifyAssertNull = null;
		String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		//Boolean verifyAssertNotNull = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform| BrowserStack");
		Boolean verifyTitleIsPresent = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		Boolean verifyTitleIsChanged = driver.getTitle().equalsIgnoreCase("Testing Platform | Browser Stack");
		
		 //Below two cases will fail.
		softAssert.assertNotNull(verifyAssertNull);
	    softAssert.assertTrue(false, ExpectedTitle);
	    
		// Below three cases pass.
		Verify.verifyNotNull(verifyTitleIsPresent);
	    softAssert.assertEquals(ActualTitle, ExpectedTitle);
	    softAssert.assertNotEquals(ActualTitle, verifyTitleIsChanged);
	    
	    softAssert.assertAll();
	    
	    driver.close();

}
}