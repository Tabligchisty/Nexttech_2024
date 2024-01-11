package com.nexttech.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellServicesPOM {

	
	WebDriver driver;
	public DellServicesPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/button")
	
	WebElement dell_services;
	
	  public 	WebElement dell_services() {
		  return dell_services;
		  
	  }
	  
	  @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/ul/li[4]/a")
	  
	  WebElement dell_warrantyextention;
	  public WebElement dell_warrantyextention() {
		  return dell_warrantyextention;
	  }
}



