package Programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperationsCode {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("D:\\MyNewWorkspace\\MSCProject\\DataMercury.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		
		int rowCount = sh.getLastRowNum();
		
		XSSFRow row = sh.getRow(0);
		
		int colCOunt = row.getLastCellNum();
		
		
		for(int i=0; i<=rowCount; i++)
		{
		String fname = sh.getRow(i).getCell(0).getStringCellValue();
		String lname = sh.getRow(i).getCell(1).getStringCellValue();
		String ph = sh.getRow(i).getCell(2).getStringCellValue();
		String email =  sh.getRow(i).getCell(3).getStringCellValue();
		
		System.out.print("     \t"+fname);
		System.out.print("     \t"+lname);
		System.out.print("     \t"+ph);
		System.out.print("     \t"+email);
		
				
		System.out.println();
		}
		
		
	}

}
