package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import genericLibrary.JavaUtility;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import pomClass.LanguagePage;
import pomClass.LoginAndSignUpPage;
import pomClass.RegestrationPage;

public class RegisterTestPomImplementation{
	
	public AndroidDriver<WebElement> driver;
	@Test 
public void HomePageTest () throws InterruptedException
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

	driver = new AndroidDriver<WebElement>(url, cap);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.findElementByAccessibilityId("English (A)").click();
	//driver.findElementByAccessibilityId("Next").click();
	
	
	JavaUtility jutil = new JavaUtility();
	int n=jutil.generateRandomNumber(4000);
	
	LanguagePage lpobj=new LanguagePage(driver);
	lpobj.clickEnglishLaguage();
	//lpobj.clickHindiLanguage();
	
	lpobj.clickNextButton();
	LoginAndSignUpPage login= new LoginAndSignUpPage(driver);
	login.setmobileNumber("234532"+n);
	login.clickNextButton();
	login.clickNonDBTFlow();
	RegestrationPage rpage= new  RegestrationPage(driver);
	rpage.setFarmerName("hello");
	rpage.setFatherMotherHusbandName("hiidf");
	
	
	rpage.setMonth("March");
	rpage.setDay("25");
	rpage.setYear("1998");
	rpage.setGender("Female");
	
}
	

}
