package Package;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class donations extends Base { 

   @Test
	public  void donations () throws MalformedURLException
	{
		AndroidDriver  driver = capabilities();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.findElement(By.id("com.momkn.newapp:id/cv_donations")).click();

    	driver.findElement(By.xpath("//android.widget.TextView[@text='مؤسسة مستشفي سرطان الأطفال 57357 – مصر']")).click();

    	driver.findElement(By.xpath("//android.widget.TextView[@text='التبرع العام']")).click();

         driver.findElement(By.id("com.momkn.newapp:id/et_telecode")).sendKeys("01093789066");
         driver.findElement(By.id("com.momkn.newapp:id/et_phone")).sendKeys("5");
    	 driver.findElement(By.id("com.momkn.newapp:id/btn_submit")).click();
    	 driver.findElement(By.id("com.momkn.newapp:id/btn_confirm")).click();
    	 driver.findElement(By.id("com.momkn.newapp:id/btn_cancel")).click();


	}

	}


