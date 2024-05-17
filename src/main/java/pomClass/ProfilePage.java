package pomClass;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProfilePage {
	
	@AndroidFindBy (accessibility = "Edit")
	private WebElement editFeature;
	
	@AndroidFindBy (xpath = "//android.widget.ScrollView/android.view.View[6]/android.widget.EditText[1]")
	private WebElement farmersNameField;
	
	@AndroidFindBy (xpath = "//android.widget.ScrollView/android.view.View[6]/android.widget.EditText[2]")
	private WebElement fatherMotherHusbandNameField;
	
	@AndroidFindBy (xpath = "(//android.widget.Button)[2]")
	private WebElement dobMonthDropdown;
	
	@AndroidFindBy (uiAutomator ="new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"December\"))")
	private WebElement scrollExpectedMonth;
	
	@AndroidFindBy (xpath = "(//android.widget.Button)[3]")
	private WebElement dobDayDropdown;
	
	@AndroidFindBy (uiAutomator ="new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"22\"))")
	private WebElement scrollExpectedDay;
	
	
	@AndroidFindBy (xpath="(//android.widget.Button)[4]")
	private WebElement dobYearDropdown;
	
	@AndroidFindBy (uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"1995\"))")
	private WebElement scrollExpectedYear;
	
	@AndroidFindBy (xpath = "//android.widget.ScrollView/android.view.View[3]/android.view.View[7]")
	private WebElement genderDropdown;
	
	@AndroidFindBy (xpath = "//android.widget.ScrollView/android.view.View/android.view.View[8]")
	private WebElement farmerCategoryDropdown;
	
	@AndroidFindBy (xpath = "//android.widget.ScrollView/android.view.View/android.view.View[10]")
	private WebElement casteCategoryDropdown;
	
	@AndroidFindBy (xpath ="//android.widget.ScrollView/android.view.View/android.view.View[12]")
	private WebElement farmerTypeDropdown;
	
	@AndroidFindBy (xpath = "//android.widget.Button[@content-desc=\"Select an option\"])[1]")
	private WebElement districtDropdown;
	
	@AndroidFindBy (xpath = "//android.widget.Button[@content-desc=\"Select an option\"])[1]")
	private WebElement d;
	
	
	

}
