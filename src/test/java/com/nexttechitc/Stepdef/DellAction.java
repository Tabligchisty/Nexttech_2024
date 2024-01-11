package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.Pageobjectmodel.DellActionPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellAction {

	WebDriver driver;
	
	@Given("^user visits Dell homepage$")
	public void user_visits_Dell_homepage() throws Throwable {
		
		//How to open the browser
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
				driver = new ChromeDriver();
				
				//How  to open URL
				driver.get("https://www.dell.com/en-us");
				
	}
	     
	@When("^user go to service menu and click on  View All service$")
	public void user_go_to_service_menu_and_click_on_View_All_service() throws Throwable{
	 
		Actions act=new Actions(driver);
		DellActionPOM obj=new DellActionPOM(driver);
		act.moveToElement(obj.dell_service()).build().perform();
		Thread.sleep(2000);
		obj.dell_viewallservice().click();		
	}

	@Then("^user redirects to view all service page$")
	public void user_redirects_to_view_all_service_page() throws Throwable {
	   //driver.close(); 
	}
}
