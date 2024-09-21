package cookiesextraction;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class getdetailedcookies_method {
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
				
		// To get detailed cookies - all details of all cookies will be extracted 
		System.out.println("Detailed Cookies : "+res.getDetailedCookies());
		
}
}
