package responsebodyvalidation;


import static io.restassured.RestAssured.given;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;

/* Important Things to note:
1) add dependency json Path in pom.xml
2) get the Response in res variable 
3) Assert.assertEquals(jsonpath().get().toString(),"")
*/

//Using Jsonpath parsing and validating response Object

public class parsing_usingjsonpath_assertequals {
@Test
	public void method1() {
		
		Response res=given().get("https://reqres.in/api/users?page=2");
		Assert.assertEquals(res.jsonPath().get("data[3].first_name").toString(), "Byron");
	
	}

// Using Jsonpath parsing and validating response Object
	@Test
	public void method2() {
	
		Response res=given().when().get("https://reqres.in/api/users/1");
		Assert.assertEquals(res.jsonPath().get("data.email").toString(),"george.bluth@reqres.in");
		
	}
}
