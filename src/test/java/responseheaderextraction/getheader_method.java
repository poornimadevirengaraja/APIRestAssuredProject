package responseheaderextraction;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.response.Response;
//getting a single header
public class getheader_method {
	@Test
	public void method1() {
		Response res=given().get("https://reqres.in/api/users/2");
		//.getheader will get the single value of the header name
		System.out.println("Header Content type value is : "+ res.getHeader("Content-Type"));

	}
}
