package cookiesextraction;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class getdetailedcookie_method {
	@Test
	public void method1() {		
		baseURI = "https://www.google.com/";
		//Response class is used to store Responses
		Response res=given().pathParam("folder", "search"). 
				queryParam("q", "tiger").
				queryParam("tbm", "isch").
				log().all().
				when().
				get("{folder}");		
				//System.out.println("Response received in 'res' variable is :"+res);
				
		// To get detailed cookie 
		System.out.println(res.detailedCookie("AEC"));
		System.out.println(res.detailedCookie("NID"));
}
}