package targetLocators.testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadcellValue {

	public static String[][] exceldata(String filename) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+filename+".xlsx");
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("Row Count" + lastRowNum);
		XSSFRow row = sheet.getRow(1);
		int lastCellNum = row.getLastCellNum();
		System.out.println("Column Count" + lastCellNum);
				
		String[][] data=new String[lastRowNum][lastCellNum];	
		
		
		
		for (int i = 1; i <= lastRowNum; i++) {
					for (int j = 0; j < lastCellNum; j++) {
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				data[i-1][j]=stringCellValue;
						}		
		}
		wb.close();
		return data;
		
	}

}
