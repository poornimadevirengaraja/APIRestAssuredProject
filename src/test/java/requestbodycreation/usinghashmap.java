package requestbodycreation;
import static io.restassured.RestAssured.*;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

/*RequestBody to be created using hashmap is like below:
{
"name":"poornima",
"job":"QATester"
}*/

/*Error:
java.lang.IllegalArgumentException: Cannot serialize because no JSON or XML serializer found in classpath.
To avoid this serialization error You need to add dependency > jackson databind  to pom.xml*/

public class usinghashmap {
@Test	
public void method1() {
	
	Map<String,Object> rb=new HashMap<String,Object>();
	rb.put("name", "poornima");
	rb.put("job", "QATester");
	System.out.println(rb);
	
	baseURI="https://reqres.in/";
	given().
		body(rb).
		log().body().
	when().
		post("api/users").
	then().
		statusCode(201).
		log().body();	
}

}
