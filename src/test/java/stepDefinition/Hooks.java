package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before ("@AdminUser")
	public void Adminusersetup() {
		
		System.out.println("****************");
		System.out.println("Setup the entries in Netwroking database");
		System.out.println("Setup the entries in Networking database");

		System.out.println("Setup the entries in netro database");

	}

	@Before ("@UserLogin")
	public void Userlogin() {
		
		System.out.println("Setup the entries in userlogin database");
	}
	
	@After 
	public void Teardown() {
		System.out.println("Clear the entries");
	}
	
}

//Before->Background->Scenario->After