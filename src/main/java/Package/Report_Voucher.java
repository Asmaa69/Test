package Package;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

 public class Report_Voucher extends Base {
	
	AndroidDriver  driver ;

	@Test
	public void Instullment() throws MalformedURLException, Exception
	{
        driver = capabilities();	
        Voucher_Vodafone Voda = new Voucher_Vodafone();
		Voda.Voucher_Vodafone(driver);  
		
		
	}

}
