package com.nexttech.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellitinfrastructurePOM {

	WebDriver driver;
	
	public DellitinfrastructurePOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}	   
	   @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/button/span")
	   
	   WebElement dell_itinfrastructure;
	   
	   public  WebElement dell_itinfrastructure() {
		   return  dell_itinfrastructure;
		   
	   }
	   
	  @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[8]/a") 
	  
	  WebElement Click_dell_developersanddevops;
	  
	       public WebElement dell_developersanddevops() {
	    	   return Click_dell_developersanddevops;
	       }
}








