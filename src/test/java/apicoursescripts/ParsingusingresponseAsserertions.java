package apicoursescripts;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class ParsingusingresponseAsserertions {
@Test
	public void method1() {
		
		Response res=given().when().get("https://reqres.in/api/users?page=2");
		
		Assert.assertEquals(res.getStatusCode(),200);
		Assert.assertEquals(res.getStatusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(res.jsonPath().get("data[2].email").toString(),"tobias.funke@reqres.in");
		Assert.assertEquals(res.jsonPath().get("data[5].last_name").toString(),"Howell");
		Assert.assertEquals(res.jsonPath().get("total").toString(),"12");
		Assert.assertEquals(res.jsonPath().get("support.text").toString(),"To keep ReqRes free, contributions towards server costs are appreciated!");
	
		// Parsing the response and storing in response variable
		// then using jsonpath parsing the response data's
		// Assertions for responses
	
	}

}
