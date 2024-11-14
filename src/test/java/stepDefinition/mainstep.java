package stepDefinition;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainstep {

	@Given("User is on Netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on Netbanking landing page");
	}
//	@When("User login into application")
//	public void user_login_into_application() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("User is on Netbanking landing page");
//	}
	
	@When("User login into application with {string} and password {string}")
	public void user_login_into_application_with_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on Netbanking landing page with"+" "+username+" " +"and"+ " "+ password);
	}
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home Page is displayed");
	}
	
	
	@Given("User is on Practice landing page")
	public void user_is_on_practice_landing_page() {
		System.out.println("User is on Practice landing page");
	    
	}
	@When("User sign up into application")
	public void user_sign_up_into_application(List<String> data) {
	    
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}
	
	@Given("setup the entries in database")
	public void setup_the_entries_in_database() {
		System.out.println("************************");
		System.out.println("setup the entries in database");
	    
	}
	@When("launch the browser from config variable")
	public void launchbrowser() {
		System.out.println("launch the browser from config variable");
	}
	
	@And("hit the home page url of banking site")
	public void hiturl() {
		System.out.println("hit the home page url of banking site");
		
	}
	
	
	
}
