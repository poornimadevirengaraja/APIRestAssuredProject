package cookievalidation;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

/* Important Note : You can't validate a cookie as its value keeps on changing each time you send request.
It is used for session management*/

public class cookievalidations {

	@Test
	public void method1() {
		baseURI = "https://www.google.com/";
		given().pathParam("folder", "search"). // path parameter any name like folder u can give
				queryParam("q", "tiger").
				queryParam("tbm", "isch").
				log().all().
				when().
				get("{folder}"). // here u have to give the above path parameter name already given
				then().
				// to check whether cookie exist
				cookie("AEC").  
				// to check the cookie value
				cookie("AEC", "AVYB7cpYBLs_72bPgCqA5jrVb1ZoXHn4agl32gPvnMNmNWzzHSAtNTiI5Q"). 
				log().cookies();
	}

	@Test
	public void method2() {
		baseURI = "https://www.google.com/";
		given().pathParam("folder", "search"). // path parameter any name like folder u can give
				queryParam("q", "tiger").
				queryParam("tbm", "isch").

				when().
				get("{folder}"). // here u have to give the above path parameter name already given
				
				then().
				 // to check whether cookie exist
				cookie("NID").
				// to check the cookie value
				cookie("NID","517=SPezf6qY-xZDLHIQ8HoasBK_-Td1_cB4s6DBugxSnEPZA24xRgZIQzPAWmY3VZZ8IgYCvstrtUSxOtilqaYq7_atI1mIR4kiXHjnViwjuUeEV7HoNMxfb67EOghWPHJN_tiMKcLoKvN5yqnVJzZWipWL_YFv_0Qqw14_DNR0vvx9Mcgbae_gNe6tCIXKkb27F-cu").
				log().cookies();
	}

}

/*
 * here AEC is cookie name and this is cookie value
 * =AVYB7cpYBLs_72bPgCqA5jrVb1ZoXHn4agl32gPvnMNmNWzzHSAtNTiI5Q cookie attributes
 * = Path=/; Domain=google.com; Secure; HttpOnly; Expires=Wed, 19 Mar 2025
 * 04:13:42 GMT;
 */