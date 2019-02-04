package FemOnline;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class UserRegistration
{
	public static AndroidDriver<MobileElement> driver;
	public static void main(String[] args) throws MalformedURLException 
	{
		driver=AppConfig.loadConfig();
		OTPValidation.otpValidation(driver); 
		registration();
	}
		public static void registration()
		{
		  driver.findElement(By.id("com.femonline:id/inputFirstName")).sendKeys("Hemanth");
		  driver.findElement(By.id("com.femonline:id/inputLastName")).sendKeys("Kalikoli");
		  driver.findElement(By.id("com.femonline:id/idInputUserName")).sendKeys("Hemanth71812");
		  driver.findElement(By.id("com.femonline:id/ipnutOtp")).sendKeys("123456");
		  driver.findElement(By.id("com.femonline:id/inputEmail")).sendKeys("hem91@l9ssoft.in");
		  driver.navigate().back();
		  driver.findElement(By.id("com.femonline:id/inputPassword")).sendKeys("Hemanth@123");
		  driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		  driver.findElement(By.id("com.femonline:id/inputConfirmPassword")).sendKeys("Hemanth@123");
		  driver.navigate().back();
		  driver.findElement(By.id("com.femonline:id/btnRegister")).click();
		}		  
	}

