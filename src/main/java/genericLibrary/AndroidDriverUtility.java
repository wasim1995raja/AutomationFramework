package genericLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;

public class AndroidDriverUtility {
	AndroidDriver<WebElement>driver;
	
	public void longClickGesture(WebElement element)
	{
		// Java
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) element).getId()
		));
	}
	
	public void doubleClick(WebElement element)
	{
		// Java
		((JavascriptExecutor) driver).executeScript("mobile: doubleClickGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) element).getId()
		));
	}
	
	public void clickGesture(WebElement element)
	{
		// Java
		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) element).getId()
		));
	}
	
	public void dragGesture(WebElement element)
	{
		// Java
		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) element).getId()
		));
	}
	public void pinchOpenGesture(WebElement element)
	{
		// Java
		((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) element).getId(),
		    "percent", 0.75
		));
	}
	
	public void pinchCloseGesture(WebElement element)
	{
		// Java
		((JavascriptExecutor) driver).executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) element).getId(),
		    "percent", 0.75
		));
	}
	
	public Object swipeGesture()
	{
		ImmutableMap<String, Object> swipeParams= ImmutableMap.<String, Object> builder()
				.put("left", 100)
                .put("top", 100)
                .put("width", 200)
                .put("height", 200)
                .put("direction", "down")
                .put("percent", 3.0)
                .build();
		// Java
		return ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", swipeParams);
	}
	public void scrollGesture(AndroidDriver<WebElement>driver)
	{
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
		
		}

}
