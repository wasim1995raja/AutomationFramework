package pomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LoginAndSignUpPage {
	AndroidDriver<WebElement>driver;
	
//	@FindBy (accessibility = "Login | Sign Up")
//	private WebElement loginAndSignUpHeader;
	
	
	
	@FindBy (xpath = "//android.view.View[@content-desc=\"Mobile number\"]")
	private WebElement mobileNumberHeader;
	
	@FindBy (xpath = "//android.widget.EditText")
	private WebElement mobileNumberInputBox;
	
	@FindBy (xpath = "//android.view.View[@content-desc=\"Next\"]")
	private WebElement nextButton;
	
	@FindBy (xpath = "//android.view.View[@content-desc=\"No\"]")
	private WebElement nonDbtFlow;
	
	
	public LoginAndSignUpPage(AndroidDriver<WebElement> driver )
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	public String getLoginAndSignUpHeader()
//	{
//		return loginAndSignUpHeader.getText().trim();
//	}
	
	public String getmobileNumberHeader()
	{
		return mobileNumberHeader.getText().trim();
	}
	
	public void setmobileNumber(String enterMobileNumber)
	{
		mobileNumberInputBox.click();
		mobileNumberInputBox.sendKeys(enterMobileNumber);
		driver.hideKeyboard();
		
	}
	
	public void clickNextButton()
	{
		nextButton.click();
	}
	
	public void clickNonDBTFlow()
	
	{
		nonDbtFlow.click();
		nonDbtFlow.click();
		
	}

}
