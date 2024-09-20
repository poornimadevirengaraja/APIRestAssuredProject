package responseheadervalidation;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class hamcrest_responseheadervalidate {
	@Test
	public void method3() {
		baseURI="https://reqres.in/";
		given().
			get("api/users/2").
		then().
			header("Content-Type","application/json; charset=utf-8").
			header("Server",containsString("cloudflare")).
			statusCode(200).
			statusLine("HTTP/1.1 200 OK")
			.time(lessThan(1000L)).
			log().all();
			
		
	}
}
