package TestLessons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

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
		
		int rowCount = sheet1.getLastRowNum();
		System.out.println("Total number of rows are :"+" "+ rowCount);
		
		//Use For loop to get all the rows
		for (int i=0; i<rowCount; i++)
		{
			String data = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println(i+""+data);
		}
		
		//close workbook
		wb.close();
	}

}
 