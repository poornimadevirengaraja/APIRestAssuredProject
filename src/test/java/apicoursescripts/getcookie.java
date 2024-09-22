package apicoursescripts;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Map;
public class getcookie {
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
		// then part is not necessary for cookies as it is stored in Response
	
		System.out.println(res.getCookie("1P_JAR"));
		System.out.println(res.detailedCookie("1P_JAR"));
		
		// multiple items 'getcookies' will be stored as Map< String, String>
		Map<String,String> cookiemap=res.getCookies();
		System.out.println(cookiemap);
		System.out.println(res.getDetailedCookies());
		
		// single item 'getcookie' will be stored as string
		String cookieval=res.getCookie("1P_JAR");
		System.out.println(cookieval);
	}

}
