package Programs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotCapture {

	public static void main(String[] args) throws WebDriverException, IOException
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		//First method to capture screenshot
		/*
		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screen, new File("D://homePageGoogle.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		//First method to capture screenshot
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		FileHandler.copy(screen.getScreenshotAs(OutputType.FILE), new File("D://goole PageHome.jpg"));
		
		System.out.println("Screenshot Captured");
		
		//System.out.println("Screenshor captured");
		driver.close();
		
		
		
		WebElement first = driver.findElement(By.name("xyz"));
		
		Actions ac = new Actions(driver);
		ac.sendKeys("Pankaj");
		
		
		ac.click();
		
		
		
	}

}
