package genericLibrary;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	public AndroidDriver  <AndroidElement> driver;
	@BeforeClass
	public void classConfiguration()
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "OPPO A15");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		cap.setCapability(MobileCapabilityType.UDID, "AA5P8TL7SWJNNNR4");
		//cap.setCapability(MobileCapabilityType.UDID, "192.168.185.72:4825");
		cap.setCapability("appPackage", "com.dfs.biharkrishi");
		cap.setCapability("appActivity", "com.dfs.biharkrishi.MainActivity");
		cap.setCapability("autoGrantPermissions", true);

		URL url = null;
		try {
			url = new URL("http://0.0.0.0:4723/wd/hub");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		driver = new AndroidDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//driver.findElementByAccessibilityId("English (A)").click();
		//driver.findElementByAccessibilityId("Next").click();
	}
	
//	@AfterClass
//	public void classTeardown()
//	{
//		
//	}
}
