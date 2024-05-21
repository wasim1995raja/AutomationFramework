package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import pomClass.LanguagePage;

public class LoginTest {
	
@Test
	public void demo1() throws MalformedURLException, InterruptedException {
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "OPPO A15");
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	//cap.setCapability(MobileCapabilityType.UDID, "AA5P8TL7SWJNNNR4");
	cap.setCapability(MobileCapabilityType.UDID, "192.168.185.72:4825");
	cap.setCapability("appPackage", "com.dfs.biharkrishi");
	cap.setCapability("appActivity", "com.dfs.biharkrishi.MainActivity");
//	cap.setCapability("ignoreHiddenApiPolicyError", true);
	cap.setCapability("autoGrantPermissions", true);
//	cap.setCapability("app", "C:\\Users\\mdsha\\Desktop\\Apk files\\app-QAdebug2-2-2.apk");

	URL url = null;
	try {
		url = new URL("http://0.0.0.0:4723/wd/hub");
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}

	AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url, cap);
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	driver.findElementByAccessibilityId("English (A)").click();

	AndroidElement f=(AndroidElement)driver.findElementByAccessibilityId("Next");
	f.click();
	AndroidElement d= (AndroidElement)driver.findElement(By.xpath("//android.widget.EditText"));
	d.click();
	d.sendKeys("8887776655");
	//driver.navigate().back();
	driver.hideKeyboard();
	
	AndroidElement h= (AndroidElement)driver.findElementByAccessibilityId("Next");
	h.click();
	
	driver.findElementByAccessibilityId("No").click();
	driver.findElementByAccessibilityId("No").click();
	
	//verify otp
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[4]")).sendKeys("123456");
	driver.findElementByAccessibilityId("Verify").click();
	
	
	
	
	driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
	driver.findElementByAccessibilityId("Edit").click();
	
	AndroidElement firstName=(AndroidElement) driver.findElement(By.xpath("(//android.widget.EditText)[1]"));
	firstName.click();
	firstName.clear();
	firstName.sendKeys("shakiraa");
	driver.navigate().back();
	
	AndroidElement nameOfFather=(AndroidElement)  driver.findElement(By.xpath("(//android.widget.EditText)[2]"));
	nameOfFather.click();
	nameOfFather.clear();
	nameOfFather.sendKeys("jhonny");
	driver.navigate().back();
	
	AndroidElement month= (AndroidElement)driver.findElement(By.xpath("(//android.widget.Button)[2]"));
	
	month.click();
	//month.clear();
	
	String setMonth="March";
	
	driver.findElementByAccessibilityId(setMonth).click();
	
	AndroidElement day=(AndroidElement)driver.findElement(By.xpath("(//android.widget.Button)[3]"));
	day.click();
	
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"22\"))").click();
	
	
	
	

	AndroidElement year=(AndroidElement)driver.findElement(By.xpath("(//android.widget.Button)[4]"));
	year.click();

	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"1995\"))").click();

	
	driver.findElement(By.xpath("(//android.view.View[@content-desc='Select an option'])[1]")).click();
	//x=//android.view.View[@content-desc="Male"]
	driver.findElement(By.xpath("//android.view.View[@content-desc=\"Male\"]")).click();
	
	//webelement female=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Female\"]")).click();
	//webelement male=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Other\"]")).click();
	
	
	
	//farmer type
			//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"Farmer's type *\"))");
//			driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View/android.view.View[6]/android.widget.Button")).click();
//			driver.findElement(By.xpath("//android.view.View[@content-desc=\"Small Farmer\"]")).click();
			//dist
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"District *\"))");

			driver.findElement(By.xpath("(//android.widget.Button[@content-desc=\"Select an option\"])[1]")).click();
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).scrollIntoView(new UiSelector().description(\"PATNA\"))").click();
			
			//block
			//uiautomator new UiSelector().description("Select an option").instance(0)
			//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"Block *\"))");

			driver.findElement(By.xpath("(//android.widget.Button[@content-desc=\"Select an option\"])[1]")).click();
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).scrollIntoView(new UiSelector().description(\"MOKAMA\"))").click();
			
			//vill panchayta
			//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"Block *\"))");

			driver.findElement(By.xpath("(//android.widget.Button[@content-desc=\"Select an option\"])[3]")).click();
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).scrollIntoView(new UiSelector().description(\"SHIV NAGAR\"))").click();
			
			//village
			//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"Village *\"))");

			driver.findElement(By.xpath("(//android.widget.Button[@content-desc=\"Select an option\"])[4]")).click();
			driver.findElement(By.xpath("//android.view.View[@content-desc=\"Jazira Mokama\"]")).click();
			
			//pincode
			//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"Pin Code\"))");

			AndroidElement pin= (AndroidElement) driver.findElement(By.xpath("//android.widget.EditText"));
			pin.click();
			pin.sendKeys("132456");
			driver.hideKeyboard();
			driver.findElementByAccessibilityId("Continue").click();
			
			String s=driver.findElementByAccessibilityId("Your profile is created successfully").getText();
			System.out.println(s);
			
	

	}

}
