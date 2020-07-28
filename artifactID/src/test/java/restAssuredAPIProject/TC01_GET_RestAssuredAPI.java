package restAssuredAPIProject;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC01_GET_RestAssuredAPI {
  //API example
	@Test
	void getWeatherDetails()
	{   
		//specify base URI
		RestAssured.baseURI = "http://restapi.demoq.com/utilities/weather/city";
	
	   //Request object
		RequestSpecification httpRequest = RestAssured.given();
		
		//Response object
		Response response = httpRequest.request(Method.GET,"/Hyderabad");
		
		//Print response in console window
		String responseBody = response.getBody().asString();
		
		//Get statuscode and status line for status validation
		//statuscode verfication
		int statuscode = response.getStatusCode();
		System.out.println("The status code is "+statuscode);
		Assert.assertEquals(statuscode,200);
		
		//statusline verification
		String statusline = response.getStatusLine();
		System.out.println("The status line is "+statusline);
		Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
		
}
}
