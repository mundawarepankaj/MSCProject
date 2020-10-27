package TestNGPAckage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DataProviderExample2
{
	public static WebDriver driver;
	
	
	public Object[][]  data()
	{
		Object datatoPass[][] = new Object[3][2];
		 
		datatoPass[0][0] = "Raj";
		datatoPass[0][1] = "Lakhan";
				 
		datatoPass[1][0] = "Maggi";
		datatoPass[1][1] = "Masala";
								 
		datatoPass[2][0] = "KK";
		datatoPass[2][1] = "memo";
		
		return datatoPass;
		
	}
	
  @Test
  public void testData(String fname, String lname)
  {
	   	driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.findElement(By.xpath("//*[@name=\"firstName\"]")).sendKeys(fname);
		driver.findElement(By.xpath("//*[@name=\"lastName\"]")).sendKeys(lname);
		
	  
  }
}
