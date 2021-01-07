package StepDef;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount {
	
	@When("click create the account")
	public void click_create_the_account() {
	    
		LoginFB.driver.findElement(By.id("u_0_2")).click();
	}

	@Then("fill the details")
	public void fill_the_details() {
	 LoginFB.driver.findElement(By.id("u_")).sendKeys("thhillai");
		
	}


}
