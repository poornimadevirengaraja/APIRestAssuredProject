package responsebodyvalidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class statuscode_statusline_assertequals {
	@Test
	public void method1() {
		Response res=given().get("https://reqres.in/api/users?page=2");
		Assert.assertEquals(res.getStatusCode(),200);
		Assert.assertEquals(res.getStatusLine(),"HTTPS/1.1 200 OK");
		
	}
}
