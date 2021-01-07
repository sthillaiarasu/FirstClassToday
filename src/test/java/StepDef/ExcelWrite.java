package StepDef;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	
	public static void main(String[] args) throws Throwable {
		
		File excel=new File("C:\\Studies\\fileoperation\\Book1.Xlsx");
		
		FileInputStream fs=new FileInputStream(excel);
		
		XSSFWorkbook book=new XSSFWorkbook(fs);
		
		XSSFSheet createSheet = book.createSheet("thillai");
		
		XSSFRow createRow = createSheet.createRow(0);
		
		XSSFCell createCell = createRow.createCell(0);
		
		createCell.setCellValue("besant annanagar");
		
		FileOutputStream fos=new FileOutputStream(excel);
		
		book.write(fos);
		
		
		
		
		
		
		
	}

}
