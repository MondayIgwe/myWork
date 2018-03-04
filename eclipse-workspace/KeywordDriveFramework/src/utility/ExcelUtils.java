package utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtils {

	private static XSSFWorkbook ExcelWBook;
	private static XSSFSheet ExcelWSheet;
	private static XSSFCell Cell;
	
	//This method is to set the file path and open the excel
    //Pass Excel Path and SheetName as Arguments to this method
	
	public static void setExcelFile(String Path, String SheetName)  throws Exception{
	
		FileInputStream ExcelFile = new FileInputStream (Path);
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		ExcelWSheet = ExcelWBook.getSheet(SheetName);
		
	}
	
	//This method is to read the data from the Excel Cell
	//In this we are passing parameters as RowNum and ColNum
	
	public static String getCellData(int RowNum, int ColNum) throws Exception {
		
		Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
		String CellData = Cell.getStringCellValue();
		return CellData;
		
		
	}
	
	
}
