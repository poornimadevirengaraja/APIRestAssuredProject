package pathandqueryparameter;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class pathandquery {
	@Test
	public void method1() {
			
		given().
		    pathParam("folder", "search").
		    queryParam("q", "tiger").
		    queryParam("tbm", "isch").		 
		    log().all();
		when().
		    get("https://www.google.com/").
		then().
		    statusCode(200).
		    log().all();		
	}
	
}