package restAssuredAPIProject;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class TC03_Get_RestAssuredAPI {
  
	@Test
	
	void amazon()
	{
		RestAssured.baseURI = "https://www.amazon.com";
		
		RequestSpecification httpprequest = RestAssured.given();
		
		Response response = httpprequest.request(Method.GET,"/s?k=womens+tops&crid=X9L8E9I05DS0&sprefix=wome%2Caps%2C179&ref=nb_sb_ss_i_1_4");
		
		//capture details of headers from response
				String contentType = response.header("Content-Type");
				System.out.println("The content type is "+contentType);
				Assert.assertEquals(contentType, "text/html;charset=UTF-8");
				
				String contentEncoding = response.header("Content-Encoding");
				System.out.println("The content type is "+contentEncoding);
				Assert.assertEquals(contentEncoding, "gzip");
		
				/*
				 * String responseBody = response.getBody().asString();
				 * System.out.println("Response Body is "+responseBody);
				 */
		int statuscode = response.getStatusCode();
		System.out.println("The status code is "+statuscode);
	    Assert.assertEquals(statuscode, 200);
	   
	
	
	}
  
}
