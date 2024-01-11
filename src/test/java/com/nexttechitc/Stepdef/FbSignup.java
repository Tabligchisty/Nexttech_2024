package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttech.Pageobjectmodel.FbSignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbSignup {
	
	WebDriver driver;

	@Given("^user visiting facebook url$")
	public void user_visiting_facebook_url() throws Throwable {
	   
	//How to open Browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
	   
	    //How to open URL
		
		driver.get("https://www.facebook.com/reg/");  
	}

	@When("^user enter \"([^\"]*)\"  \"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"and click male$")
	public void user_enter_and_valid_and_and_click_male(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	   

		FbSignupPOM obj=new FbSignupPOM (driver);
		obj.firstname().sendKeys(arg1);
		obj.lastname().sendKeys(arg2);
		obj.email().sendKeys(arg3);
		obj.password().sendKeys(arg4);
		obj.Click_male().click();
           
	}

	@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
	    
		FbSignupPOM obj=new FbSignupPOM (driver);
		Select dropdown=new Select (obj.click_month);
		dropdown.selectByIndex(2);
		
		Select dropdown1=new Select (obj.click_day);
		dropdown1.selectByValue("2");
		
		Select dropdown2=new Select (obj.click_year);
		dropdown2.selectByVisibleText("2003");
}

	}	
	

