package TestNGPAckage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@value=\"Submit\"]")).click();
		
		Alert alt = driver.switchTo().alert();
		String alertText1 =  alt.getText();
		Thread.sleep(5000);
		System.out.println("Alert text is = "+alertText1);
		
		alt.accept();
		
		
		String alertText2 = alt.getText();
		
		
		System.out.println("Alert text is = "+alertText1);
		System.out.println("Alert text is = "+alertText2);
		
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
