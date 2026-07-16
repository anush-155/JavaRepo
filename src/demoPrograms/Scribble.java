package demoPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Scribble {

	public static void main(String[] args) throws IOException {
	   FileInputStream fis = new FileInputStream("C:\\Users\\Anush\\Desktop\\Details.xlsx");
	   Workbook wb = new XSSFWorkbook(fis);
	   fis.close();
	   Sheet sheet = wb.getSheet("Sheet1");
	   Row row = sheet.getRow(1);
	   Cell cell = row.getCell(0);
	   String value  = cell.getStringCellValue();
			  System.out.println(value); 
			  cell.setCellValue("Anush Panday");
			  System.out.println(cell);
			  
			  
			  FileOutputStream fos  = new FileOutputStream("C:\\Users\\Anush\\Desktop\\Details.xlsx");
		  wb.write(fos);
		  fos.close();
		  wb.close();
	}
	
	
	
	
	    		 }
	    	 
	          
				
			
	

	


