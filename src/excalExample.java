import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excalExample {

	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("C:\\Users\\Shruthi.S.Raj\\Desktop\\tryExcel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Guddu");
//		Row r =  wb.getSheet("Guddu").getRow(0);
//		Cell c = wb.getSheet("Guddu").getRow(0).getCell(0);
//		String St = c.getStringCellValue();
//		System.out.println(St);
		
		String st1 = sh.getRow(0).getCell(0).getStringCellValue();	
		System.out.println(st1);

	}

}
