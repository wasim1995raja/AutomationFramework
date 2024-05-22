package pomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.*;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LanguagePage {

	AndroidDriver<WebElement> driver;

	public LanguagePage(AndroidDriver<WebElement> driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	@FindBy(accessibility = "हिन्दी (अ)")
//	private MobileElement hindiLanguage;
//	
//	@FindBy (accessibility = "कृपया अपनी भाषा चुनें")
//	private WebElement chooseHindiTitle;

	@FindBy(xpath = "//android.view.View[@content-desc=\"English (A)\"]")
	private WebElement englishLanguage;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Next\"]")
	private WebElement nextButton;



	public void clickEnglishLaguage() {

		englishLanguage.click();
	}

	public void clickNextButton() {
		nextButton.click();
	}

}
