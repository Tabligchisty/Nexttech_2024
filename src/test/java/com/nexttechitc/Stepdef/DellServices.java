package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.Pageobjectmodel.DellActionPOM;
import com.nexttech.Pageobjectmodel.DellServicesPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellServices {
 
	WebDriver driver;
	
	@Given("^user visit dell home page$")
	public void user_visit_dell_home_page() throws Throwable { 
		//How to open the browser
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
				driver = new ChromeDriver();
				
				//How  to open URL
				driver.get("https://www.dell.com/en-us");	
	}

	@When("^user go to sevice menu and click on warranty extention$")
	public void user_go_to_sevice_menu_and_click_on_warranty_extention() throws Throwable {
	 
		Actions act=new Actions(driver);
		DellServicesPOM obj=new DellServicesPOM(driver);
		act.moveToElement(obj.dell_services()).build().perform();
		Thread.sleep(2000);
		obj.dell_warrantyextention().click();		
	}

	@Then("^user redirect to warranty extention page$")
	public void user_redirect_to_warranty_extention_page() throws Throwable {
	   
		//driver.close();
	}
	
	
	
}
