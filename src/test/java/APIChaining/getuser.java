package APIChaining;

import org.testng.ITestContext;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class getuser {
@Test
	public  void method1(ITestContext context){
	
	String firstname=given().when().get("https://reqres.in/api/users/3").jsonPath().getString("data.first_name");
	System.out.println("The firstname is: "+firstname); 
	context.setAttribute("fn", firstname);
	
	
	}

}
