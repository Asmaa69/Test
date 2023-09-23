
package Package;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base{
	
	String PLATFORM_NAME ;
	String DeviceName ;
	String PLATFORM_VERSION ;
	String udid ;
	@Test
	@Parameters ({"PLATFORM_NAME","DeviceName","PLATFORM_VERSION","udid"})
	public  AndroidDriver capabilities() throws MalformedURLException
	
	{
   	 AndroidDriver  driver ;
	 File f = new File("src");
     File app = new File(f,"pax_july_release_V6.apk"); 
     DesiredCapabilities capabilities = new DesiredCapabilities();
     capabilities.setCapability(CapabilityType.PLATFORM_NAME ,Configration.PLATFORM_NAME);
     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, Configration.DEVICE_NAME);
     capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION , Configration.PLATFORM_VERSION);
     capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
     driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
     
  
     /*
      code pop window for mobile
    
     driver.switchTo().alert().accept();
     driver.switchTo().alert().accept();
     driver.switchTo().alert().dismiss();
     driver.findElement(By.id("com.momkn.newapp:id/btn_cancel")).click();
     driver.findElement(By.id("com.momkn.newapp:id/btn_login")).click();
     driver.switchTo().alert().accept();
     driver.findElement(By.id("com.momkn.newapp:id/btn_login")).click();

     */
     
       // Reprint Rep = new Reprint();
	    //Rep.Reprint(driver); 

	    return driver;
	}
}
