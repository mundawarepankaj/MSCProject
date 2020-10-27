package TestNGPAckage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollInSelenium {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("window.location = 'https://www.facebook.com/r.php'");
		
		//Thread.sleep(3000);
		/*
		String titleOfPage = jse.executeScript("return document.title").toString();
		
		System.out.println("Title of Webpage is = "+titleOfPage);
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,250)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0, -250)");
		Thread.sleep(3000);
		
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(3000);
		
		
		jse.executeScript("alert('Please enter your name');");
		*/
		
		Thread.sleep(3000);
		
		WebElement firstNameTxt = driver.findElement(By.id("u_0_n"));
		
		jse.executeScript("arguments[0].value='Pankaj';", firstNameTxt);
		Thread.sleep(3000);
		
		//Scroll 
		jse.executeScript("window.scrollBy(0,250)");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.id("u_0_14"));
		
		//clicking on perticuler element 
		jse.executeScript("arguments[0].click();", element);
		Thread.sleep(3000);
		
		//jse.executeScript("document.getElementById('u_0_14').click");
		System.out.println("Clicked on Sign up button");
		
		Thread.sleep(2000);
		driver.close();

	}

}
