package FemOnline;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;

public class Seekbar 
{
	public static void main(String[] args) throws MalformedURLException 
	{
		AndroidDriver<MobileElement> driver = AppConfig.loadConfig();
		driver.findElement(By.id("com.femonline:id/inputEmail")).sendKeys("9493140545");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElement(By.id(AppConfig.APP_PACKAGE_NAME+":id/inputPassword")).sendKeys("Hemanth123");
		driver.navigate().back();
        driver.findElement(By.id("com.femonline:id/btnSignIn")).click();
        
        driver.findElement(By.xpath("//android.widget.Button[@text='BOOK A HOME VISIT']")).click();
     //Locating seekbar using resource id
    	  MobileElement seekbar = driver.findElement(By.id("com.femonline:id/idPriceRangeSeekBar"));
               // get start co-ordinate of seekbar
               int start=seekbar.getLocation().getX();
               //Get width of seekbar
               int end=seekbar.getSize().getWidth();
               //get location of seekbar vertically
               int y=seekbar.getLocation().getY();
           // Select till which position you want to move the seekbar
           TouchAction action=new TouchAction(driver);
           int moveTo=(int)(end*0.90);
           action.press(PointOption.point(start,y)).moveTo(PointOption.point(moveTo,y)).release().perform();
             	
	}
}
