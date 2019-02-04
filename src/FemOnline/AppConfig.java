package FemOnline;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppConfig 
{
	public static final String DEVICE_NAME="Moto G4";
	public static final String ADB_IP="192.168.0.4:5555";
	public static final String APP_PACKAGE_NAME="com.femonline";
	public static final String DEVICE_OS="Android";
	public static final String ANDROID_OS_VERSION="7.0";
	public static final boolean RESET=true;
	public static final String URL="http://0.0.0.0:4723/wd/hub";
	
	public static AndroidDriver<MobileElement> loadConfig() throws MalformedURLException
	{
		 DesiredCapabilities deca=new DesiredCapabilities();
		  deca.setCapability("deviceName", DEVICE_NAME);
		  deca.setCapability("udid", ADB_IP); //Connected via wifi
		  deca.setCapability("platformName", DEVICE_OS);
		  deca.setCapability("platformVersion", ANDROID_OS_VERSION);
		  deca.setCapability("appPackage", APP_PACKAGE_NAME);
		  deca.setCapability("appActivity", "activities.SplashScreenActivity");
		  deca.setCapability("noReset", RESET);
		  AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(new URL(URL), deca);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		  return driver;
		 
	}
}
