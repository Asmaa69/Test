package Package;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class Voucher_Vodafone {

	@Test
	public void Voucher_Vodafone ( AndroidDriver driver ) 
	
	{
         driver.findElement(By.id("com.momkn.newapp:id/cv_voucher")).click();

         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

         driver.findElement(By.xpath("//android.widget.TextView[@text='كروت فودافون']")).click();
                           
         driver.findElement(By.id("com.momkn.newapp:id/spinner_voucher")).click();
    	 
         driver.findElement(By.xpath("//android.widget.TextView[@text='كارت 10']")).click();
  
         driver.findElement(By.id("com.momkn.newapp:id/spinner_count")).click();
         
         driver.findElement(By.xpath("//android.widget.TextView[@text='2']")).click();
         
    	 driver.findElement(By.id("com.momkn.newapp:id/btn_submit")).click(); 
    	 
    	 driver.findElement(By.id("com.momkn.newapp:id/btn_confirm")).click();
    	 
    	 String actualResult = driver.findElement(By.id("com.momkn.newapp:id/tv_message")).getText();
	     String expectResult = "Provider Error";
	     Assert.assertEquals(actualResult , expectResult);  
	     System.out.print(actualResult);  
    	 
    	 driver.findElement(By.id("com.momkn.newapp:id/btn_print")).click();
    	 
	}
	
	}