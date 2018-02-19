package TestLessons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception 
	{
		// create an object to store the excel file path 
		
		File src = new File("C:\\Users\\Administrator\\Desktop\\TestData.xlsx");
			
		//open the Excel file
		FileInputStream fis = new FileInputStream(src);
		
		//create workbooK. XSSF will load the workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//load worksheet
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data0);
		
		String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data1);
		
		//close workbook
		wb.close();
	}

}
 