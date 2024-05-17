package pomClass;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class RegestrationPage {
	
	@AndroidFindBy (accessibility = "Personal details")
	private WebElement personalDetailsTitle;
	
	@AndroidFindBy (xpath = "(//android.widget.EditText)[1]")
	private WebElement farmersNameTextField;
	
	@AndroidFindBy (xpath = "(//android.widget.EditText)[2]")
	private WebElement fatherMotherHusbandTextField;
	
	@AndroidFindBy (xpath = "//android.widget.Button)[3]")
	private WebElement dobMonthDropdown;
	
	@AndroidFindBy (xpath = "//android.widget.Button)[4]")
	private WebElement dobDayDropdown;
	
	@AndroidFindBy (xpath = "//android.widget.Button)[5]")
	private WebElement dobYearDropdown;
	

}
