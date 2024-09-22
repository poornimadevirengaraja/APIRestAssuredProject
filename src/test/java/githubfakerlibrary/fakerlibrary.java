package githubfakerlibrary;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;


/*
 * 1) java faker dependency in pom.xml
 * 2) import com.github.javafaker.Faker; 
 * 3)faker class object to be created and call the faker objects
 */

public class fakerlibrary {
@Test
	public void fakermethod() {
	Faker fa=new Faker();
	JSONObject rb=new JSONObject();
	rb.put("name", fa.name().firstName()); // faker first name taken from faker library
	rb.put("Job",fa.job().title()); // faker job title taken from faker library
	
	baseURI="https://reqres.in/";
	given().
		body(rb.toString()). //Body:{"empty":false,"mapType":"java.util.HashMap"} wrong input so you need to always use .tostring() for jsonobject
		log().body().
	when().
		post("api/users").
	then().	
		statusCode(201).
		log().body();	
		
		
	}
}
