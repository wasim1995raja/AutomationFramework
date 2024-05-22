package pomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class RegestrationPage {

	/*
	 * @FindBy (accessibility = "Personal details") private WebElement
	 * personalDetailsTitle;
	 */
	AndroidDriver<WebElement> driver;;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.View/android.widget.EditText[1]")
	private WebElement farmersNameTextField;

	@FindBy(xpath = "(//android.widget.EditText)[2]")
	private WebElement fatherMotherHusbandTextField;

	@FindBy(xpath = "(//android.widget.Button)[1]")
	private WebElement monthDropdown;

	@FindBy(xpath = "(//android.widget.Button)[2]")
	private WebElement dayDropdown;

	@FindBy(xpath = "(//android.widget.Button)[3]")
	private WebElement yearDropdown;

	@FindBy(xpath = "(//android.view.View[@content-desc='Select an option'])[1]")
	private WebElement genderDropdown;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Male\"]")
	private WebElement maleTitle;
	@FindBy(xpath = "//android.view.View[@content-desc=\"Female\"]")
	private WebElement femaleTitle;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Other\"]")
	private WebElement othersTitle;

	@FindBy(xpath = "(//android.widget.Button)[1]")
	private WebElement farmersCategoryDropdown;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Own\"]")
	private WebElement ownTitle;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Rented\"]")
	private WebElement rentedTitle;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Own Land + Rented Land\"]")
	private WebElement ownRentedTitle;

	@FindBy(xpath = "(//android.widget.Button)[2]")
	private WebElement casteCatogryDropdown;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Minority\"]")
	private WebElement minorityTitle;

	@FindBy(xpath = "(//android.widget.Button)[3]")
	private WebElement famersTypeDropdown;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Small Farmer\"]")
	private WebElement smallFarmerTitle;

	@FindBy(xpath = "(//android.widget.Button[@content-desc=\"Select an option\"])[1]")
	private WebElement districtDropdown;

	@FindBy(xpath = "(//android.widget.Button[@content-desc=\"Select an option\"])[1]")
	private WebElement blockDropdown;

	@FindBy(xpath = "(//android.widget.Button[@content-desc=\"Select an option\"])[1]")
	private WebElement villagePanchaytDropdown;

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Select an option\"]")
	private WebElement villageDropdown;

	@FindBy(xpath = "//android.widget.EditText")
	private WebElement pincodeTextField;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Continue\"]")
	private WebElement continueButtton;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Your profile is created successfully\"]")
	private WebElement profileCreatedSuccessfullyTitle;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Welcome to Bihar Krishi App\"]")
	private WebElement homePageTitle;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Home\"]")
	private WebElement homeButton;

	public RegestrationPage(AndroidDriver<WebElement> driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setFarmerName(String name) {
		farmersNameTextField.click();
		farmersNameTextField.sendKeys(name);
		driver.hideKeyboard();
	}

	public void setFatherMotherHusbandName(String name) {
		fatherMotherHusbandTextField.click();
		fatherMotherHusbandTextField.sendKeys(name);
		driver.hideKeyboard();

	}

	public void setMonth(String month) {
		monthDropdown.click();
		driver.findElementByAccessibilityId(month).click();
	}

	public void setDay(String day) {
		dayDropdown.click();
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\""
						+ day + "\"))")
				.click();

	}

	public void setYear(String year) {
		yearDropdown.click();
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\""
						+ year + "\"))")
				.click();
	}

	public void setGender(String gender) {
		genderDropdown.click();

		/*
		 * if(maleTitle.getText().equalsIgnoreCase(gender)) { maleTitle.click(); } else
		 * if (othersTitle.getText().equalsIgnoreCase(gender)) { othersTitle.click();
		 * 
		 * } else { femaleTitle.click(); }
		 */

		switch (gender) {
		case "Male":
			maleTitle.click();

			break;
		case "Female":
			femaleTitle.click();

			break;
		case "Other":
			othersTitle.click();

			break;

		default:
			System.out.println("invalid gender");
			break;
		}

	}

}
