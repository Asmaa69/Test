package Package;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public  class Configration {
	
	 Configration() {} 
	
	public static String PLATFORM_NAME = "Android Device" ;
	public static String DEVICE_NAME = "MTP USB Device";
	public static String PLATFORM_VERSION = "7.1.2" ;

}
