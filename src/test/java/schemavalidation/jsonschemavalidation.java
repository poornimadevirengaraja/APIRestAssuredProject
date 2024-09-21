package schemavalidation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
//this import is important for schema validation in target folder > classpath >schema.json file created with response schema
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

//get the schema from developer
//to learning purpose of schema response https://www.liquid-technologies.com/online-json-to-schema-converter  
//Add json schema validator to pom.xml

public class jsonschemavalidation {
	
@Test
	public void Method1() {
	
	baseURI="https://reqres.in/";
	given().
	when().
	get("api/users?page=2").
	then().
	assertThat(). // important line
	body(matchesJsonSchemaInClasspath("schema.json")); // important line
	
		
	}
}
