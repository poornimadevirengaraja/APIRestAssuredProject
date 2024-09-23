package pojo_requestbodycreation;

import org.testng.annotations.BeforeClass;
import com.github.javafaker.Faker;

public class payload {
	//create a object for payloadpojo class to set values	
	@BeforeClass
	public Object dataprovider_method() {			
		payloadpojo_setget	 payloadobj=new payloadpojo_setget();
		Faker fk=new Faker();
				
		payloadobj.setId(fk.idNumber().hashCode());
		payloadobj.setFirstName(fk.name().firstName());
		payloadobj.setLastName(fk.name().lastName());
		payloadobj.setEmail(fk.internet().emailAddress());
		payloadobj.setPassword(fk.internet().password());
		payloadobj.setPhone(fk.phoneNumber().cellPhone());
		return payloadobj;
	}
}
 