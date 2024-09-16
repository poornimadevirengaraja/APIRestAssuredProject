package package1;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;


public class getrequest {
/*	
	
@Test
	public  void method1() {
		// TODO Auto-generated method stub
		baseURI="https://reqres.in/";
		//given().get("api/users/2").then().statusCode(200);
		given().
			get("api/users/2").
		then().
			statusCode(200).
			log().all();

	}

@Test
public  void method2() {
	// TODO Auto-generated method stub
	baseURI="https://reqres.in/";
	given().
		get("api/users/2").
	then().
		body("data.first_name",equalTo("Janet")).
		//body("data.first_name",containsString("jt")). // string should be continuous
		log().all();
	

}


@Test
public  void method3() {
	// TODO Auto-generated method stub
	baseURI="https://reqres.in/";	
	given().
		get("api/users?page=2").
	then().
		log().all();
	
}

*/

@Test
public  void method4() {
	// TODO Auto-generated method stub
	baseURI="https://reqres.in/";	
	given().
		get("api/users?page=2").
	then().
		log().all().
		body("data.first_name",hasItems("Michael","Rachael")).log().all();
}

}
