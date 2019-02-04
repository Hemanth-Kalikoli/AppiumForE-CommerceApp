package FemOnline;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MyAddresses 
{
	public static AndroidDriver<MobileElement> driver;
	public static void main(String[] args) throws MalformedURLException 
	{
		driver=AppConfig.loadConfig();
		OTPValidation.otpValidation(driver); 
		//Registration
		  driver.findElement(By.id("com.femonline:id/inputFirstName")).sendKeys("Hemanth");
		  driver.findElement(By.id("com.femonline:id/inputLastName")).sendKeys("Kalikoli");
		  driver.findElement(By.id("com.femonline:id/idInputUserName")).sendKeys("Heop8129");
		  driver.findElement(By.id("com.femonline:id/ipnutOtp")).sendKeys("123456");
		  driver.findElement(By.id("com.femonline:id/inputEmail")).sendKeys("here048@lssoft.in");
		  driver.navigate().back();
		  driver.findElement(By.id("com.femonline:id/inputPassword")).sendKeys("Hemanth@123");
		  driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		  driver.findElement(By.id("com.femonline:id/inputConfirmPassword")).sendKeys("Hemanth@123");
		  driver.navigate().back();
		  driver.findElement(By.id("com.femonline:id/btnRegister")).click();
		//MyAddresses
		driver.findElement(By.id("com.femonline:id/idAddAddress")).click();
		driver.findElement(By.id("com.femonline:id/idBtnUseCurrentLocation")).click();
		try
		{
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		}
		catch(NoSuchElementException e) 
		{
			e.printStackTrace();
		}
		driver.findElement(By.id("com.femonline:id/btnSave")).click();
	}
}