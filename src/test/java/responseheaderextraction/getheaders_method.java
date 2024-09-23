package responseheaderextraction;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

// getting all the headers 
public class getheaders_method {
	@Test
	public void method1() {
		Response res=given().get("https://reqres.in/api/users/2");
		//.getheaders will get the all values of all headers
		// Note : You have to use Headers class to .getheaders
		Headers hds=res.getHeaders();  
		// hds variable will get all collections of headers in responses
		// Loop through the header collection and Print each header name and header value
		for(Header h:hds) {
			System.out.println("Header Name = "+ h.getName());
			System.out.println("Header Value = "+ h.getValue());
		}
			
		
		
	}
}
