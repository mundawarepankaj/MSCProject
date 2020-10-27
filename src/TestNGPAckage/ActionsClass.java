package TestNGPAckage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws AWTException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		
		WebElement GmailLink = driver.findElement(By.xpath("//a[text()=\"Gmail\"]"));
		
		Thread.sleep(3000);
		//ac.moveToElement(GmailLink).contextClick().perform();
		
		ac.moveToElement(GmailLink).click().perform();
		Thread.sleep(5000);
		
		driver.navigate().back();
		/*
		Robot rbt = new Robot();
		
		rbt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		*/
		Thread.sleep(2000);
		driver.quit();
	}

}
