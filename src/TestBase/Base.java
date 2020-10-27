package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Base 
{
	public static WebDriver driver;
	public static Properties prop;
	
	
	public Base() throws IOException
	{
		prop = new Properties();
		
		FileInputStream fis = new FileInputStream("D:\\MyNewWorkspace\\MSCProject\\config.properties");
		
		prop.load(fis);
		
		
    }
	
	public static void initilisation()
	{
		String url = prop.getProperty("url");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);


	}
	
	

}
