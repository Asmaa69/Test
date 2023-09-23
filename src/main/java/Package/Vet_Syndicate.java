 package Package;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

@Test
public class Vet_Syndicate { 
	
  @Test
	public void Vet_Syndicate (AndroidDriver  driver ) 
	{

        //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"النقابات\").instance(0))")).click();
        driver.findElement(MobileBy.AndroidUIAutomator( "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));

          driver .findElement(By.id("com.momkn.newapp:id/cv_syndicates")).click();
    //	   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"نقابة البيطريين\"));"));
           driver.findElement(MobileBy.AndroidUIAutomator( "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10)"));


    	driver.findElement(By.xpath("//android.widget.TextView[@text='نقابة البيطريين']")).click();

       	driver.findElement(By.xpath("//android.widget.TextView[@text='اشتراكات']")).click();

         driver.findElement(By.id("com.momkn.newapp:id/et_billing_account")).sendKeys("808");

    	 driver.findElement(By.id("com.momkn.newapp:id/btn_submit")).click();

    	 driver.findElement(By.id("com.momkn.newapp:id/btn_confirm")).click();

    	 driver.findElement(By.id("com.momkn.newapp:id/btn_confirm")).click();

    	  driver.findElement(By.id("com.momkn.newapp:id/btn_confirm")).click();
    	  
     	   driver.findElement(By.id("com.momkn.newapp:id/btn_cancel")).click();

	}

	}


