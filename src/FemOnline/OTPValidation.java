package FemOnline;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class OTPValidation 
{
	public static AndroidDriver<MobileElement> driver;
	
	public static void main(String[] args) throws MalformedURLException
	{
	  driver= AppConfig.loadConfig();
	  otpValidation(driver);
	}
	 //OTP validation
	 public static void otpValidation(AndroidDriver<MobileElement> driver) 
	  {
	  driver.findElement(By.id("com.femonline:id/btnNavRegister")).click();
	  driver.findElement(By.id("com.femonline:id/inputMobile")).sendKeys("9428841860");
	  driver.navigate().back();
	  driver.findElement(By.id("com.femonline:id/btnGetOTP")).click();
	  driver.findElement(By.id("com.femonline:id/inputOtp")).sendKeys("123456");
	  driver.navigate().back();
	  driver.findElement(By.id("com.femonline:id/btnSignup")).click();
	  
	  }
	 
}

