package pomClass;

import org.openqa.selenium.By;
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

	@FindBy(xpath = "(//android.view.View/android.widget.EditText)[1]")
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

//	@FindBy(xpath = "")
//	private WebElement farmersCategoryDropdown;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Own\"]")
	private WebElement ownTitle;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Rented\"]")
	private WebElement rentedTitle;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Own Land + Rented Land\"]")
	private WebElement ownRentedTitle;

//	@FindBy(xpath = "(//android.view.View[@content-desc=\"Select an option\"])[2]/android.widget.Button")
//	private WebElement casteCatogryDropdown;

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

	@FindBy(xpath = "(//android.view.View)[3]")
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
	public void setfarmerCategory(String category)
	{
		driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(4)").click();
		switch (category) {
		case "Own":
			ownTitle.click();

			break;
		case "Rented":
			rentedTitle.click();

			break;
		case "OwnRented":
			ownRentedTitle.click();

			break;

		default:
			System.out.println("invalid category");
			break;
		}
	}
	
	public void setCastCategory(String category)
	{
		driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(5)").click();
		switch (category) {
		case "Minority":
			minorityTitle.click();

			break;
		case "SC":
			rentedTitle.click();

			break;
		case "ST":
			ownRentedTitle.click();

			break;

		default:
			System.out.println("invalid category");
			break;
		}
	}
	
	public void setFarmerType(String type)
	{
		famersTypeDropdown.click();
		switch (type) {
		case "Small":
			smallFarmerTitle.click();

			break;
		case "SC":
			rentedTitle.click();

			break;
		case "ST":
			ownRentedTitle.click();

			break;

		default:
			System.out.println("invalid farmer type");
			break;
		}
		
	}
	
	public void setDistrict(String district)
	{
		districtDropdown.click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\""+district+"\"))").click();
	}
	public void setBlock(String block)
	{
		blockDropdown.click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\""+block+"\"))").click();
	}
	
	public void setVillagePanchayat(String panchayat)
	{
		villagePanchaytDropdown.click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\""+panchayat+"\"))").click();
	}
	public void setVillage(String village)
	{
		villageDropdown.click();
		driver.findElement(By.xpath("//android.view.View[@content-desc=\""+village+"\"]")).click();
	}
	
	public void setPincode(String pincode)
	{
		pincodeTextField.click();
		pincodeTextField.sendKeys(pincode);
		driver.hideKeyboard();
	}
	public void clickContinue()
	{
		continueButtton.click();
				
	}
	public String getSuccessfullyMessage()
	{
		return 
		profileCreatedSuccessfullyTitle.getText().trim();
		
	}
	public String gethomePageTitle()
	{
		return homePageTitle.getText().trim();
	}
	
	

}
