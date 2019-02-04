package FemOnline;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ForgotPassword {

	public static void main(String[] args) throws MalformedURLException 
	{
		AndroidDriver<MobileElement> driver = AppConfig.loadConfig();
		driver.findElement(By.id("com.femonline:id/btnForgotPassword")).click();
		driver.findElement(By.id("com.femonline:id/inputMobile")).sendKeys("9493140545");
		driver.findElement(By.id("com.femonline:id/btnEnter")).click();
		driver.findElement(By.id("com.femonline:id/ipnutOtp")).sendKeys("123456");
		driver.findElement(By.id("com.femonline:id/inputPassword")).sendKeys("hemanth321");
		driver.findElement(By.id("com.femonline:id/inputConfirmPassword")).sendKeys("hemanth321");
		driver.navigate().back();
		driver.findElement(By.id("com.femonline:id/btnResetPassword")).click();
	}

}
