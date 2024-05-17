package pomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage {
	
	@AndroidFindBy (accessibility = "Welcome to Bihar Krishi App")
	private WebElement homepageTitle;
	
	@AndroidFindBy (accessibility = "Home")
	private WebElement homeFeature;
	
	@AndroidFindBy (accessibility = "Help")
	private WebElement helpFeature;
	
	@AndroidFindBy (accessibility = "Profile")
	private WebElement profileFeature;
	
	@AndroidFindBy (accessibility = "Government schemes")
	private WebElement governmentSchemeTitle;
	
	@AndroidFindBy (accessibility = "All Schemes")
	private WebElement allSchemeFeature;
	
	@AndroidFindBy (accessibility = "Applied schemes")
	private WebElement appliedSchemeFeature;
	
	@AndroidFindBy (xpath ="//android.view.View[contains(@content-desc,'Mandi Price')]")
	private WebElement mandiPriceFeature;
	
	@AndroidFindBy (accessibility = "Assets")
	private WebElement assetsTitle;
	
	@AndroidFindBy (accessibility = "Agri-Input Shops")
	private WebElement agriInputShopFeature;
	
	@AndroidFindBy (accessibility = "Cold Store")
	private WebElement coldStoreFeature;
	
	@AndroidFindBy (accessibility = "PACS")
	private WebElement pacsFeature;
	
	@AndroidFindBy (accessibility = "Panchayat Office")
	private WebElement panchayatOfficeFeature;
	
	@AndroidFindBy (accessibility = "e-KISAN Bhawan")
	private WebElement eKisanBhawanFeature;
	
	@AndroidFindBy (accessibility = "Agri Godowns")
	private WebElement agriGodownsFeature;
	
	@AndroidFindBy (accessibility = "Agriculture Farms")
	private WebElement agricultureFarmsFeature;
	
	@AndroidFindBy (accessibility = "Rice Mill")
	private WebElement riceMillFeature;
	
	@AndroidFindBy (accessibility = "Custom Hiring Centre")
	private WebElement customHiringCentreFeature;
	
	@AndroidFindBy (accessibility = "Pashu Bazar")
	private WebElement pashuBazarFeature;
	
	@AndroidFindBy (accessibility = "KVK")
	private WebElement kVKFeature;
	
	@AndroidFindBy (accessibility = "DAO office")
	private WebElement daoOfficeFeature;
	
	@AndroidFindBy (accessibility = "Agriculture College")
	private WebElement agricultureCollegeFeature;
	
	@AndroidFindBy (accessibility = "Farmers Producers Organisation")
	private WebElement farmerProducersOrganisation;
	
	@AndroidFindBy (accessibility = "Traders")
	private WebElement tradersFeature;
	
	public HomePage(AndroidDriver<WebElement> driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePage()
	{
		return homepageTitle.getText().trim();
	}
	
	public void clickHome()
	{
		homeFeature.click();
	}
	
	public void clickHelp()
	{
		helpFeature.click();
	}
	
	public void clickProfile()
	{
		profileFeature.click();
	}
	
	public String getGovernmentScheme()
	{
		return governmentSchemeTitle.getText().trim();
	}
	
	public void clickAllScheme()
	{
		allSchemeFeature.click();
	}
	
	public void clickAppliedScheme()
	{
		appliedSchemeFeature.click();
	}
	
	public void clickMandiPrice()
	{
		mandiPriceFeature.click();
	}
	
	public String getAssets()
	{
		return assetsTitle.getText().trim();
	}
	public void clickAgriInputShop()
	{
		agriInputShopFeature.click();
	}
	public void clickColdStore()
	
	{
		coldStoreFeature.click();
	}
	public void clickPACS()
	{
		pacsFeature.click();
	}
	
	public void clickPanchayatOffice()
	{
		panchayatOfficeFeature.click();
	}
	public void clickE_KisanBhawan()
	{
		eKisanBhawanFeature.click();
	}
	public void clickAgriGodowns()
	{
		agriGodownsFeature.click();
	}
	public void clickAgricultureFarms()
	{
		agricultureFarmsFeature.click();
	}
	public void clickRiceMill()
	{
		riceMillFeature.click();
	}
	public void clickCustomHiringCentre()
	{
		customHiringCentreFeature.click();
	}
	public void clickPashuBazar()
	{
		pashuBazarFeature.click();
			}
	public void clickKVK()
	{
		kVKFeature.click();
	}
	
	public void clickDAO_Office()
	{
		daoOfficeFeature.click();
	}
	public void clickAgricultureCollege()
	{
		agricultureCollegeFeature.click();
	}
	public void clickFarmerProducersOrganisation()
	{
		farmerProducersOrganisation.click();
	}
	public void clickTraders()
	{
		tradersFeature.click();
	}
	

}
