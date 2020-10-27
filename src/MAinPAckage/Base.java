package MAinPAckage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base 
{
	public static WebDriver driver;
	public static Properties prop;
	
	public Base() throws IOException
	{
		
		try {
		String filePath = "D:\\MyNewWorkspace\\MSCProject\\config.properties";
		prop = new Properties();
		FileInputStream fis = new FileInputStream(filePath);
		prop.load(fis);
		}catch(FileNotFoundException fnf)
		{
			fnf.printStackTrace();
			
		}
			
	}
	
	public static void initialisation()
	{
		driver = new ChromeDriver();
		Reporter.log("Browser Launched successfully");
		String url = prop.getProperty("url");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		Reporter.log("Apllication opened successfully");
		driver.manage().window().maximize();
		
		
		
		
	}
	
	public static void captureScreenshot() throws IOException
	{
		DateFormat dateForm = new SimpleDateFormat("dd_MMM_yyyy hh_mm_ss");
		
		Date d = new Date();
		String df = dateForm.format(d);
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("D://ScreensPages/"+df+" "+" homepage.jpg"));
		
		
		
	}

	public static void captureScreenshotWIthDate(String folderName, String fileName) throws IOException
	{
		DateFormat dateForm = new SimpleDateFormat("dd_MMM_yyyy hh_mm_ss");
		
		Date d = new Date();
		String df = dateForm.format(d);
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("D:/"+folderName+"/"+df+"_"+fileName+".png"));
		
		
		
	}

}


