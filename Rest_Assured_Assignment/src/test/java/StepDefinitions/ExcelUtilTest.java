package StepDefinitions;

public class ExcelUtilTest {
	static String projDir= System.getProperty("user.dir");
	
	public static void main(String[] args) {
		String excelPath = projDir+"/Data/ForDataFetching.xlsx"; 
		String sheetName= "Sheet1";
		ExcelFetch excel= new ExcelFetch(excelPath, sheetName); 
		excel.getRowCount();
		excel.getCellData(1,0);
		excel.getCellData(1,1);
		excel.getCellData(1,2);
		
	}

}
