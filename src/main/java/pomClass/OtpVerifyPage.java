package pomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OtpVerifyPage {
	
	AndroidDriver<WebElement>driver;
	
//	@FindBy (accessibility = "Please verify your O.T.P.")
//	private WebElement otpHeader;
//	
//	
//	@FindBy (accessibility = "O.T.P. not received")
//	private WebElement otpNotReceivedMeassage;
//	
//	@FindBy (accessibility ="Resend O.T.P." )
//	private WebElement resendOtpFeature;
	
	@FindBy (xpath = "//android.view.View[@content-desc=\"Verify\"]")
	private WebElement verifyButton;
	
	@FindBy(xpath = "(//android.widget.EditText)[1]")
	private WebElement otpBox;
	
	
	public OtpVerifyPage(AndroidDriver<WebElement> driver)
	{
		PageFactory.initElements(driver, this);
		
		
	}
	
//	public String getOtpHeader()
//	{
//		return otpHeader.getText().trim();
//	}
	
//	public String getEnterOtpMessage()
//	{
//		return enterOtpMessage.getText().trim();
//	}
//	
//	public void enterOtpInBox(String otp)
//	{
//		otpBoxField.sendKeys(otp);
//	}
	
//	public void getOtpNotReceivedMsg()
//	{
//		otpNotReceivedMeassage.getText().trim();
//	}
//	
//	public void clickResendOtpFeature()
//	{
//		resendOtpFeature.click();
//	}
	
	public void setOtp(String otp)
	{
		otpBox.sendKeys(otp);
		driver.hideKeyboard();
		verifyButton.click();
	}
	
	

}
