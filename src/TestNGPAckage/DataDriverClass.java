package TestNGPAckage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataDriverClass 
{

	public static WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://demo.guru99.com/test/newtours/index.php");
		  driver.manage().window().maximize();
		  

	}
  @Test
  @Parameters({"fn", "ln", "ph", "email", "address", "city","state", "postcode"})
  public void parameters(String fn, String ln, String ph, String email, String address, String city, String state, String postcode) 
  {
		  driver.findElement(By.linkText("REGISTER")).click();
	  
	  driver.findElement(By.xpath("//*[@name=\"firstName\"]")).sendKeys(fn);
	  driver.findElement(By.xpath("//*[@name=\"lastName\"]")).sendKeys(ln);
	  driver.findElement(By.xpath("//*[@name=\"phone\"]")).sendKeys(email);
	  driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys(address);
	  driver.findElement(By.xpath("//*[@name=\"address1\"]")).sendKeys(city);
	  driver.findElement(By.xpath("//*[@name=\"city\"]")).sendKeys(state);
	  driver.findElement(By.xpath("//*[@name=\"postalCode\"]")).sendKeys(postcode);
	  
	  
	  
	  
  }
  
  @AfterMethod
  public void teardown()
  {
	  driver.close();
  }
}
