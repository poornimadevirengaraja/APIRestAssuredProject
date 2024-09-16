package package1;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Authentication {
	@Test
	public  void basicAuth() {
		// Basic Authentication
		given().
			auth().basic("postman","password").
		when().
			get("https://postman-echo.com/basic-auth").
		then().
			statusCode(200).
			log().body();
	}
	@Test
	public  void digestAuth() {
		// digest Authentication
		given().
			auth().digest("postman","password").
		when().
			get("https://postman-echo.com/digest-auth").
		then().
			statusCode(200).
			log().body();
	}

	@Test
	public  void preemtiveAuth() {
		// preemptive Authentication
		given().
			auth().preemptive().basic("postman","password").
		when().
			get("https://postman-echo.com/basic-auth").
		then().
			statusCode(200).
			log().body();
	}

	@Test
	public  void bearertokenAuth1() {
		// oauth or oauth1 Authentication
		// for authentication tokens each token differ for each user
		// only through headers u can pass always header name : Authorizaton and header value : u need to put Bearer word space then token
		given().
			headers("Authorization","Bearer 2fb2718ea99979c5e9ed0f93e50e92adefc2cffe886c1d80cc2485bc11170dfe").
		when().
			get(" https://gorest.co.in/public/v2/users").
		then()
			.statusCode(200)
			.log().body();
	}

}
