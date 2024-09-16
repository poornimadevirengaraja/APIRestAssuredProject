package package1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class jsonexternalfile {

	@Test
	public void method1() throws FileNotFoundException {
		
		File f=new File(".\\createuser.json"); // to open the file
		FileReader fr=new FileReader(f); // to read the opened file
		JSONTokener jt= new JSONTokener (fr); // to parse the string and characters in the json file
		JSONObject rb= new JSONObject(jt); // to create the post object and methods 
		
		given()
			.body(rb.toString()) // to be used when JSONObject is used 
			.log().body().
		when()
			.post("https://reqres.in/api/users"). // You can even post the whole url like this eliminating baseURI
		then().
			log().body();			
	}

}
