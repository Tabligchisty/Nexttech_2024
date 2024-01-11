package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttech.Pageobjectmodel.BestsellerPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Bestseller {

	WebDriver driver;
	
	@Given("^user visit amazon bestseller page$")
	public void user_visit_amazon_bestseller_page() throws Throwable {
	 
	try{	
		//How to open the browser
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
				// How to open URL
				driver.get("https://www.amazon.com/");
				
				driver.manage().window().maximize();				
       }

	catch(Exception e) {
		System.out.println("browser and url not opening");

	}
	}  
	
	@When("^user clicks Amazon Bestseller option$")
	public void user_clicks_Amazon_Bestseller_option() throws Throwable {
	try {	
		//Create the object POM class
		
		BestsellerPOM obj = new BestsellerPOM(driver);
        obj.Click_BestsellerPage();	
        
        WebDriverWait wait=new WebDriverWait(driver,30);
	}
		catch (Exception e){
	
			System.out.println("Element not found");
		}
	}

	@Then("^user should able to redirect to bestseller page$")
	public void user_should_able_to_redirect_to_bestseller_page() throws Throwable {
	   
		//How to close the window
		//driver.close();
	}

	
}
