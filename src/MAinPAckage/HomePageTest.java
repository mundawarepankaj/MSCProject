package MAinPAckage;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import MAinPAckage.*;
import junit.framework.Assert;

public class HomePageTest extends Base
{

	HomePage home;
	AdvertisingPage advertise;
	BusinessPage business;
	
	
	public HomePageTest() throws IOException
	{
		super();
		
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		initialisation();
		home = new HomePage();
		
	}
	
	@Test
	public void AdvertisingLink() throws IOException
	{
		
		home.validateAdvertisingLink();
		Reporter.log("Advertising Page Opened successfully");
		String titleAdvertising = driver.getTitle();
		
		assertEquals(titleAdvertising, "Get More Customers With Easy Online Advertising | Google Ads");
		captureScreenshotWIthDate("Google","AdvertisingLink");
	}
	
	@Test
	public void BusinessLink() throws IOException
	{
		home.validateBusinessLink();
		Reporter.log("Business Page Opened successfully");
		String expTitle = driver.getTitle();
		
		assertEquals(expTitle, "Business Management Software | Google Business Solutions – Google");
		captureScreenshotWIthDate("Google","BusinessLink");
	   
	   
		
		
	
	}
	
	@Test
	public void privacyLink() throws IOException
	{
		home.validatePrivacyLink();
		Reporter.log("Privacy Page opened successfully");
		String privacyTitle = driver.getTitle();
		
		assertEquals(privacyTitle, "Privacy Policy – Privacy & Terms – Google");
		captureScreenshotWIthDate("Google","PrivacyLink");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		
	}
	
	
	

}
