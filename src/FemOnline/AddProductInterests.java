package FemOnline;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AddProductInterests 
{
	public static AndroidDriver<MobileElement> driver;
	public static void main(String[] args) throws MalformedURLException 
	{
		driver = AppConfig.loadConfig();
        //User Login
		driver.findElement(By.id("com.femonline:id/inputEmail")).sendKeys("Hemanth");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElement(By.id("com.femonline:id/inputPassword")).sendKeys("Hemanth@123");
		driver.navigate().back();
        driver.findElement(By.id("com.femonline:id/btnSignIn")).click();    
        
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"GHAGRA\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"TUSSAR SILK\")").click();
        
        driver.findElement(By.id("com.femonline:id/idToggleFav")).click();
        for(int i=0;i<2;i++)
        {
        driver.findElementByAccessibilityId("Navigate up").click();
        }
        
        driver.findElementByAccessibilityId("Open navigation drawer").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Interests\")").click();
   }
}