package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.Pageobjectmodel.DellSupportPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellSupport {
	
	WebDriver driver;

	@Given("^user visits dell home page$")
	public void user_visits_dell_home_page() throws Throwable {
		
	 //How to open the Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//How  to open URL
		driver.get("https://www.dell.com/en-us");	
		   
	}

	@When("^user go to support menu and click on support home$")
	public void user_go_to_support_menu_and_click_on_support_home() throws Throwable {
		
		Actions act=new Actions(driver);
		DellSupportPOM obj=new DellSupportPOM(driver);
		act.moveToElement(obj.dell_support()).build().perform();
		Thread.sleep(2000);
		obj.dell_supporthome().click();
	    
	}

	@Then("^user redirects to support home page$")
	public void user_redirects_to_support_home_page() throws Throwable {
	    
		//driver.close();
	}
	
}
