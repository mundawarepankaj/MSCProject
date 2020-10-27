package Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileAccess 
{
	static FileInputStream fis;

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		try {
		String filePath = "D:\\MyNewWorkspace\\MSCProject\\DataMercury.xlsx";
		
		File  f = new File(filePath);
		
		fis = new FileInputStream(f);
		}catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
		}
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		
		int rowcount = sh.getLastRowNum();
		
		XSSFRow row = sh.getRow(0);
		int colCOunt = row.getLastCellNum();
		
		
		for(int i = 1; i<rowcount; i++)
		{
			for(int j = 1; j<rowcount; j++)
			{
				
			}
		}
		
		
	}

}
