package responsebodyvalidation;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

/*Important things to note
Response class
ResponseBody class
extract().response*/

public class getresponsebody_usingresponse_print {

	@Test
	public void method1() {
		Response res = given().get("https://reqres.in/api/users?page=2");
		ResponseBody rbody = res.getBody();
		rbody.prettyPrint();

	}

	@Test
	public void method2() {
		Response res = given().
				get("https://reqres.in/api/users?page=2").
		then().
				extract().
				response();

		res.getBody().prettyPrint();
		System.out.println(res.statusCode());
		System.out.println(res.statusLine());

	}
}
