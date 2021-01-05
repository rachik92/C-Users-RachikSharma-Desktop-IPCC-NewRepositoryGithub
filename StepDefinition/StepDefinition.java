package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utilities.Hooks;

public class StepDefinition {
	
	WebDriver Driver = Hooks.driver;
	
	@Given("^User navigates to OLA homepage$")
	public void user_navigates_to_the_Google_com(){
	    Driver.get("https://corporate.olacabs.com/#/contact");
	    Driver.findElement(By.xpath("//a[contains(text(),'Contact us for information')]")).click();
	}
	
	/*@And("^User enter the value in the Name field \"([^\"]*)\"$")
	public void user_enter_the_value_in_the_Name_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}*/
	
	
	@And("^User enter the value in the email field \"([^\"]*)\"$")
	public void user_enters_the_string_in_the_searchbox(String arg1) throws Throwable {
		Driver.findElement(By.xpath("//input[@ng-model='contact.email']")).sendKeys(arg1);
		Thread.sleep(5000);
	    throw new PendingException();
	}
	
	/*@And("^User enter the value in the Company Name field \"([^\"]*)\"$")
	public void user_enter_the_value_in_the_Company_Name_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@And("^User enter the value in the Phone Number field \"([^\"]*)\"$")
	public void user_enter_the_value_in_the_Phone_Number_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}*/
	
	/*@And("^User enter the value in the Comments field \"([^\"]*)\"$")
	public void user_enter_the_value_in_the_Comments_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}*/

	@Then("^Click on the Submit button$")
	public void the_result_is_displayed() throws Throwable {
		Driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(5000);
	    throw new PendingException();
	}


}
