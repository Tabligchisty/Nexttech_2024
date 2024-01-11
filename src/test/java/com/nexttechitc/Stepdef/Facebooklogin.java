package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.Pageobjectmodel.FacebookloginPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebooklogin {
   WebDriver driver;
   
	@Given("^user visit facebook homepage$")
	public void user_visit_facebook_homepage() throws Throwable {
		//How to open Browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
	   
	    //How to open URL
		
		driver.get("https://www.facebook.com/");
	}

	@When("^user type valid \"([^\"]*)\" and valid \"([^\"]*)\" and click on login button$")
	public void user_type_valid_and_valid_and_click_on_login_button(String arg1, String arg2) throws Throwable {
	
	//create the object of POM class
		
		FacebookloginPOM obj = new FacebookloginPOM(driver);
		obj.email().sendKeys(arg1);
		obj.password().sendKeys(arg2);
		obj.loginbutton().click();
		
	}

	@Then("^user will be able to login facebook$")
	public void user_will_be_able_to_login_facebook() throws Throwable {
	 
		//How to close the window
		 //driver.close();
	}
	
}
