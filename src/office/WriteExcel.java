package office;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	public static void main(String[] args) throws IOException {
		method1();
		method2();

	}

	static void method1() throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\Anush\\Desktop\\Details.xlsx");
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());
		wb.close();
		fis.close();
		// Reading completed here
		FileInputStream fis2 = new FileInputStream("C:\\Users\\Anush\\Desktop\\Details.xlsx");
		Workbook wb2 = new XSSFWorkbook(fis2);
		Sheet sheet2 = wb2.getSheetAt(0);

		Row row2 = sheet2.getRow(0);
		Cell cell2 = row2.createCell(4);
		cell2.setCellValue("HAHA");
		System.out.println(cell2);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Anush\\Desktop\\Details.xlsx");
		wb2.write(fos);
		wb2.close();
		fos.close();
	}

	static void method2() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Anush\\Desktop\\Details.xlsx");
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());
		Cell cell2 = row.createCell(4);
		cell2.setCellValue("HAHAHAHAHA");
		System.out.println(cell2);
		fis.close();
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Anush\\Desktop\\Details.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();

	}

}
