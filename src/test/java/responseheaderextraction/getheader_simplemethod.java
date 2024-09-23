package responseheaderextraction;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class getheader_simplemethod {
	@Test
	public void method1() {
		baseURI="https://reqres.in/";
		given().
			get("api/users/2").
		then().	
			header("Content-Type", "application/json; charset=utf-8").
			header("Content-Type", equalTo("application/json; charset=utf-8")).
			log().all();
		
		
	}
}
