package test;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import genericLibrary.BaseClass;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.bys.builder.AppiumByBuilder;

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
		
		Random r= new Random();
		int rm=r.nextInt(400);
		//enter mobile no and click next
		WebElement phone= driver.findElement(By.xpath("//android.widget.EditText"));
		phone.click();
		phone.sendKeys("4443337"+rm);
		driver.hideKeyboard();
		driver.findElementByAccessibilityId("Next").click();
		//driver.findElementByAccessibilityId("Next").click();
	//	driver.findElement(By.xpath("(//android.view.View)[2]")).click();
		driver.findElementByAccessibilityId("No").click();
		driver.findElementByAccessibilityId("No").click();
//		MobileElement d= (MobileElement) driver.findElement(By.xpath("android.widget.EditText"));
//		
//		d.sendKeys("12345");
//		driver.navigate().back();
//		
//		driver.findElement(By.xpath("(//android.view.View)[6]")).click();
		Thread.sleep(2000);
		
		AndroidElement fname=(AndroidElement) driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View/android.widget.EditText[1]"));
		fname.click();
		fname.sendKeys("hdhgshg");
		driver.hideKeyboard();
		AndroidElement fathername= (AndroidElement)driver.findElement(By.xpath("(//android.widget.EditText)[2]"));
		fathername.click();
		fathername.sendKeys("wejdndc");
		driver.hideKeyboard();
		
		AndroidElement month= (AndroidElement)driver.findElement(By.xpath("(//android.widget.Button)[1]"));
		month.click();
		String setMonth="March";
		
		driver.findElementByAccessibilityId(setMonth).click();
		
		AndroidElement day=(AndroidElement)driver.findElement(By.xpath("(//android.widget.Button)[2]"));
		day.click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"22\"))").click();

		AndroidElement year=(AndroidElement)driver.findElement(By.xpath("(//android.widget.Button)[3]"));
		year.click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"1995\"))").click();

		driver.findElement(By.xpath("(//android.view.View[@content-desc='Select an option'])[1]")).click();
		//x=//android.view.View[@content-desc="Male"]
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Male\"]")).click();
		
		//webelement female=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Female\"]")).click();
		//webelement male=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Other\"]")).click();
		
		//driver.findElement(By.xpath("(//android.view.View)[7]")).click();
		
		//farm cat
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.view.View\").instance(16))");
		driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(4)").click();
		//driver.findElement(By.xpath("(//android.widget.Button)[1]")).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Own\"]")).click();
		
		//driver.findElement(By.xpath("//android.view.View[@content-desc=\"Rented\"]")).click();
		//driver.findElement(By.xpath("//android.view.View[@content-desc=\"Own Land + Rented Land\"]")).click();

		//cast cat
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"Farmer's type *\"))");

		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"Caste category *\"))");
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Select an option\"]/android.widget.Button")).click();
		//driver.findElement(By.xpath("(//android.widget.Button)[2]")).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Minority\"]")).click();
		
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(description(\"Farmer's type *\"));");
		//driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(6)").click();

		ImmutableMap<String, Object> scrollParams= ImmutableMap.<String, Object> builder()
				.put("left", 100)
                .put("top", 100)
                .put("width", 300)
                .put("height", 1200)
                .put("direction", "down")
                .put("percent", 3.0)
                .build();
		// Java
		boolean 
		canScrollMore= (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", scrollParams);
		
		driver.findElement(By.xpath("(//android.widget.Button)[3]")).click();

	
		
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Small Farmer\"]")).click();
		//driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.view.View\").instance(16)").click();
		
		
		
	
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"Select an option\").instance(0))");
		driver.findElement(By.xpath("(//android.widget.Button[@content-desc=\"Select an option\"])[1]")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"PATNA\"))").click();
		
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"Select an option\").instance(1))");
		driver.findElement(By.xpath("(//android.widget.Button[@content-desc=\"Select an option\"])[1]")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"MOKAMA\"))").click();
		
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"Select an option\").instance(2))");
		driver.findElement(By.xpath("(//android.widget.Button[@content-desc=\"Select an option\"])[1]")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"SHIV NAGAR\"))").click();

		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"Select an option\").instance(3))");

		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Select an option\"]")).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"SHIVNAR\"]")).click();
		
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.EditText\"))");
		ImmutableMap<String, Object> scrollParams1= ImmutableMap.<String, Object> builder()
				.put("left", 100)
                .put("top", 100)
                .put("width", 300)
                .put("height", 1200)
                .put("direction", "down")
                .put("percent", 3.0)
                .build();
		// Java
		boolean 
		canScrollMore1= (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", scrollParams1);
		
		AndroidElement pin= (AndroidElement) driver.findElement(By.xpath("//android.widget.EditText"));
		pin.click();
		pin.sendKeys("132456");
		driver.hideKeyboard();
		driver.findElementByAccessibilityId("Continue").click();
		
		
		String s=driver.findElementByAccessibilityId("Your profile is created successfully").getText();
		System.out.println(s);
		driver.findElementByAccessibilityId("Continue").click();

	}

}
