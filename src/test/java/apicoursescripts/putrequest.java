package apicoursescripts;

import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;

public class putrequest {


@Test
	public  void method1(){
	
	Map <String,Object> requestbody=new HashMap<String, Object>();
	requestbody.put("\"name\"", "\"morpheus\"");
	requestbody.put("\"job\"","\"zion resident\"");

	System.out.println("Map1 - "+requestbody); // colon not coming here so disadvantage of using hashmap
	//{
    //"name": "morpheus",
    //"job": "zion resident"
	//}

	}

}
