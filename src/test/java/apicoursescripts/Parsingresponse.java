package apicoursescripts;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Parsingresponse {
	@Test
	public void method1() {
		given().
		when().
		get("https://reqres.in/api/users?page=2").
		then().
		statusCode(200).
		header("X-Powered-By", "Express").
		body("data[3].first_name",equalTo("Byron")).
		body("data[4].id",equalTo(11));
		
		//Parsing the response without storing in Response variable
		//Parsing simple way of each key and value or cookies key and value or parsing body individually with help of jsonpathfinder
		
	}

	
	
}
