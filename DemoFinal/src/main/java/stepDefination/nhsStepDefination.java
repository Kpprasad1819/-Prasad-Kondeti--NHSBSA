package stepDefination;


import io.cucumber.java.en.*;
import pageObjects.ElegibilityChekerToolObjects;
import pageObjects.NhsDemoBaseClass;


public class nhsStepDefination extends ElegibilityChekerToolObjects {
	
	ElegibilityChekerToolObjects elg = new ElegibilityChekerToolObjects();
	NhsDemoBaseClass bc = new NhsDemoBaseClass();
	
	
	
	@Given("^I am a person from Wales$")
	public void i_am_a_person_from_Wales() {
		bc.setUp();	
		elg.validateDocumentTitle();
		System.out.println("prasad");
	   
	}

	
		
	
	@When("I put my circumstances into the Checker tool")
	public void i_put_my_circumstances_into_the_Checker_tool() {
	 
	elg.VerifyWalesElegibilityUser();
		
		
	}

	
	@Then("I should get a result of whether I will get help or not")
	public void i_should_get_a_result_of_whether_I_will_get_help_or_not() {
		
		elg.VerifyNhsElegibilityResult();
		
		
		
	}
	@And("I close the application")
	public void I_close_the_application(){
		
		elg.close();
		
		
	}
		
	

	

}
