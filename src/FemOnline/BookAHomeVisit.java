package FemOnline;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class BookAHomeVisit 
{
	public static AndroidDriver<MobileElement> driver;
	public static void main(String[] args) throws Exception 
	{
		driver = AppConfig.loadConfig();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
        //User Login
		driver.findElement(By.id("com.femonline:id/inputEmail")).sendKeys("9493140545");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElement(By.id("com.femonline:id/inputPassword")).sendKeys("Hemanth123");
		driver.navigate().back();
        driver.findElement(By.id("com.femonline:id/btnSignIn")).click();
        
        //Bookahomevisit
        driver.findElement(By.id("com.femonline:id/btnBookHomeVisit")).click();
        WebDriverWait wait = new WebDriverWait(driver,20);   //Explicit Wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.femonline:id/recyclerview")));
        driver.findElement(By.id("com.femonline:id/idBtnDate")).click();
        driver.findElement(By.id("com.femonline:id/rightButton")).click();
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"6\")").click();
        driver.findElement(By.id("com.femonline:id/idTimeSlotSpinner")).click();
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"12:00 - 13:00\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"DRESS\")").click();
        MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.femonline:id/idCheckBox\")).scrollIntoView("
				+ "new UiSelector().text(\"SAREE\"))"));
        element.click();
        driver.findElement(By.id("com.femonline:id/idBtnSubmit")).click();
	}
   }  	
       
