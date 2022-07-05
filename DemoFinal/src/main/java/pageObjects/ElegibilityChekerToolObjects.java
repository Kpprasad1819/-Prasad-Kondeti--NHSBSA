package pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ElegibilityChekerToolObjects extends NhsDemoBaseClass{

	@FindBy(xpath = "//input[@value='Start now']")
    private WebElement StartNowButton;
	
	@FindBy(xpath = "//label[@id='label-wales']")
    private WebElement CountryLiveIn;
	
	@FindBy(xpath = "//input[@id='next-button']")
	 private WebElement CountryLiveInNextButton;
	 
	 @FindBy(xpath = "//label[@id='label-yes']")
	private WebElement GpPracticeYesButton;
	 
	 @FindBy(xpath = "//input[@id='next-button']")
	 private WebElement GPPracticeNextButton;
	 
	 @FindBy(xpath = "//label[@id='label-wales']")
	 private WebElement DentalPracticeCountry;
	 
	 @FindBy(xpath = "//input[@class='button']")
	 private WebElement DentalPracticeCountryNextButton;
	 
	 
	 @FindBy(xpath = "//input[@name='dateOfBirth.day']")
	 private WebElement DateOfBirthDay;
	 
	 @FindBy(xpath = "//input[@name='dateOfBirth.month']")
	 private WebElement DateOfBirthMonth;
	 
	 @FindBy(xpath = "//input[@name='dateOfBirth.year']")
	 private WebElement DateOfBirthYear;
	 
	 
	 @FindBy(xpath = "//input[@id='next-button']")
	 private WebElement DateOfBirthNextButton;
	 
	 
	 @FindBy(xpath = "//input[@id='radio-yes']")
	 private WebElement DoYouLiveWithPartnerYesButton;
	 
	 
	 @FindBy(xpath = "//input[@id='next-button']")
	 private WebElement DoYouLiveWithPartneNextButton;
	 
	 
	 @FindBy(xpath = "//label[@id='label-no']")
	 private WebElement ClaimBenifits;
	 
	 
	 @FindBy(xpath = "//input[@id='next-button']")
	 private WebElement ClaimBenifitsNextButton;
	 
	
	 
	 @FindBy(xpath = "//input[@id='radio-no']")
	 private WebElement AreYoupregnant;
	 
	 
	 @FindBy(xpath = "//input[@id='next-button']")
	 private WebElement AreYoupregnantNextButton;
	 
	 
	 @FindBy(xpath = "//input[@id='radio-no']")
	 private WebElement ArmedForces;
	 
	 
	 @FindBy(xpath = "//input[@id='next-button']")
	 private WebElement  ArmedForcesNextButton;
	 
	 @FindBy(xpath = "//input[@id='radio-yes']")
	 private WebElement DoYouHaveDiabetes;
	 
	 @FindBy(xpath = "//input[@id='next-button']")
	 private WebElement DoYouHaveDiabetesNext;    
	 
	 
	 @FindBy(xpath = "//input[@id='radio-no']")
	 private WebElement DoYouHaveGlaucoma;
	 
	 @FindBy(xpath = "//input[@id='next-button']")
	 private WebElement DoYouHaveGlaucomaNext;
	 
	 
	 @FindBy(xpath = "//input[@id='radio-yes']")
	 private WebElement LivePermanentlyInCareHome;
	 
	 
	 @FindBy(xpath = "//input[@id='next-button']")
	 private WebElement LivePermanentlyInCareHomeNext;
	 
	 
	 @FindBy(xpath = "//input[@id='radio-yes']")
	 private WebElement Savings;
	 
	 @FindBy(xpath = "//input[@id='next-button']")
	 private WebElement SavingsNextButton;
	 
	 
	 @FindBy(xpath = "//h1[@id='result-heading']")
	 private WebElement ElegibilityResult;
	 
	 
	 public ElegibilityChekerToolObjects() {
		 PageFactory.initElements(driver, this);
			
		}
	 
	
	 public void validateDocumentTitle() {
		 
		 if(driver.getTitle().equalsIgnoreCase("Check what help you could get to pay for NHS costs - NHSBSA")) {
			 
			 System.out.println("NHS page titile matched");
		 }
		 
		 else {
			 
			 System.out.println("NHS page titile matched");
			 
		 }	
			
		}
	 
	 
	 
	 public void VerifyWalesElegibilityUser() {
		 
		 
		 StartNowButton.click();
		 
		 
		 CountryLiveIn.click();
		 CountryLiveInNextButton.click();
		 
		 GpPracticeYesButton.click();
		 GPPracticeNextButton.click();
		 
		 DentalPracticeCountry.click();
		 DentalPracticeCountryNextButton.click();
		 
		 DateOfBirthDay.sendKeys("25");
		 DateOfBirthMonth.sendKeys("12");
		 
		 DateOfBirthYear.sendKeys("1990");
		 DateOfBirthNextButton.click();
		 
		 DoYouLiveWithPartnerYesButton.click();
		 DoYouLiveWithPartneNextButton.click();
		 
		 ClaimBenifits.click();
		 ClaimBenifitsNextButton.click();
		 
		 AreYoupregnant.click();
		 AreYoupregnantNextButton.click();
		 
		 ArmedForces.click();
		 ArmedForcesNextButton.click();
		 
		 
		 DoYouHaveDiabetes.click();
		 DoYouHaveDiabetesNext.click();
		 
		 
		 DoYouHaveGlaucoma.click();
		 DoYouHaveDiabetesNext.click();
		 
		 LivePermanentlyInCareHome.click();
		 LivePermanentlyInCareHomeNext.click();
		 
		 
		 Savings.click();
		 SavingsNextButton.click();
		  	 
	}
	 
	 public void VerifyNhsElegibilityResult() {
		 
		 if(ElegibilityResult.getText().equalsIgnoreCase("You get help with NHS costs")) {
			 
			 System.out.println(ElegibilityResult.getText());
			 System.out.println("User Apllicable for Nhs Free Cost");	
			 
		 }
		 else {
			 System.out.println("User Not Apllicable for Nhs Free Cost");		 
		 }	 
		 	
	}
	 
	 
	 public void close() {
		 
		 driver.quit();
		
	}
	 
	 
	 
	 
	 
	  
	 }
		 
			
	 
	 
 
	 
	 		
	 
	 		
	 		
	 		
	 		
	 

