package dataproviderTestng;

import static io.restassured.RestAssured.given;
import org.json.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*
 * To run same tests with multiple sets of data
 * @DataProvider before method u pass data
 * create Object 2 dimensional array in a separate method and return data
 * In the main test method u have to pass the string as arguments
 * @Test(dataProvider = "methodname of DataProvider") before main test method
 */
 
public class dataprovider_createuser {
	@DataProvider
	public Object[][] userdata() {
		Object[][] data=new Object[2][2];
		data[0][0]="rengaraja";
		data[0][1]="poornima";
		
		data[1][0]="Planning Engineer";
		data[1][1]="QATester";
		
		return data;
	}
	
	
	@Test(dataProvider = "userdata")
	public void createuser(String nm,String jb) {
		JSONObject rb=new JSONObject();
		rb.put("name", nm);
		rb.put("job", jb);
		System.out.println(rb);

		given().
			body(rb.toString()). //Body:{"empty":false,"mapType":"java.util.HashMap"} wrong input so you need to always use .tostring() for jsonobject
			log().body().
		when().
			post("https://reqres.in/api/users").
		then().
			statusCode(201).
			log().body();
	}

}
