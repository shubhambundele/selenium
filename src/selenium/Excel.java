package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel
{

	public static void main(String[] args) throws IOException
	{
		String address = "H:\\shubhamexcel.xlsx";

		// Open n Read file
		FileInputStream file = new FileInputStream(address);

		// WorkBook open n read
		XSSFWorkbook workbook = new XSSFWorkbook(file);

//		String cellData = workbook.getSheet("ludo").getRow(0).getCell(0).getStringCellValue();
//		System.out.println(cellData);

		// sheet open n read
		XSSFSheet sheet = workbook.getSheet("ludo");

		// row read
		XSSFRow row = sheet.getRow(0);

		// cell read
		XSSFCell cell = row.getCell(1);

		// cell data print-read

		String cellData = cell.getStringCellValue();
		System.out.println(cellData);

	}

}
