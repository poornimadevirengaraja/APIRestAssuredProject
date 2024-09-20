package requestbodycreation;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

// This method disadvantage is it can't be parameterized
@Test
public class usingexternaljsonfile {
	@Test
	public void method1() throws FileNotFoundException {
		File f=new File(".\\createuserreqbody.json");
		FileReader fr=new FileReader(f);
		JSONTokener jt=new JSONTokener(fr);
		JSONObject rb=new JSONObject(jt);
		baseURI="https://reqres.in";
		given().
			body(rb.toString()).
			log().body().
		when().
			post("/api/users?page=2").			
		then().
			statusCode(201).
			log().all();	
		
	}

}
