package grpID.artifactID;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class practiceAssertions {
	
	@Test
	public void assertTest()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/jayak/eclipse-workspace_July 18_2020/artifactID/lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.browserstack.com");
		String ActualTitle = driver.getTitle();
		String verifyAssertNull = null;
		String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		//Boolean verifyAssertNotNull = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform| BrowserStack");
		Boolean verifyTitleIsPresent = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		Boolean verifyTitleIsChanged = driver.getTitle().equalsIgnoreCase("Testing Platform | Browser Stack");
		  
		 // assertEquals(ActualTitle, ExpectedTitle);
	      assertTrue(true, null); 
	      
			// Below expected is true but found false -->test fails.
	     // assertTrue(false, ExpectedTitle);
	      
			// Below expected should not equal to actual but found equal . so test fails.
	      //assertNotEquals(ExpectedTitle, ActualTitle);
	      
			 // Below assert expected is true and actual is also true -->test pass.
	            assertTrue(verifyTitleIsPresent); 
	      
			// Below expected is true and actual  defined verifyTitleIsChanged is true -->test pass.
	            assertTrue(verifyTitleIsChanged);
	      
	      // Below assert expected is not null and actual is verifyTitleIsPresent -->test pass.
			 assertNotNull(verifyTitleIsPresent); 
			
			 // Below assert expected is null but found true --> test fails.
			// assertNull(verifyTitleIsPresent); 
			
			 // Below assert expected is null and actual string defined as null --> testcase pass.
			 assertNull(verifyAssertNull);
			 
		driver.close();
		
	}

}
