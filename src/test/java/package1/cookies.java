package package1;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class cookies {
@Test
	public  void method1() {
	
	baseURI="https://www.google.com/";
	given().
		pathParam("folder","search"). // path parameter any name like folder u can give
		queryParam("q", "tiger").
		queryParam("tbm", "isch").
		log().all().
	when().
		get("{folder}"). // here u have to give the above path parameter name already given
	then().
		cookie("1P_JAR").
		cookie("1P_JAR","2024-03-06-11");
	}

}
