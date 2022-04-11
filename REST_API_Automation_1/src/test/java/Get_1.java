import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_1 {

	
	@Test
	public void firstTest() {
		
	RestAssured.baseURI="https://reqres.in/api/unknown/2";
	
	RequestSpecification Variable1=RestAssured.given();
	
	Response Variable2=Variable1.request(Method.GET);
	
	System.out.println("Code hoga:"+Variable2.getStatusCode());
	
	System.out.println("Status line hoga:"+Variable2.getStatusLine());
	
	
	}
}
