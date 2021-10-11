package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
	public static void main (String[] args) {
//		getRowCount();
		getCellDataString();
		getCellDataNumber();
	}
	
	
	public static  void getRowCount() {
		
		try {
//			String projectpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook("C:\\Users\\admin\\eclipse-workspace\\SelAssignments\\Excelfiles\\New Microsoft Excel Worksheet.xlsx");
			XSSFSheet sheet= workbook.getSheet("Sheet1");
			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows: "+ rowcount);
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
			
		}
		
		
		
		
	}


	private static void getCellDataString() {
		try {
			
			workbook = new XSSFWorkbook("C:\\Users\\admin\\eclipse-workspace\\SelAssignments\\Excelfiles\\New Microsoft Excel Worksheet.xlsx");
			sheet= workbook.getSheet("Sheet1");
			String celldata =sheet.getRow(1).getCell(0).getStringCellValue();
			System.out.println(celldata);
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
			
		}
		
		
		
	}
	
	private static void getCellDataNumber() {
		try {
			
			workbook = new XSSFWorkbook("C:\\Users\\admin\\eclipse-workspace\\SelAssignments\\Excelfiles\\New Microsoft Excel Worksheet.xlsx");
			sheet= workbook.getSheet("Sheet1");
			double celldata =sheet.getRow(1).getCell(1).getNumericCellValue();
			System.out.println(celldata);
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
			
		}
		
		
		
	}
	
	

}
