package authentication;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

/*Important things to note:
	Here it should be given in Headers 
	given().headers("Authorization","Bearer token").*/
	
public class bearertoken_class {

	@Test
	public void bearertoken() {
		
		given().
	    	headers("Authorization","Bearer038f2fd3b9431b5fb34a889c9b4bf8eb29bcb72b16ea02535a151106bf94eff7").
		when().
			get("https://gorest.co.in/public/v2/users").
		then().
			statusCode(200).
			log().body();
		
	}
}
