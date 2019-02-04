package FemOnline;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AddProductToCart 
{
	public static AndroidDriver<MobileElement> driver;
	public static void main(String[] args) throws MalformedURLException 
	{
		driver=AppConfig.loadConfig();
        //User Login
		driver.findElement(By.id("com.femonline:id/inputEmail")).sendKeys("Hemanth");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElement(By.id("com.femonline:id/inputPassword")).sendKeys("Hemanth@123");
		driver.navigate().back();
        driver.findElement(By.id("com.femonline:id/btnSignIn")).click();
        
        //Product Selection
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"PUNJABI\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"FLORAL PRINT VOILE BODYSUIT\")").click();
        
        //AddToCart
        driver.findElement(By.id("com.femonline:id/idAddtoCart")).click();
        driver.findElement(By.id("com.femonline:id/idCartCount")).click();
        
    }
}
