package apichaining_Itextcontext;


import static io.restassured.RestAssured.given;
import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

/* Important thing to note:
 * This API chaining can be run only through Testng.xml file, create a testng suite xml file to run
 * import org.testng.ITestContext;
 * public void creatusermethod(ITestContext context)
 * String f_name=  (String) context.getAttribute("fn"); cast to String
 */

public class createuser {
	@Test
	public void creatusermethod(ITestContext context) {
		
		String f_name=  (String) context.getAttribute("fn"); // casting to string after getting attribute
		
		JSONObject rb=new JSONObject();
		rb.put("name", f_name);
		rb.put("job", "QATester");
		System.out.println(rb);
		
		given().
			body(rb.toString()). //Body:{"empty":false,"mapType":"java.util.HashMap"} wrong input so you need to always use .tostring() for jsonobject
			log().body().
		when().
			post("https://reqres.in/api/users").
		then().
			statusCode(201).
			log().body();	
	}
}