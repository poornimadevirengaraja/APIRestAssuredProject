package apicoursescripts;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class ParsingUsingJsonobject {
	@Test
	public void method1() {
		Response res =given().when().get("https://reqres.in/api/users?page=2");
		JSONObject jo=new JSONObject(res.asString()); 
		
		// Creating JSONObject and always store res collection .tostring()		
		//now jo will contain the full response body in it 
		// how to loop and parse the response body
		//get.JSONArray and get.JSONObject
		
		int count=0;
		for(int i=0;i<jo.getJSONArray("data").length();i++) {
			
			String fname=jo.getJSONArray("data").getJSONObject(i).get("first_name").toString();
			String avatar=jo.getJSONArray("data").getJSONObject(i).get("avatar").toString();
			String idno=jo.getJSONArray("data").getJSONObject(i).get("id").toString();
			
			
			System.out.println("FirstName is "+fname+"seen at this position"+i);
			System.out.println("Avatar is "+avatar+"seen at this position"+i);
			System.out.println("Id is "+idno+" seen at this position"+i);
			//count = count + Integer.parseInt(idno);
			count = count + Integer.valueOf(idno);
			
			
			if(fname.equalsIgnoreCase("Lindsa")) {
				System.out.println("FirstName is "+fname+"seen at this position"+i);
				break;
			}
						
		}
		
		System.out.println("The Total sum of id is  :  "+ count);
		
	}

}
