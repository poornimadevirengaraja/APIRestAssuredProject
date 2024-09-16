package package1;

import org.json.JSONObject;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;  // Github faker put in mvn repository and put in pom.xml

import static io.restassured.RestAssured.*;

public class faker {
@Test
	public void method1() {
	
	JSONObject rb= new JSONObject();
	Faker fa=new Faker();
	
	//rb.put("name", "Poornima");
	//rb.put("job","Trainer");
	
	rb.put("name", fa.name().fullName());
	rb.put("job",fa.job().title());
	
	System.out.println(rb.put("job",fa.company().name()));
	System.out.println(rb.put("job",fa.internet().emailAddress()));

	given().
		body(rb.toString()).
		log().body().
	when().
		post("https://reqres.in/api/users/").
	then().
		log().body();
	
	}

}
