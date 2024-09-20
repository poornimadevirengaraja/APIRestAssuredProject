package getrequest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class getrequest {
	@Test
	public void method1() {
		baseURI="https://reqres.in/";
		given().
			get("api/users/2").
		then().			
			statusCode(200).
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
}
