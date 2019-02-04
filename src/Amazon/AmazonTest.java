package Amazon;
 
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
 
public class AmazonTest {
 
private static AndroidDriver<MobileElement> driver;
 public static void main(String[] args) throws MalformedURLException, InterruptedException {
 
 File classpathRoot = new File(System.getProperty("user.dir"));
 File appDir = new File(classpathRoot, "/Apps/Amazon/");
 File app = new File(appDir, "in.amazon.mShop.android.shopping.apk");
 
 DesiredCapabilities capabilities = new DesiredCapabilities();
 capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
 capabilities.setCapability("deviceName", "Moto G4 Plus");
 capabilities.setCapability("platformVersion", "7.0");
 capabilities.setCapability("platformName", "Android");
 capabilities.setCapability("app", app.getAbsolutePath());
 capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
 capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");

 driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
 Thread.sleep(10000);
 driver.quit();
 
 }
 
}