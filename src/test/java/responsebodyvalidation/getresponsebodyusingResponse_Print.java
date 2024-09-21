package responsebodyvalidation;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;


/*Important things to note
Response class
ResponseBody class
asstring()*/


public class getresponsebodyusingResponse_Print {
	@Test
	public void method2() {
		Response res = given().get("https://reqres.in/api/users?page=2");
		ResponseBody rbody =res.getBody();
		System.out.println(rbody.asString());
				
	}
}
