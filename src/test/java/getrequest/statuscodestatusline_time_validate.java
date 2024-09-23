package getrequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

public class statuscodestatusline_time_validate {
	@Test
	public void method1() {
		baseURI="https://reqres.in/";
		given().
			get("api/users/2").
		then().	
			// get statuscode , time and status line validation
			statusCode(200).  
			statusLine("HTTP/1.1 200 OK").
			//time(lessThan(1000L)).
			log().all();
		
		
	}
	
	@Test
	public void method2() {
		baseURI="https://reqres.in/";
		given().
		when().
			get("api/users/2").
		then().			
			statusCode(200).
			log().all();
			//log().body().
			//log().headers();
		
	}
	
   // Using Jsonpath parsing and validating response Object
	@Test
	public void method3() {
	
		Response res=given().when().get("https://reqres.in/api/users/1");
		Assert.assertEquals(res.jsonPath().get("data.email").toString(),"george.bluth@reqres.in");
		
	}
	
	// Using jsonObject parsing and validating response Objects
	@Test
	public void method4() {
	
		Response res=given().get("https://reqres.in/api/users/1");
		JSONObject rb = new JSONObject(res.asString());
		Assert.assertEquals(rb.getJSONObject("data").get("email"),"george.bluth@reqres.in");
		
	}
	// Using jsonObject parsing and validating response Array and its corresponding Objects
	@Test
	public void method5() {
	
		Response res = given().get("https://reqres.in/api/users?page=2");
		JSONObject rb = new JSONObject(res.asString());
		Assert.assertEquals(rb.getJSONArray("data").getJSONObject(3).get("email"),"byron.fields@reqres.in");
		
	}
	

}
