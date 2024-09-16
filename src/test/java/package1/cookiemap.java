package package1;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Map;
public class cookiemap {
@Test
	public  void method1() {
	
	baseURI="https://www.google.com/";
	Response res = given().
		pathParam("folder","search"). // path parameter any name like folder u can give
		queryParam("q", "tiger").
		queryParam("tbm", "isch").
		log().all().
	when().
		get("{folder}"); // here u have to give the above path parameter name already given
		
		Map<String,String> cookiemap=res.getCookies();
		
		for(String k:cookiemap.keySet()) {
			System.out.println("The key is :"+k+" Then value of this cookie is :"+res.getCookie(k)); //sysout then press ctrl+Space to fill the full form
		}
			
		
		
	}

}
