package authentication;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

/*Important :
	auth().oauth("consumerkey","consumersecret","accesstoken","secrettoken").*/

public class oauth1oauth2_class {
@Test	
public void oauth() {
	given().
	auth().oauth("consumerkey","consumersecret","accesstoken","secrettoken").
	when().
		get("https://postman-echo.com/basic-auth").
	then().
		statusCode(200).
		log().body();

}
}