package apichaining_Itextcontext;

import static io.restassured.RestAssured.given;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import io.restassured.response.Response;

/*
 * Important thing to note:
 * This API chaining can be run only through Testng.xml file, create a testng suite xml file to run
 * import org.testng.ITestContext;
 * public void getusermethod(ITestContext context)
 * context.setAttribute("fn", firstnm);
 */



public class gettheuser {
	@Test
	public void getusermethod(ITestContext context) {

		Response res = given().get("https://reqres.in/api/users/2");
		String firstnm = res.jsonPath().get("data.first_name").toString();
		System.out.println(firstnm);
		context.setAttribute("fn", firstnm);
	}
}
