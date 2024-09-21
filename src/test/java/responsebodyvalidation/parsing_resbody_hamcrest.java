package responsebodyvalidation;


import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class parsing_resbody_hamcrest {

	@Test
	public void method1() {
		baseURI="https://reqres.in/";
		given().
			get("api/users?page=2").
		then().
			body("data[0].first_name",equalTo("Michael")).
			body("data[4].id",equalTo(10)).
			log().all();		
	}

	
}
