package restAssuredAPIProject;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC02_POST_RestAssuredAPI {
   // create a new record with the params
	@Test
	void RegistrationSuccessful()
	{
		//specify base URI
		RestAssured.baseURI = "http://restapi.demoqa.com/customer";
		
		//Request object
		RequestSpecification httpRequest = RestAssured.given();
		
		//Request Payload(body) sending along with POST request
		JSONObject requestParams = new JSONObject();
		
		requestParams.put("FirstName", "JohnXYZ");
		requestParams.put("Lastname", "XYZJOHN");
		requestParams.put("Username", "JohnXYZ");
		requestParams.put("Password", "JohnXYZ");
		requestParams.put("Email", "JohnXYZ@gmail.com");
		
		httpRequest.header("Content-Type","application/json");
		
		//Attach the Params to server
		httpRequest.body(requestParams.toJSONString());
		
		
		///Response object and send the request
		Response response = httpRequest.request(Method.POST,"/register");
		
		//get response
		String responseBody = response.getBody().asString();
		System.out.println("The responseBody is "+responseBody);
		
		int statuscode = response.getStatusCode();
		System.out.println("The statuscode is "+statuscode);
		Assert.assertEquals(statuscode,200);
		
		/*
		 * String statusline = response.getStatusLine();
		 * System.out.println("The statusline is "+statusline);
		 * Assert.assertEquals("HTTP/1.1 200 OK", statusline);
		 */
		
		String successcode = response.jsonPath().get("SuccessCode");
		Assert.assertEquals(successcode,"Operation_Code");
				
		
	}
}
