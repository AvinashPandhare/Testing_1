package test_Practice;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Simple_Get {
	
	@Test
	public void simpleGetTest() 
	{
		
		//Step 1=give the Base URI
		RestAssured.baseURI="https://reqres.in/api/users";
		
		//Step 2=Create an object of RequestSpecification class to create request using that object
		RequestSpecification requester=RestAssured.given();
		
		//Step 3="equester.request(Method.GET, "/1");"this the request
		//With the return type Response , so created an object of Response class and all the responses are stored within it
		Response response1=requester.request(Method.GET, "/1");
		
		//Step 4 We get All Headers
		Headers headers=response1.getHeaders();
		
		
		
		for(Header zzz:headers)
		{
			System.out.println(zzz.getName()+"     "+zzz.getValue());
		}
		
		//Step 5=We get single Header
		String contentType=response1.getHeader("Content-Type");
		System.out.println(contentType);
		
		//Step 6=We get StatusCode
		int StatusCode=response1.getStatusCode();
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		
		System.out.println(StatusCode);
		
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		
		//Step 7=We get StatusLine
		String StatusLine=response1.getStatusLine();
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		
		System.out.println(StatusLine);
		
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			
		//Step 8=We get body
		ResponseBody a=response1.body();
		 
		String body=a.asString();
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		
		System.out.println(body);
		
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		
	}

}
