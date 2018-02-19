/**
 * 
 */
package TestLessons;
import java.io.*;
import org.apache.poi.xssf.usermodel.*;

/**
 * Excel read and write Data
 *if the Excel file extension is .xlsx --> Use XSSFS  
 * ELSE USE .xls --> HSSF 
 */

public class excelTutorial 

{
	private XSSFSheet ExcelWSheet; 
	private XSSFWorkbook ExcelWBook;
	
	//Constructor to connect to the Excel with sheetname and path
	public excelTutorial(String Path, String SheetName)  throws Exception
	{
		try
		{
			//open the Excel file
			FileInputStream ExcelFile = new FileInputStream(Path);
			
			//Access the required test data sheet
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
			
		}
		catch (Exception e)
		{
			throw (e);
		}
	}
	
   //This method is to set the rowcount of the excel
	public int excel_get_rows() throws Exception
	
	{
		try
		{
			return ExcelWSheet.getPhysicalNumberOfRows();
		}
		catch (Exception e)
		{
			throw(e);
		}
}


	//Use this method to get the data and get the value as strings
	public String getCellDataasstring(int RowNum, int Column) throws Exception
	{
		try
		{
			String CellData = 
					ExcelWSheet.getRow(RowNum).getCell(Column).getStringCellValue();
					System.out.println("The value of celldata"+ " "+ CellData);
					return CellData;
		}
		catch (Exception e) 
		{
			return "Errors in Getting Cell Data";
			
		}
	}
	
		//Use this method to get the data and get the value as number
		public double getCellDataasnumber(int RowNum, int Column) throws Exception
		{
			try
			{
				double CellData=
						ExcelWSheet.getRow(RowNum).getCell(Column).getNumericCellValue();
				//Cell = ExcelWSheet.getRow(RowNum.getCell(Column);
				//String CellData = Cell.getStringCellValue();
				System.out.println("The value of CellData" + CellData);
				return CellData;
				
			}
			catch (Exception e) 
			{
				return 000.00;
			}
			
		}
	}

