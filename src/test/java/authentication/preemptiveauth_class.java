package authentication;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
/*Important things to note:
This is same as basic auth but – Only the backstage execution or 
the mechanism will be different
 */
public class preemptiveauth_class {

	
	@Test
	public void preemptiveauth() {
		
		given().
		auth().preemptive().basic("postman","password").
		when().
			get("https://postman-echo.com/basic-auth").
		then().
			statusCode(200).
			log().body();
		
	}
}
