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
//	String setDay="22";
//	WebElement dateClick= driver.findElementByAccessibilityId(setDay);
	//String s=dateClick.getText();
	
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"22\"))").click();
	
	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"22\"));");
	//dateClick.click();
	
	
	
//	((JavascriptExecutor)driver).executeScript("mobile: scrollGesture", ImmutableMap.of("elementId",((RemoteWebElement)dateClick),"duration", 2000));
//	dateClick.click();
//	
////	AndroidDriver<AndroidElement> androidDriver = (AndroidDriver<AndroidElement>) driver;
////	String scrollableListContainer = "new UiScrollable(new UiSelector().scrollable(true))";
////	String uiSelectorForYear = ".scrollIntoView(new UiSelector().text(\"22\"))";
////	
////	String scrollableCommand = scrollableListContainer + uiSelectorForYear;
////	
////	
////	androidDriver.findElementByAndroidUIAutomator(scrollableCommand);
//	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"22\"))").click();
	
	AndroidElement year=(AndroidElement)driver.findElement(By.xpath("(//android.widget.Button)[4]"));
	year.click();
//	String setYear="1995";
//	driver.findElementByAccessibilityId(setYear).click();
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"1995\"))").click();

	
	
	
	

	}

}
