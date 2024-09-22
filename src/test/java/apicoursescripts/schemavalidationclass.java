package apicoursescripts;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
// schema.json should be given by developer 
// it should not be copied from json to schema converter becos, if actual response body schema changes then it will not show as failed which is incorrect
// Schema to use cannot be null - error comes - if schema.json is not available in class path

public class schemavalidationclass {
@Test
	public  void method1() {

		baseURI="https://reqres.in/";
		given()
			.get("api/users?page=2").
		then()
			.log().body()
			.assertThat()
			.body(matchesJsonSchemaInClasspath("schema.json"));
	

	}



}
