package MAinPAckage;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MAinPAckage.*;

public class HomePage extends Base
{
	@FindBy(xpath = "//*[text() = \"Advertising\"]")
	WebElement AdvertisingLink;
	
	@FindBy(xpath = "//*[text() = \"Business\"]")
	WebElement BusinessLink;
	
	@FindBy(xpath = "//*[text() = \"Privacy\"]")
	WebElement PrivacyLink;
	
	
	public  HomePage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void validateAdvertisingLink()
	{
		AdvertisingLink.click();
		
	}
	
	
	public void validateBusinessLink()
	{
	 BusinessLink.click();	
	}
	
	public void validatePrivacyLink()
	{
		PrivacyLink.click();
	}
	
	
			

}
