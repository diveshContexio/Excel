package ExcelReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {
	public static boolean CONTINUE = true;
	public static Scanner input = new Scanner(System.in);
	
public Write() throws IOException{
	File input_file = new File("C:\\Users\\Abhishek\\eclipse-workspace\\ExcelReadWrite\\data.xlsx");
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int rows = sc.nextInt();
    System.out.print("Enter the number of columns: ");
    int columns = sc.nextInt();
    
    FileInputStream fis =new FileInputStream(input_file);
    XSSFWorkbook workbook = new XSSFWorkbook(fis);
    XSSFSheet sheet = workbook.getSheetAt(0);
    
    int lastRow = sheet.getLastRowNum();
    for (int i = 0; i < rows; i++) {
        Row row = sheet.createRow(i + lastRow + 1);
        for (int j = 0; j < columns; j++) {
            System.out.print("Enter the value for row " + (i + 1) + " and column " + (j + 1) + "  ");
            String value = sc.next();
            Cell cell = row.createCell(j);
            cell.setCellValue(value);      
        }
    }
    fis.close();
    FileOutputStream fileOut = new FileOutputStream(input_file);
    workbook.write(fileOut);
    fileOut.close();
    workbook.close();
}}
