package requestbodycreation;
import static io.restassured.RestAssured.*;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;

/*RequestBody:to be created using hashmap is like below:it has Language array
{
"country":"India",
"Language":["Tamil","English"],
"name":"poornima",
"state":"TamilNadu"
}*/
	
	@Test	
	public class usinghashmap_arrayreqbody {
	public void method1() {
		
		Map<String,Object> rb=new HashMap<String,Object>();
		rb.put("country", "India");
		rb.put("name", "poornima");
		String arr[]={"Tamil","English"};
		rb.put("Language", arr);
		rb.put("state", "TamilNadu");
		
		System.out.println(rb);
		
		baseURI="https://reqres.in/";
		given().
			body(rb).
			log().body().
		when().
			post("api/users").
		then().
			statusCode(201).
			log().body();	
	}



}
