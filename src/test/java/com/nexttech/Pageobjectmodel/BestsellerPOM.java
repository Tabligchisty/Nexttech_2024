package com.nexttech.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestsellerPOM {

WebDriver driver;
	
	public BestsellerPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);		
	}
	  // @FindBy(xpath="//a[@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers\"]")
	

        WebElement Click_Bestsellerpage;
	
        public WebElement Click_BestsellerPage() { 
       	 return Click_Bestsellerpage;
	
        }	
}
