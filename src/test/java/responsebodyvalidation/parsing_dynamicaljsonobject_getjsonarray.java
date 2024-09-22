package responsebodyvalidation;

import static io.restassured.RestAssured.given;
import org.json.JSONObject;
import org.testng.annotations.Test;
import io.restassured.response.Response;


/*Important things to note:
1) Used for dynamically changing objects inside array in Response Body
2) import json object and org.json dependency in pom.xml
3) get response
4) create jsonobject and to string
5) getjsonobject and getjsonarray and loop for each items in the array in response
*/


public class parsing_dynamicaljsonobject_getjsonarray {
	@Test
	public void method1() {
		Response res = given().get("https://reqres.in/api/users?page=2");
		JSONObject rb = new JSONObject(res.asString());
		// To get no of Objects inside data array in response body
		int numofobjs = rb.getJSONArray("data").length();
		for (int i = 0; i < numofobjs; i++) {
			// to get the firstname in Object
			String firstnm = rb.getJSONArray("data").getJSONObject(i).get("first_name").toString();
			System.out.println(firstnm);
			if (firstnm.equalsIgnoreCase("Lindsay")) {
				System.out.println("The Lindsay position of object in data array is : " + i);
				break;				
			}
		}
	}
}
