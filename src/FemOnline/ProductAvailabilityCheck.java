package FemOnline;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class ProductAvailabilityCheck {
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
 
       //Product Search
        driver.findElement(By.id("com.femonline:id/idInputSearch")).sendKeys("Linen Silk");
        driver.findElement(By.id("com.femonline:id/idBtnSearch")).click();
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"LINEN SILK\")").click();
        
        //Check Availability
        driver.findElement(By.id("com.femonline:id/idQTY")).click();
        driver.findElement(By.id("com.femonline:id/idInputQTy")).sendKeys("5");
        driver.findElement(By.id("com.femonline:id/btnCheckAvailability")).click(); 
	}

}
