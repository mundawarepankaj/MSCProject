package MAinPAckage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import TestBase.*;

public class BusinessPage extends Base
{

	
	public BusinessPage() throws IOException 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	

}
