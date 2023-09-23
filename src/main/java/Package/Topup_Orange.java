package Package;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class Topup_Orange extends Base {

	@Test
	public void Topup() throws MalformedURLException, InterruptedException
	{
		AndroidDriver driver = capabilities();

         driver.findElement(By.id("com.momkn.newapp:id/iv_topup")).click();

         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

         driver.findElement(By.xpath("//android.widget.TextView[@text='شحن أورانج']")).click();
                  
    	 driver.findElement(By.xpath("//android.widget.RelativeLayout[1]")).click();
    	
    	 driver.findElement(By.id("com.momkn.newapp:id/spinner_topup")).click();
    	 
         driver.findElement(By.xpath("//android.widget.TextView[@text='كارت الكبير وحدات']")).click();
    	 
         driver.findElement(By.id("com.momkn.newapp:id/et_mobile")).sendKeys("01093789066");
                 
    	 driver.findElement(By.id("com.momkn.newapp:id/spinnerSub_topup")).click();

         driver.findElement(By.xpath("//android.widget.TextView[@text='10 جنيه']")).click();
          
    	 driver.findElement(By.id("com.momkn.newapp:id/btn_submit")).click(); 

    	 driver.findElement(By.id("com.momkn.newapp:id/btn_confirm")).click();
    	 
    	 driver.findElement(By.id("com.momkn.newapp:id/btn_print")).click(); 
    	 
    	 driver.findElement(By.id("com.momkn.newapp:id/tv_arrowBack")).click(); 
    	 
    	 driver.findElement(By.id("com.momkn.newapp:id/tv_arrowBack")).click(); 

    	 driver.findElement(By.id("com.momkn.newapp:id/tv_arrowBack")).click();	 
    	 
    	
	}
	
	}