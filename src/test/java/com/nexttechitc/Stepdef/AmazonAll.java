package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttech.Pageobjectmodel.AmazonAllPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonAll {

	
	WebDriver driver;
		
	@Given("^user visit amazon home page$")
	public void user_visit_amazon_home_page() throws Throwable {
		//How to open the browser	
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
				driver = new ChromeDriver();
				
				//How  to open URL
				driver.get("https://www.amazon.com/"); 
				
				driver.manage().window().maximize();
	}

	@When("^user goes to all$")
	public void user_goes_to_all() throws Throwable {
		
		AmazonAllPOM obj= new AmazonAllPOM(driver);
	}

	@Then("^user select dropdown Amazon pharmacy$")
	public void user_select_dropdown_Amazon_pharmacy() throws Throwable {
		AmazonAllPOM obj = new AmazonAllPOM (driver);
		Select dropdown= new Select(obj.All);
		dropdown.selectByIndex(4);
		
		
		
	   
	}
}
