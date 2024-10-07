package orangeHRM.org;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Org_DDT {

	public static String DDT(String Sheet, int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis =new FileInputStream("./Excel/Book2.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet1 = book.getSheet(Sheet);
		Row row1 = sheet1.getRow(row);
		Cell cell1 = row1.getCell(cell);
		String value = cell1.getStringCellValue();
		return value;
		
	}
}
