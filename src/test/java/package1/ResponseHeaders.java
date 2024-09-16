package package1;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.http.Header;
import io.restassured.http.Headers;
public class ResponseHeaders {
@Test
	public void method1() {
	Response res=given().when().get("https://reqres.in/api/users/2");
	Headers Hds =res.getHeaders(); // Headers is class and Hds stores group of all headers or collections in response
	// Header is class to store single Header
	//Loop Hds ( group of all Headers) loop through hd each header 1 by 1
	
	for(Header hd : Hds) {
		System.out.println("The Header key is = "+hd.getName()+"& The Header value is ="+hd.getValue());
	}
	
	
	
	

	}

}
