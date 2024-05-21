package pomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginAndSignUpPage {
	AndroidDriver<WebElement>driver;
	
	@AndroidFindBy (accessibility = "Login | Sign Up")
	private WebElement loginAndSignUpHeader;
	
	@AndroidFindBy (accessibility = "Mobile number")
	private WebElement mobileNumberHeader;
	
	@AndroidFindBy (xpath = "//android.widget.EditText")
	private WebElement mobileNumberInputBox;
	
	@AndroidFindBy (accessibility = "Next")
	private WebElement nextButton;
	
	@AndroidBy (accessibility = "No")
	private WebElement nonDbtFlow;
	
	
	public LoginAndSignUpPage(AndroidDriver<WebElement> driver )
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getLoginAndSignUpHeader()
	{
		return loginAndSignUpHeader.getText().trim();
	}
	
	public String getmobileNumberHeader()
	{
		return mobileNumberHeader.getText().trim();
	}
	
	public void setmobileNumber(String enterMobileNumber)
	{
		mobileNumberInputBox.click();
		mobileNumberHeader.sendKeys(enterMobileNumber);
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
