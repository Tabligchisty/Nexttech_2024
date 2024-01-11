package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.Pageobjectmodel.DellServicesPOM;
import com.nexttech.Pageobjectmodel.DellitinfrastructurePOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dellitinfrastructure {	
	
	
	WebDriver driver;
	
	@Given("^users visit dell home page$")
	public void users_visit_dell_home_page() throws Throwable {
	  
		//How to open the browser
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
				driver = new ChromeDriver();
				
				//How  to open URL
				driver.get("https://www.dell.com/en-us");
				
	}

	@When("^users go to Itinfrastucture menu and click on developers and devops$")
	public void users_go_to_Itinfrastucture_menu_and_click_on_developers_and_devops() throws Throwable {
		Actions act=new Actions(driver);
		DellitinfrastructurePOM obj=new DellitinfrastructurePOM(driver); 
		act.moveToElement(obj.dell_itinfrastructure()).build().perform();
		Thread.sleep(2000);
		obj.dell_developersanddevops().click();
		

	}
	@Then("^users redirect to developers & devops page$")
	public void users_redirect_to_developers_devops_page() throws Throwable {

		//driver.close();
		
		
		
		
	}
}
