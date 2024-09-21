package cookiesextraction;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import java.util.Map;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class getcookies_printeachnamevalue {
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
				System.out.println("Response received in 'res' variable is :"+res);
				
				// You have to use Map<String,String> to getcookies() response
				// getcookies() will give responses as a Map collection only
				Map<String,String> getcookiesmap = res.getCookies();
				System.out.println("All Cookies in Response : "+ getcookiesmap);
				
				// How will you get each cookie name and each cookie value separately 
				for ( String c: getcookiesmap.keySet()) {
				//now c will have one cookie key name
					System.out.println("cookie key : " + c);
					System.out.println("cookie value : " + res.getCookie(c));					
					
				}
				
}
}