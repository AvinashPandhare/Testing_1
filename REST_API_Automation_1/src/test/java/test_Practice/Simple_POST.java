package test_Practice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Simple_POST {
	
	@Test
	public void simplePost() 
	{
		
		RestAssured.baseURI="https://reqres.in/api/users";
		
		RequestSpecification requester=RestAssured.given();
		
		JSONObject obj1=new JSONObject();
		
		obj1.put("FirstName" , "Avinash");
		obj1.put("LastName" , "Pandhare");
		obj1.put("UserName" , "avinashpandhare99");
		obj1.put("Password" , "1234599");
		obj1.put("Email" , "avinashpandhare99@gmail.com");
		
		
		requester.body(obj1.toJSONString());
		
		
		Response response1=requester.request(Method.POST);
		
		//Step 8=We get body
				ResponseBody a=response1.body();
				 
				String body=a.asString();
				
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				
				
				System.out.println(body);
				
				//Step 7=We get StatusLine
				String StatusLine=response1.getStatusLine();
				
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				
				
				System.out.println(StatusLine);
				
				//Step 6=We get StatusCode
				int StatusCode=response1.getStatusCode();
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				
				
				System.out.println(StatusCode);
		
		
		
		
	}

}
