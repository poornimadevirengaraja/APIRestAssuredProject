package apicoursescripts;

import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class jsonlibrary {
@Test
	public  void method1() {
	JSONObject rb = new JSONObject();
	rb.put("name", "poornima");
	rb.put("job", "TeamLeader");
	
	baseURI = "https://reqres.in/";
	given()
		.body(rb.toString())
		.log().body().
	when()
		.post("api/users").
	then()
		.statusCode(201)
		.log().body();
	}

}
