package cookiesextraction;

import static io.restassured.RestAssured.*;

import java.util.Map;

import org.testng.annotations.Test;
import io.restassured.response.Response; // To get the response, you need to import this 

public class getcookies_method {
	@Test
	public void method1() {		
		baseURI = "https://www.google.com/";
		//Response class is used to store Responses
		Response res=given().
				pathParam("folder", "search"). 
				queryParam("q", "tiger").
				queryParam("tbm", "isch").
				log().all().
				when().
				get("{folder}");		
				System.out.println("Response received in 'res' variable is :"+res);
				
				// You have to use Map<String,String> to getcookies() response
				// getcookies() will give responses as a Map collection only
				Map<String,String> getcookiesmap = res.getCookies();
				System.out.println("All Cookies in Response : "+ getcookiesmap);
		
	}

}
