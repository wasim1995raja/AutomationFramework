package pomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OtpVerifyPage {
	
	AndroidDriver<WebElement>driver;
	
	@AndroidFindBy (accessibility = "Please verify your O.T.P.")
	private WebElement otpHeader;
	
	@AndroidFindBy (accessibility = "Please enter the O.T.P. sent to this mobile number")
	private WebElement enterOtpMessage;
	
	@AndroidFindBy (uiAutomator = "new UiSelector().className('android.view.View').instance(7)")
	private WebElement otpBoxField;
	
	@AndroidFindBy (accessibility = "O.T.P. not received")
	private WebElement otpNotReceivedMeassage;
	
	@AndroidFindBy (accessibility ="Resend O.T.P." )
	private WebElement resendOtpFeature;
	
	@AndroidFindBy (accessibility = "Verify")
	private WebElement verifyFeature;
	
	
	public OtpVerifyPage(AndroidDriver<WebElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	public String getOtpHeader()
	{
		return otpHeader.getText().trim();
	}
	
	public String getEnterOtpMessage()
	{
		return enterOtpMessage.getText().trim();
	}
	
	public void enterOtpInBox(String otp)
	{
		otpBoxField.sendKeys(otp);
	}
	
	public void getOtpNotReceivedMsg()
	{
		otpNotReceivedMeassage.getText().trim();
	}
	
	public void clickResendOtpFeature()
	{
		resendOtpFeature.click();
	}
	
	public void clickVerifyFeature()
	{
		verifyFeature.click();
	}

}
