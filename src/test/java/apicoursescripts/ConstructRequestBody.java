package apicoursescripts;

import java.util.HashMap;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class ConstructRequestBody {
@Test
	public  void method1() {
	
	HashMap<String,Object> rb=new HashMap<String,Object>();
	rb.put("name", "morpheus");
	rb.put("job", "leader");
	System.out.println(rb);  // {name=morpheus, job=leader}
	
	/* not serialised as 
	{
    "name": "morpheus",
    "job": "leader"
	}
	*/
	
	baseURI="https://reqres.in/";
	given().		
		body(rb).      // to input the body  
		log().body().  // to log the body of the request
	when().
		post("api/users").  // post the body to this url or create new user details to this url
	then().
		statusCode(201).
		log().body().  // to log the body of the response
		log().headers(); // to log the headers of the response
		
	// This will fail initially if u dont add the jackson binder in pom.xml 
	//Cannot serialize because no JSON or XML serializer found in classpath.
	
	// after adding jackson Binder in pom.xml > body will get automatically serialized
	/*
	Body:
	{"name":"morpheus","job":"leader"}*/

	}

}
