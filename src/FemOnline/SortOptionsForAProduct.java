package FemOnline;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class SortOptionsForAProduct 
{
	public static AndroidDriver<MobileElement> driver;
	public static void main(String[] args) throws MalformedURLException 
	{
		driver = AppConfig.loadConfig();
        //User Login
		driver.findElement(By.id("com.femonline:id/inputEmail")).sendKeys("9493140545");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElement(By.id("com.femonline:id/inputPassword")).sendKeys("Hemanth123");
		driver.navigate().back();
        driver.findElement(By.id("com.femonline:id/btnSignIn")).click();
        
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"GHAGRA\")").click();
        driver.findElement(By.id("com.femonline:id/idSort")).click();
        driver.findElement(By.id("com.femonline:id/idBtnSortLatest")).click();
        driver.findElement(By.id("com.femonline:id/idSort")).click();
        driver.findElement(By.id("com.femonline:id/idBtnSortLowToHigh")).click();
        driver.findElement(By.id("com.femonline:id/idSort")).click();
        driver.findElement(By.id("com.femonline:id/idBtnSortHighToLow")).click();
        driver.navigate().back();
        
	}
}
