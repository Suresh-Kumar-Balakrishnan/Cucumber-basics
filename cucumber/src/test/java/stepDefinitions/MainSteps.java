package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {

/*	@Given("user is on the landing page")
	public void user_is_on_the_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on landing page");
	}
	*/
/*	@When("user login into the application")
	public void user_login_into_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User login into the application");
	}
*/
	
	@Given("user is on the signup page")
	public void user_is_on_the_signup_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on the signup page ");
	}
	
	//passing the list of values ( data driven testing )
	@When("user signup into the application")
	public void user_signup_into_the_application(List<String> data) {
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));

	}
	@When("user login into the application with username {string} and password {string}")
	public void user_login_into_the_application_with_username_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User name is " + username + " Password is " + password);
	}
	
	@Then("Home page has been displayed")
	public void home_page_has_been_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home page has been displayed");
	}
	@And("Cards are listed out")
	public void cards_are_listed_out() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cards are listed out");
		System.out.println("--------------------------------------------------");
	}
	
	@Given("user is on the landing page")
	public void testing_manual_method() {	
	System.out.println("Testing method how it is used ");
	}
	
	@When("user login into the application with username {string} and password {string} combination")
	public void user_login_into_the_application_with_username_and_password_combination(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Password combination - username :  " + string + "Passsword : " + string2);
	}
	
	@When("^user login into the application with username (.+) and password (.+) regex pattern$")
	public void user_login_into_the_application_with_username_credituser_and_password_regex_pattern(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("inside the regex pattern ---" + string + "   password" + string2);
	}
	
	// Steps for the background keyword
	
	@Given("Setup the DB")
	public void setupDB() {
		System.out.println("***************************");
		System.out.println("Setting up the DB");
	}
	
	@When("launch the browser from config variables")
	public void launchBrowser()
	{
		System.out.println("Launching the browser");
	}
	
	@Then("hit the url")
	public void hiturl()
	{
		System.out.println("Hitting the url");
	}

}
