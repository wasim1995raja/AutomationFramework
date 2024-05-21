package pomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LanguagePage {

	AndroidDriver<AndroidElement> driver;
	
	

	@AndroidFindBy(accessibility = "हिन्दी (अ)")
	private AndroidElement hindiLanguage;
	
	@AndroidFindBy (accessibility = "कृपया अपनी भाषा चुनें")
	private AndroidElement chooseHindiTitle;

	@AndroidFindBy(accessibility = "English (A)")
	private AndroidElement englishLanguage;
	
	@AndroidFindBy(accessibility = "Please choose your language")
	private AndroidElement chooseEnglishTitle;

	@AndroidFindBy(accessibility = "Tip: Language can be changed later from the menu!")
	private AndroidElement tipMessage;

	@AndroidFindBy(accessibility = "Next")
	private AndroidElement nextButton;

//	public LanguagePage(AndroidDriver<WebElement> driver) {
//		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//	}

	

	



	public LanguagePage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(driver, this);
	}







	public String ChooseEnglishLanguageTitle() {
		return chooseEnglishTitle.getText().trim();
	}

	public void clickHindiLanguage() {
		hindiLanguage.click();
		
	}
	public  String chooseHindiLanguageTitle() {
		return chooseHindiTitle.getText();
	}
	
	public void clickEnglishLaguage()
	{
		
		englishLanguage.click();
	}
	
	public void isTipMessageDisplayed()
	{
		tipMessage.isDisplayed();
	}
	
	public void clickNextButton()
	{
		nextButton.click();
	}

}
