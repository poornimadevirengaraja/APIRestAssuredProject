package package1;

import java.util.HashMap;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class ConstructRequestBodyarray {
@Test
	public  void method2() {
		HashMap<String,Object> rb = new HashMap<String, Object>();
		rb.put("country", "India");
		rb.put("name", "Arjun");		
		String arr[]= {"Tamil","English"};
		rb.put("language", arr);
		rb.put("state", "TamilNadu");
		
		baseURI="https://reqres.in/";
		given().
			body(rb).
			log().all().			
		when().
		    post("api/users").
		    
		then()
			.log().body();
			
		
	}

}
