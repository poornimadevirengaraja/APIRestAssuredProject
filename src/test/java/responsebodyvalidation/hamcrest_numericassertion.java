package responsebodyvalidation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class hamcrest_numericassertion {
	@Test
	public void method1() {
		baseURI="https://reqres.in/";
		given().
			get("api/users?page=2").
		then().
			body("data.id[0]",equalTo(7)).
			statusCode(200).
			log().all();	
	}
	
	@Test
	public void method2() {
		baseURI="https://reqres.in/";
		given().
			get("api/users?page=2").
		then().
			body("data.id[1]",lessThan(9)).
			statusCode(200).
			log().all();	
	}
	
	@Test
	public void method3() {
		baseURI="https://reqres.in/";
		given().
			get("api/users?page=2").
		then().
			body("data.id[2]",greaterThan(7)).
			statusCode(200).
			log().all();	
	}
	
	@Test
	public void method4() {
		baseURI="https://reqres.in/";
		given().
			get("api/users?page=2").
		then().
			body("data.id[3]",greaterThanOrEqualTo(10)).
			statusCode(200).
			log().all();	
	}
}