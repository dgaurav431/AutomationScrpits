package DataDrivenTesting15;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchdataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\dell\\eclipse-workspace-Gaurav_Dubey\\Automation\\TestData\\ExcelData.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		Row row= sheet.getRow(1);
		
		Cell cell = row.getCell(0);
		
		String customerName = cell.getStringCellValue();
		
		System.out.println(customerName);
		
		String customerEmail = row.getCell(1).getStringCellValue();
		
		System.out.println(customerEmail);
		
		long phoneNo = (long)row.getCell(2).getNumericCellValue();
		
		System.out.println(phoneNo);
		
		boolean status = row.getCell(3).getBooleanCellValue();
		
		System.out.println(status);
	}

}
