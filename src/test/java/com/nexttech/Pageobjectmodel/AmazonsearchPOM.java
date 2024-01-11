package com.nexttech.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonsearchPOM {

	WebDriver driver;
	
	public AmazonsearchPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);		
	}
	@FindBy(name="field-keyword" )
	
	WebElement type_amazonsearch;
	
	public WebElement Amazonsearch() {
	 
		return type_amazonsearch;
}

     @FindBy(id="nav-search-submit-buttom")
     //@findBy//a[@href="/gp/bestsellers/?ref_=nav_cs_bestsellers" ]="input[@id=\"nav-search-submit-buttom\"]")
     
     WebElement Click_searchicon;
     
     public WebElement Searchicon() {
    	 return Click_searchicon;
     
     }
     }
    	 
    	 