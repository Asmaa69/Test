package Package;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

 public class MainPage extends Base { 
	
	AndroidDriver  driver ;

	@Test
	public void MainPage() throws MalformedURLException, Exception
	{
        driver = capabilities();	
		Login2 log = new Login2();
		log.Login2(driver);  
		
		Redec red = new Redec();
		red.Redec(driver);  
		
		driver.close();
	}

	/*
	@AfterClass
	public void afterclass() {
	
	driver .close();
	
 }
 */
}
