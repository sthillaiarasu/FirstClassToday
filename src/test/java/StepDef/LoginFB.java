package StepDef;

import java.awt.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFB {
	
	static WebDriver driver;
	
	@Given("open the facebook page")
	public void open_the_facebook_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\thill\\eclipse-workspace\\Thillai\\chromedriver_win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	}

	@When("enter the username and password")
	public void enter_the_username_and_password(DataTable data) {
		
		java.util.List<String> asList = data.asList();
		driver.findElement(By.id("email")).sendKeys(asList.get(0));
		driver.findElement(By.id("pass")).sendKeys(asList.get(1));
		
	}
	
	@When("enter the {string} and {string}")
	public void enter_the_and(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}

	@Then("click the login button")
	public void click_the_login_button() {
	    
		driver.findElement(By.id("u_0_b")).click();
	}

}
