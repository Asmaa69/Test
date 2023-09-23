package Package;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Reprint { 
	
	
        public void Reprint(AndroidDriver driver) { 

    	 driver.findElement(By.id("com.momkn.newapp:id/ivIconNavigation")).click();
    	 
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     	 driver.findElement(By.xpath("//androidx.appcompat.widget.LinearLayoutCompat[@index=7]")).click();
     	 // tageName[@attibute='value'] tagename = class , attibute='value' = text

    	 driver.findElement(By.id("com.momkn.newapp:id/cv_bills")).click();
    	 driver.findElement(By.id("com.momkn.newapp:id/cb_bills")).click();
    	 driver.findElement(By.id("com.momkn.newapp:id/tv_date1")).click();

    	 driver.findElement(By.id("com.momkn.newapp:id/btn_dialog_date_decide")).click();

    	 driver.findElement(By.id("com.momkn.newapp:id/tv_date2")).click();

    	 driver.findElement(By.id("com.momkn.newapp:id/btn_dialog_date_decide")).click();

    	 driver.findElement(By.id("com.momkn.newapp:id/btn_submit")).click();

    	 driver.findElement(By.xpath("//android.widget.RelativeLayout[2]")).click();

    	 driver.findElement(By.id("com.momkn.newapp:id/btn_print")).click();

    	 driver.findElement(By.id("com.momkn.newapp:id/btn_cancel")).click();
	     	 
	}

	}
