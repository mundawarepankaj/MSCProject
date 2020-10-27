package TestNGPAckage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample 
{
	public static WebDriver driver;
  
	@DataProvider
	public Object[][] dataProviderData()
	{
		Object data[][] = new Object[3][2];
		
		data[0][0] = "ram";
		data[0][1] = "rajesh";
		
		
		data[1][0] = "lakshman";
		data[1][1] = "seth";
		

		data[2][0] = "sanjay";
		data[2][1] = "dutt";
		
		return data;
		
		
	}

	@Test(dataProvider= "dataProviderData")
	public void getData(String fname, String lname)
	{ 
		driver  = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.findElement(By.xpath("//*[@name=\"firstName\"]")).sendKeys(fname);
		driver.findElement(By.xpath("//*[@name=\"lastName\"]")).sendKeys(lname);
		
		
  }
}
