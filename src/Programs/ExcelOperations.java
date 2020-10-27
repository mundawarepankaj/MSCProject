package Programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelOperations {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		FileInputStream fis = new FileInputStream("D:\\MyNewWorkspace\\MSCProject\\DataMercury.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		
		int rowCount = sh.getLastRowNum();
		
		XSSFRow row = sh.getRow(0);
		
		int colCount = row.getLastCellNum();
		
		
		String fname = sh.getRow(1).getCell(0).getStringCellValue();
		String lname = sh.getRow(1).getCell(1).getStringCellValue();
		String mobile = sh.getRow(1).getCell(2).getStringCellValue();
		String email = sh.getRow(1).getCell(3).getStringCellValue();
		
		driver.findElement(By.xpath("//*[text()=\"REGISTER\"]")).click();
		
		
		WebElement txt_fname= driver.findElement(By.xpath("//*[@name=\"firstName\"]"));
		WebElement txt_lname = driver.findElement(By.xpath("//*[@name=\"lastName\"]"));
		WebElement txt_phone = driver.findElement(By.xpath("//*[@name=\"phone\"]"));
		WebElement txt_email = driver.findElement(By.xpath("//*[@name=\"email\"]"));
		
		
		txt_fname.sendKeys(fname);
		txt_lname.sendKeys(lname);
		txt_phone.sendKeys(mobile);
		txt_email.sendKeys(email);
		
		
	}

}
