package ExcelReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {
	public Read() {
		try {
			File file = new File("C:\\Users\\Abhishek\\eclipse-workspace\\ExcelReadWrite\\data.xlsx");
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);
			Iterator<Row> itr = sheet.iterator();
			while (itr.hasNext()) {
				Row row = itr.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cell.getCellType()) {
					case NUMERIC:
						long number = (long) cell.getNumericCellValue();
						System.out.print(cell.getNumericCellValue() + "      ");
						break;

					case STRING:
						System.out.print(cell.getStringCellValue() + "      ");
						break;
					default:
					}
				}
		System.out.println("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
