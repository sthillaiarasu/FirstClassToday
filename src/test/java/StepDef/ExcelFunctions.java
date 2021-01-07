package StepDef;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFunctions {
	
	
	public static void main(String[] args) throws IOException {
		
		File excel=new File("C:\\Studies\\fileoperation\\Book1.Xlsx");
		
		FileInputStream fs=new FileInputStream(excel);
		
		XSSFWorkbook book=new XSSFWorkbook(fs);
		
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++)
			{
			XSSFCell cell = row.getCell(j);
			
	
			if(cell.getCellType().toString().equals("NUMERIC"))
			{
				System.out.println(cell.getNumericCellValue());
			}
			else
			{
				System.out.println(cell.getStringCellValue());
			}

				
			}
		}
		
		
		
		
		
		
	}

}
