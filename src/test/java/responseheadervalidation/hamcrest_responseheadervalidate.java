package responseheadervalidation;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;

//validate header without getting in Response
public class hamcrest_responseheadervalidate {
	@Test
	public void method1() {
		baseURI="https://reqres.in/";
		given().
			get("api/users/2").
		then().
		// To validate Header name and its value
			header("Content-Type","application/json; charset=utf-8").
			header("Server",containsString("cloudflare")).
			header("Content-Type",equalTo("application/json; charset=utf-8")).
			log().all();
			
		
	}
	
	// validate header after getting in response and using Assert
	@Test
	public void method2() {		
		Response res=given().get("https://reqres.in/api/users/2");		
		// To validate Header name and its value
		Assert.assertEquals(res.header("Server"),"cloudflare");
	
		
			
		
	}
}
