package package1;
import  org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Headers {
@Test
	public  void method1() {
	
	given().
		
	when().
		get("https://reqres.in/api/users/2").	
	
	then().
		log().headers().
		header("Content-Type", "application/json; charset=utf-8").
		//log().all();
	    log().headers().
		log().cookies();
		

	}

}
