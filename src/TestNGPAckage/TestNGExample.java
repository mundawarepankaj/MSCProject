package TestNGPAckage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGExample 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		Reporter.log("Application opened successfully");
		
	}
	
	
	
  @Test(description = "contactus method")
  public void verifyContactUsLink() throws InterruptedException, IOException
  {
	  WebElement LinkcontactUs = driver.findElement(By.xpath("//a[contains(@title, \"Contact us\")]"));
	  Reporter.log("Clicked on contact us successfully");
	  LinkcontactUs.click();
	  Thread.sleep(2000);

	  File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  FileUtils.copyFile(scr, new File("D://Pages_Autmation/ContactUSPage.jpg"));
	  String act_title = driver.getTitle();
	  
			  
	  Assert.assertEquals(act_title, "Contact us - My Store");
	  
	  
  }
  
  @Test(description = "Sign in method")
  public void verifySignIn() throws InterruptedException, IOException
  {
	  WebElement signInsLink = driver.findElement(By.xpath("//*[@class=\"login\"]"));
	  signInsLink.click();
	  Thread.sleep(2000);
	  

	  File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  FileUtils.copyFile(scr, new File("D://Pages_Autmation/SignInPage.jpg"));
	  Reporter.log("Clicked on Sign In link successfully");
	  
	  Assert.assertEquals(driver.getTitle(), "Login - My Store");
	  
	  
  }
  
  @Test(description = "search butoon")
  public void verifySearchButton() throws InterruptedException, IOException
  {
	  WebElement searchTextbox = driver.findElement(By.xpath("//input[@id=\"search_query_top\"]"));
	  WebElement searchBtn = driver.findElement(By.xpath("//button[@name=\"submit_search\"]"));
	  
	  searchTextbox.sendKeys("Mens shirts");
	  Thread.sleep(2000);
	  searchBtn.click();
	  Thread.sleep(2000);
	  
	  File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  FileUtils.copyFile(scr, new File("D://Pages_Autmation/SearchPage.jpg"));
	  Reporter.log("Clicked on Search button successfully");
	  String searchResult = driver.getTitle();
	  
	  Assert.assertEquals(searchResult, "Search - My Store");
	  
	  
	  
  }
  
  
  
  
  @AfterMethod
  public void tearDown()
  {
	  driver.close();
  }
}
