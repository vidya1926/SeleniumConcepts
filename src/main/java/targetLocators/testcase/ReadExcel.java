package targetLocators.testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Step:1 Connect the path with this method
		XSSFWorkbook wb = new XSSFWorkbook("./data/CL.xlsx");

		// wb.getSheetAt(0)
	//get the sheet name from the wb
		XSSFSheet sheet = wb.getSheet("Sheet1");
//number of rows-->get the rows from the sheet
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("Row Count" + lastRowNum);

		
		XSSFRow row = sheet.getRow(1);
		
		//get the column count using row(single)
		int lastCellNum = row.getLastCellNum();

		System.out.println("Column Count" + lastCellNum);
		//XSSFCell cell = row.getCell(1);
		
		
//to iterate among the rows
		for (int i = 1; i <= lastRowNum; i++) {
			//iterate among the columns
			for (int j = 0; j < lastCellNum; j++) {			
				
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				
			}
			/*
			 * String stringCellValue = cell.getStringCellValue();
			 * 
			 * System.out.println(stringCellValue);
			 */

			// Wb-->WS-->rc-->col-->cell value
		}

	}

}
