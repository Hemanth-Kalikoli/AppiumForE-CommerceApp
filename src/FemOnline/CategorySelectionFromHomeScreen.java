package FemOnline;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class CategorySelectionFromHomeScreen 
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
        //Category Selection
        WebDriverWait wait = new WebDriverWait(driver,20);   //Explicit Wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.femonline:id/recyclerView_productcategoryitems"))); 
        driver.findElement(By.id("com.femonline:id/idBtnCat")).click();
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"NEW ARRIVALS\")").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.GridView"))); 
        driver.navigate().back();
        //SignOut
        driver.findElement(By.className("android.widget.ImageButton")).click();
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Signout\")").click();
       driver.quit();
	}
}
