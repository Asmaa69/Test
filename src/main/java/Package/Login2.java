
package Package;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

 public class Login2 {
	  
	@Test
	public void Login2( AndroidDriver  driver )  
	{
	
     driver.findElement(By.id("com.momkn.newapp:id/et_usernameLogin")).sendKeys(Constants.username);
     driver.findElement(By.id("com.momkn.newapp:id/et_passwordLogin")).sendKeys(Constants.password);
     driver.findElement(MobileBy.AndroidUIAutomator( "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10)"));
     driver.findElement(By.id("com.momkn.newapp:id/et_centerIdLogin")).sendKeys(Constants.centerIdLogin);
     driver.findElement(By.id("com.momkn.newapp:id/saveData")).click();
     driver.findElement(By.id("com.momkn.newapp:id/btn_login")).click(); 
     
	}	
 }

 