package FemOnline;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class CancelMyBookings 
{
	public static AndroidDriver<MobileElement> driver;
	public static void main(String[] args) throws MalformedURLException 
	{
		driver = AppConfig.loadConfig();
        //User Login
		driver.findElement(By.id("com.femonline:id/inputEmail")).sendKeys("9493140545");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElement(By.id("com.femonline:id/inputPassword")).sendKeys("Hemanth@123");
		driver.navigate().back();
        driver.findElement(By.id("com.femonline:id/btnSignIn")).click();
        
        //Book A Home Visit
        driver.findElement(By.id("com.femonline:id/btnBookHomeVisit")).click();
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"DRESS\")").click();
        driver.findElement(By.id("android:id/text1")).click();
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"2019-01-19\")").click();
        driver.findElement(By.id("com.femonline:id/idBtnSubmit")).click();
        
        //Navigation Drawer
        driver.findElementByAccessibilityId("Open navigation drawer").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"My Bookings\")").click();
        //Cancel My Bookings
        driver.findElement(By.id("com.femonline:id/idCancel")).click();
        driver.findElementByAccessibilityId("Navigate up").click();
        driver.quit();
	}
}
