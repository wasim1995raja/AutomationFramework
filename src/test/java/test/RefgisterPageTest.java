package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.collect.ImmutableMap;

import genericLibrary.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pomClass.LanguagePage;
import pomClass.LoginAndSignUpPage;

public class RefgisterPageTest extends BaseClass {
	

	@Test
	public void test1() throws InterruptedException
		
	
	{
		//hindi language
		//driver.findElement(By.xpath("(//android.view.View)[6]")).click();
		
		//english language
		driver.findElementByAccessibilityId("English (A)").click();
		driver.findElement(By.xpath("(//android.view.View)[9]")).click();
		//driver.findElementByAccessibilityId("Next").click();
		
		//enter mobile no and click next
		WebElement phone= driver.findElement(By.xpath("//android.widget.EditText"));
		phone.click();
		phone.sendKeys("4443337733");
		driver.hideKeyboard();
		driver.findElementByAccessibilityId("Next").click();
		//driver.findElementByAccessibilityId("Next").click();
		driver.findElement(By.xpath("(//android.view.View)[2]")).click();
		driver.findElement(By.xpath("//android.view.View/android.view.View[1]/android.view.View/android.view.View[3]")).click();
		driver.findElement(By.xpath("(//android.view.View)[2]")).sendKeys("12345");
		driver.findElement(By.xpath("(//android.view.View)[6]")).click();
		
		
		
		
	}

}
