package FemOnline;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ProductDetailedView 
{
	public static AndroidDriver<MobileElement> driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		driver = AppConfig.loadConfig();
        //User Login
		driver.findElement(By.id("com.femonline:id/inputEmail")).sendKeys("9493140545");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElement(By.id("com.femonline:id/inputPassword")).sendKeys("Hemanth123");
		driver.navigate().back();
        driver.findElement(By.id("com.femonline:id/btnSignIn")).click();
        //Product Search
        driver.findElement(By.id("com.femonline:id/idInputSearch")).sendKeys("Floral Print");
        driver.findElement(By.id("com.femonline:id/idBtnSearch")).click();
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"FLORAL PRINT VOILE BODYSUIT\")").click();
        driver.findElement(By.id("com.femonline:id/idProductImg3")).click();
        
       //Swipe from right to left
        for(int i=0;i<=3;i++)
        {
        WebElement Panel1 = driver.findElement(By.id("android:id/content"));       
		Dimension dimension1 = Panel1.getSize();
		int Anchor1 = Panel1.getSize().getHeight()/2; 
		Double ScreenWidthStart1 = dimension1.getWidth() * 0.8;
		int scrollStart1 = ScreenWidthStart1.intValue();
		Double ScreenWidthEnd1 = dimension1.getWidth() * 0.2;
		int scrollEnd1 = ScreenWidthEnd1.intValue();
		new TouchAction((PerformsTouchActions) driver)
		.press(PointOption.point(scrollStart1, Anchor1))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(scrollEnd1, Anchor1))
		.release().perform();
        }
		
        //swipe from left to right 
		for(int i=0;i<=3;i++)
        {
        WebElement Panel = driver.findElement(By.id("android:id/content"));       
		Dimension dimension = Panel.getSize();
		int Anchor = Panel.getSize().getHeight()/2; 
		Double ScreenWidthStart = dimension.getWidth() * 0.2;
		int scrollStart = ScreenWidthStart.intValue();
		Double ScreenWidthEnd = dimension.getWidth() * 0.8;
		int scrollEnd = ScreenWidthEnd.intValue();
		new TouchAction((PerformsTouchActions) driver)
		.press(PointOption.point(scrollStart, Anchor))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(scrollEnd, Anchor))
		.release().perform();
        }
        
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        for(int i=0;i<=2;i++)
        {
        driver.navigate().back();
        }
	}
}
