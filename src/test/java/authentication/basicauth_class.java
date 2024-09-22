package authentication;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class basicauth_class {
	@Test
	public void basicauth() {
		
		given().
		auth().basic("postman","password").
		when().
			get("https://postman-echo.com/basic-auth").
		then().
			statusCode(200).
			log().body();
			
		
	}
}
