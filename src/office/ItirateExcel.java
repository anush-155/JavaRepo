package office;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ItirateExcel {
	
	public static void main (String[] args)  {
		;
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\Users\\Anush\\Desktop\\Details.xlsx");
		
			Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Details");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(cell);
		System.out.println(value);
		wb.close();
		fis.close();
		} catch (FileNotFoundException e) {
			
			System.out.println("Cannot found the file at given path");
		} catch (IOException e) {
			
			System.out.println("Not able to read excel file");
	}
		finally {
			
			System.out.println("Bye-Bye");
		}
	
}
}
