package test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.AndroidDriverUtility;
import genericLibrary.BaseClass;
import genericLibrary.JavaUtility;
import genericLibrary.JavalibraryOtp;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import pomClass.LanguagePage;
import pomClass.LoginAndSignUpPage;
import pomClass.OtpVerifyPage;
import pomClass.RegestrationPage;

public class RegisterTestPomImplementation extends BaseClass{
	
	
	@Test 
public void HomePageTest () throws InterruptedException, IOException
{
	

	
	
	JavaUtility jutil = new JavaUtility();
	int n=jutil.generateRandomNumber(4000);
	
	LanguagePage lpobj=new LanguagePage(driver);
	lpobj.clickEnglishLaguage();
	//lpobj.clickHindiLanguage();
	
	lpobj.clickNextButton();
	LoginAndSignUpPage login= new LoginAndSignUpPage(driver);
	login.setmobileNumber("234532"+n);
	login.clickNextButton();
	
	login.clickNonDBTFlow();
	OtpVerifyPage otp = new OtpVerifyPage(driver);
	otp.keypressNumber("123456");
	otp.clickVerifyButton();
	
	RegestrationPage rpage= new  RegestrationPage(driver);
	rpage.setFarmerName("hello");
	rpage.setFatherMotherHusbandName("hiidf");
	
	
	rpage.setMonth("March");
	rpage.setDay("25");
	rpage.setYear("1998");
	rpage.setGender("Female");
	rpage.setfarmerCategory("Own");
	rpage.setCastCategory("Minority");
	
	
	AndroidDriverUtility android = new AndroidDriverUtility();
	android.scrollGesture(driver);
	
	rpage.setFarmerType("Small");
	rpage.setDistrict("PATNA");
	rpage.setBlock("MOKAMA");
	rpage.setVillagePanchayat("SHIV NAGAR");
	rpage.setVillage("SHIVNAR");
	android.scrollGesture(driver);
	rpage.setPincode("234576");
	rpage.clickContinue();
	
	Assert.assertEquals(rpage.getSuccessfullyMessage(),"Your profile is created successfully");
	rpage.clickContinue();
	Assert.assertEquals(rpage.gethomePageTitle(), "Welcome to Bihar Krishi App");
	

	
	
}
	

}
