package Package;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class Redec  {
	
@Test
	public void Redec (AndroidDriver driver )  {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(MobileBy.AndroidUIAutomator( "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));

		driver.findElement(By.id("com.momkn.newapp:id/iv_installment")).click(); 

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(MobileBy.AndroidUIAutomator( "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));

		driver.findElement(By.xpath("//android.widget.TextView[@text='ريدك جمعية تنمية المشروعات الصغيرة ببني سويف']")).click();

		driver.findElement(By.id("com.momkn.newapp:id/et_transactionId")).sendKeys("11111111111127");
		driver.findElement(By.id("com.momkn.newapp:id/btn_submit")).click();
	
	    String actualResult = driver.findElement(By.id("com.momkn.newapp:id/tv_message")).getText();
	     String expectResult = "Provider Error";
	     Assert.assertEquals(actualResult , expectResult);  
	     System.out.print(actualResult);  
	     
		 /*
		driver.findElement(By.id("com.momkn.newapp:id/et_amount")).sendKeys("150");
		driver.findElement(By.id("com.momkn.newapp:id/btn_confirm")).click();
		driver.findElement(By.id("com.momkn.newapp:id/btn_confirm")).click();
		driver.findElement(By.id("com.momkn.newapp:id/btn_confirm")).click();
		driver.findElement(By.id("com.momkn.newapp:id/btn_cancel")).click(); 
		*/
				
  	 

	    	 Reprint rep = new Reprint();
	         rep.Reprint(driver);  	
		 
				
	}
}

