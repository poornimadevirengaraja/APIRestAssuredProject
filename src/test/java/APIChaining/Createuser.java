package APIChaining;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Createuser {
@Test
	public  void method2(ITestContext context){
	JSONObject rb=new JSONObject();
	String name=(String) context.getAttribute("fn");
	// string casted here (String) convert fn to string		
	rb.put("name",name);
	rb.put("Job","Trainer");
	
	given().
	body(rb.toString()).
	headers("Content-Type","application/json").
	log().body().
	
	when().
	post("https://reqres.in/api/users").
	
	then().
		log().body();
	}
}
