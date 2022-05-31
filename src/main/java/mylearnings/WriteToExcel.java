package mylearnings;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public  void input(String sheetName, String cellValue, int row,int col) throws IOException {
		
		 String excelfile= "C:\\downloads\\sample.xlsx";
		  File file= new File(excelfile);
		
		 FileInputStream fis= new FileInputStream(file);
		  
		  XSSFWorkbook wb= new XSSFWorkbook(fis);
		  
		  XSSFSheet sheet= wb.getSheet(sheetName);
		  
		  sheet.getRow(row).createCell(col).setCellValue(cellValue);
		  
		  FileOutputStream fos= new FileOutputStream(new File(excelfile));
		  
		  wb.write(fos);
		  
		  wb.close();
		  
		  fos.close();// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) throws IOException {
		WriteToExcel wr=new WriteToExcel();
		wr.input("Sheet1", "Test", 0, 2);
	}
}
