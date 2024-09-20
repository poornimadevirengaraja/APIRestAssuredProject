package requestbodycreation;

import org.testng.annotations.Test;
import io.restassured.RestAssured.*;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.JSONObject;
/*efficient 
faster
no need of knowledge of collection like hashmap
.tostring() is very important here to give */

public class usingjsonobjectlibrary {
@Test
	public void method() {
		JSONObject rb=new JSONObject();
		rb.put("name", "poornima");
		rb.put("job", "QATester");
		System.out.println(rb);
		
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
