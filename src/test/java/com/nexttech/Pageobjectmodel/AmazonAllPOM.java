package com.nexttech.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonAllPOM {

	WebDriver driver;
	
	public AmazonAllPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);			
		
	}
	
	@FindBy(xpath="//*[@id=\"searchDropdownBox\"]")
	public WebElement All;
	
	@FindBy (xpath="//*[@id=\"searchDropdownBox\"]/option[5]")
	public WebElement Click_amazonpharmacy;
	

	
	
	
	
	
	
	
	
	
	
	
}
