package TestNGPAckage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class SpringCTTest 
{
	public static WebDriver driver;
	
  
  @BeforeMethod
  public void setUp() 
  {
	  driver = new ChromeDriver();
	  driver.get("http://automationpractice.com/index.php");
	  
	  WebElement signInLink = driver.findElement(By.xpath("//*[@class=\"login\"]"));
	  WebElement emailId = driver.findElement(By.id("email"));
	  WebElement password = driver.findElement(By.id("//*[@name=\"passwd\"]"));
	  WebElement signInButton = driver.findElement(By.xpath("//span/i[@class=\"icon-lock left\"]"));
	  
	  signInLink.click();
	  emailId.sendKeys("sct.test@grr.la");
	  password.sendKeys("SCT@123");
	  signInButton.click();
	  
  }

  
  @Test
  public void VerifyPopularCategory()
  {
	driver.findElement(By.xpath("//*[text()=\" Home\"]")).click();
	
	Actions ac = new Actions(driver);
	
	
	//List<WebElement> listOfElements = driver.findElements(XPath(""))
			
			
			WebElement firstItem = driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?id_product=1&controller=product\"]"));
			WebElement secodnItem = driver.findElement(By.xpath("//a[@class=\"price product-price\"]"));
			
			
			//String firstItemName;
			//ac.moveToElement(firstItem).build().perform();
			
			//String firstItemPrice = driver.findElement(By.xpath("//a[@class=\"price product-price\"]")).getText();
			
		///	System.out.println(firstItemName);
			///System.out.println(firstItemPrice);
  }
  
	  
	  @AfterMethod
  
  public void afterMethod() 
  {
	  driver.close();
  }

}
