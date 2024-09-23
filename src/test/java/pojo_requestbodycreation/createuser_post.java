package pojo_requestbodycreation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class createuser_post {

	@Test
	public void createuser() {		
		payload payloadobject=new payload();
		baseURI="https://reqres.in/";
		given().
			body(payloadobject.dataprovider_method()). 
			log().all().
		when().
			post("api/users").
		then().
			statusCode(201).
			log().all();	
	}

}
