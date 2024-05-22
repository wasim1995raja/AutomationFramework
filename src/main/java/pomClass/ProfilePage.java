package pomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {
	
	@FindBy (accessibility = "Edit")
	private WebElement editFeature;
	
	@FindBy (xpath = "//android.widget.ScrollView/android.view.View[6]/android.widget.EditText[1]")
	private WebElement farmersNameField;
	
	@FindBy (xpath = "//android.widget.ScrollView/android.view.View[6]/android.widget.EditText[2]")
	private WebElement fatherMotherHusbandNameField;
	
	@FindBy (xpath = "(//android.widget.Button)[2]")
	private WebElement dobMonthDropdown;
	
	@FindBy (uiAutomator ="new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"December\"))")
	private WebElement scrollExpectedMonth;
	
	@FindBy (xpath = "(//android.widget.Button)[3]")
	private WebElement dobDayDropdown;
	
	@FindBy (uiAutomator ="new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"22\"))")
	private WebElement scrollExpectedDay;
	
	
	@FindBy (xpath="(//android.widget.Button)[4]")
	private WebElement dobYearDropdown;
	
	@FindBy (uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"1995\"))")
	private WebElement scrollExpectedYear;
	
	@FindBy (xpath = "//android.widget.ScrollView/android.view.View[3]/android.view.View[7]")
	private WebElement genderDropdown;
	
	@FindBy (xpath = "//android.widget.ScrollView/android.view.View/android.view.View[8]")
	private WebElement farmerCategoryDropdown;
	
	@FindBy (xpath = "//android.widget.ScrollView/android.view.View/android.view.View[10]")
	private WebElement casteCategoryDropdown;
	
	@FindBy (xpath ="//android.widget.ScrollView/android.view.View/android.view.View[12]")
	private WebElement farmerTypeDropdown;
	
	@FindBy (xpath = "//android.widget.Button[@content-desc=\"Select an option\"])[1]")
	private WebElement districtDropdown;
	
	@FindBy (xpath = "//android.widget.Button[@content-desc=\"Select an option\"])[1]")
	private WebElement d;
	
	
	

}
