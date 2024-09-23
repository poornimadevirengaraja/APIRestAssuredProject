package authentication;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

/*In header you need to given api key and api value for API key auth*/

public class apikeyauth_class {
	@Test
	public void apikeyauth() {
		
		Response res=given().
				header("X-API-KEY","abcdef12345").
		when().
			get("https://www.postman.com/collections/").
		then().
			extract().
			response();
			
		System.out.println("response body = "+res.body().prettyPrint());
		
	}
}
