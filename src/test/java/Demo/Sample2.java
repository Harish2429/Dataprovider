package Demo;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample2 {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\Desktop\\Book.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("Sheet1");
	   int count = sh.getLastRowNum();
	   for(int i=0; i<count; i++)
	   {
		   Row row = sh.getRow(i);
		   String firstrow = row.getCell(0).getStringCellValue();
		   String secondceldata = row.getCell(1).getStringCellValue();
		   System.out.println(firstrow+"\t"+ secondceldata);
	   }
	
}
}
