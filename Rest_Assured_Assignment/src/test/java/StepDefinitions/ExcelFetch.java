package StepDefinitions;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;





public class ExcelFetch {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;



	public ExcelFetch(String ExcelPath, String SheetName) {
		try {
			workbook = new XSSFWorkbook(ExcelPath);
			sheet= workbook.getSheet(SheetName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	} 



	public static void getRowCount()  {

		try {

			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows: "+ rowcount);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}


	public static void getCellData(int RowNum , int ColoumnNum) {
		DataFormatter formatter= new DataFormatter();

		Object value =formatter.formatCellValue(sheet.getRow(RowNum).getCell(ColoumnNum));
		System.out.println(value);


	}







}
