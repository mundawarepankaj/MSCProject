package Programs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VErifyElements {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		WebDriver driver =  new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		boolean state = js.executeScript("return document.readyState").equals("complete");
		System.out.println("State is = "+state);
		
		driver.close();
		
		
	}

}
