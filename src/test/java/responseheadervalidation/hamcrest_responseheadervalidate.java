package responseheadervalidation;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

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
}
