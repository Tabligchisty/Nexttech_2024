package com.nexttech.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookloginPOM {

	
	WebDriver driver;
	public FacebookloginPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}
		@FindBy(xpath="//input[@type=\"text\"]")
		
		WebElement Type_email;
		
		public WebElement email() {
			return Type_email;
		}
		@FindBy(xpath="//input[@type=\"password\"]")
				
		WebElement Type_password;
		 public WebElement password() {
		  return Type_password;
}
       @FindBy(name="login")
       WebElement Click_loginbutton;
       
       public  WebElement loginbutton() {
    	   
    	   return Click_loginbutton;
       }

	
		
	}
       
       
       
       
       



