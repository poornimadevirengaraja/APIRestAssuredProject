package responsebodyvalidation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class hamcrest_collectionassertion {
	// Numeric Assertions - Response Body validations using hamcrest.matchers
	@Test
	public void method1() {
		baseURI="https://reqres.in/";
		given().
			get("api/users?page=2").
		then().
			body("data.id",hasItem(10)).
			statusCode(200).
			log().all();		
	}

	@Test
	public void method2() {
		baseURI="https://reqres.in/";
		given().
			get("api/users?page=2").
		then().
			body("data.id",hasItems(9,10,12)).
			statusCode(200).
			log().all();		
	}

	@Test
	public void method3() {
		baseURI="https://reqres.in/";
		given().
			get("api/users?page=2").
		then().
			body("data[0]",hasKey("email")).
			statusCode(200).
			log().all();		
	}
	
	@Test
	public void method4() {
		baseURI="https://reqres.in/";
		given().
			get("api/users?page=2").
		then().
			body("data[1]",hasValue("Lindsay")).
			statusCode(200).
			log().all();		
	}
	@Test
	public void method5() {
		baseURI="https://reqres.in/";
		given().
			get("api/users?page=2").
		then().
			body("data[2]",hasEntry("email","tobias.funke@reqres.in")).
			statusCode(200).
			log().all();		
	}
}
