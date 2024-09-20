package responsebodyvalidation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class hamcrest_stringassertion {
	// string Assertions - Response Body validations using hamcrest.matchers
	@Test
	public void method2() {
		baseURI="https://reqres.in/";
		given().
			get("api/users/2").
		then().
			body("data.first_name",equalTo("Janet")).
			statusCode(200).
			//log().all().
			//log().body().
			log().headers();
		
	}

	
	@Test
	public void method3() {
		baseURI="https://reqres.in/";
		given().
			get("api/users/2").
		then().
			body("data.first_name",equalTo("Janete")).
			statusCode(200).
			//log().all().
			//log().body().
			log().headers();
		
	}
	
	@Test
	public void method4() {
		baseURI="https://reqres.in/";
		given().
			get("api/users/2").
		then().
			body("data.first_name",startsWith("J")).
			statusCode(200).
			log().all();
		
	}
	
	@Test
	public void method5() {
		baseURI="https://reqres.in/";
		given().
			get("api/users/2").
		then().
			body("data.first_name",endsWith("J")).
			statusCode(200).
			log().all();
		
	}
	
	@Test
	public void method6() {
		baseURI="https://reqres.in/";
		given().
			get("api/users/2").
		then().
			body("data.last_name",containsString("aver")).
			statusCode(200).
			log().all();
		
	}
	
	@Test
	public void method7() {
		baseURI="https://reqres.in/";
		given().
			get("api/users/2").
		then().
			body("data.last_name",equalToIgnoringCase("Weaver")).
			statusCode(200).
			log().all();
		
	}
	
}
