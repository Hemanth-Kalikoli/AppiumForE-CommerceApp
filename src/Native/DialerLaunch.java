package Native;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DialerLaunch 
{
  public static void main(String[] args) throws MalformedURLException
  {
	  DesiredCapabilities deca=new DesiredCapabilities();
	  deca.setCapability("deviceName", "Moto G4");
	  deca.setCapability("udid", "ZY2238VS7K");
	  deca.setCapability("platformName", "Android");
	  deca.setCapability("platformVersion", "7.0");
	  deca.setCapability("appPackage", "com.android.dialer");
	  deca.setCapability("appActivity", "com.android.dialer.DialtactsActivity");
	  deca.setCapability("noReset", "true");
	  AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), deca);
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Contacts\"]")).click();
	  
	  
  }
}
