package excelpoi_package;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

/*
 * Add dependencies in pom.xml - poi and poi-ooxml
 */

public class excelpoi_getdata {
	@Test
	public void userdata() throws IOException {	
		// Caused by: java.lang.ClassNotFoundException: org.apache.xmlbeans.XmlException - You need to add poi-ooxml too in pom.xml
		File ref = new File("C:\\Users\\shalu\\eclipse-workspace\\APIRestAssuredProject\\testdata\\test1.xlsx");
		FileInputStream ref1 = new FileInputStream(ref);
		XSSFWorkbook ref2 = new XSSFWorkbook(ref1);
		XSSFSheet sheet =ref2.getSheetAt(0);
		int totrow=sheet.getLastRowNum();
		System.out.println("Total number of rows :"+ totrow);
		String value= sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(value);
		ref2.close();
		ref1.close();
		
		
			
	}
}
