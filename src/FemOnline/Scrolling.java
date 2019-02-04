package FemOnline;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Scrolling 
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
        driver.findElement(By.id("com.femonline:id/btnBookHomeVisit")).click();
        WebDriverWait wait = new WebDriverWait(driver,20);   //Explicit Wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.femonline:id/recyclerview")));
}
	
	public void scrollDown() 
	{
		Dimension dimensions = driver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.2;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.8;
		int scrollEnd = screenHeightEnd.intValue();
			
		new TouchAction((PerformsTouchActions)driver)
			.press(PointOption.point(0, scrollStart))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
			.moveTo(PointOption.point(0, scrollEnd))
			.release().perform();
	}
	public List<MobileElement> getItemView()
	{
		return (List<MobileElement>) driver.findElements(By.xpath("//android.widget.CheckBox[@text='SAREE']"));
	}
	public void scrollTillDress() throws InterruptedException
	{
		while(getItemView().size()==0)
		{
			scrollDown();
		}
		if(getItemView().size()>0)
		{
			getItemView().get(0).click();
		}
		Thread.sleep(4000);
	}
	
}