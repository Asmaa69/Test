package Package;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class Premium_Card { 

	@Test
	public void Premium_Card(AndroidDriver  driver ) 
	{
	
        driver.findElement(MobileBy.AndroidUIAutomator( "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));

        driver.findElement(By.id("com.momkn.newapp:id/iv_installment")).click();

         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(MobileBy.AndroidUIAutomator( "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(4)"));

    	driver.findElement(By.xpath("//android.widget.TextView[@text='بريميوم كارد']")).click();

    	driver.findElement(By.xpath("//android.widget.TextView[@text='دفع اقساط شهرية']")).click();


         driver.findElement(By.id("com.momkn.newapp:id/et_transactionId")).sendKeys("1111111111111127");
    	 driver.findElement(By.id("com.momkn.newapp:id/btn_submit")).click();
    	 driver.findElement(By.id("com.momkn.newapp:id/btn_confirm")).click();
    	 driver.findElement(By.id("com.momkn.newapp:id/btn_confirm")).click();
    	 driver.findElement(By.id("com.momkn.newapp:id/btn_confirm")).click();
    	 driver.findElement(By.id("com.momkn.newapp:id/btn_cancel")).click();


	}

	}


