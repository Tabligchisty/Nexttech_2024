package com.nexttech.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellSupportPOM {

WebDriver driver;
	
	public DellSupportPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);			
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[5]/button/span")
	
	WebElement dell_support;
	public WebElement dell_support() {
	 return dell_support;
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[5]/ul/li[3]/a")
	
	WebElement Click_dell_supporthome;
	
	public WebElement dell_supporthome() {
		return Click_dell_supporthome;
	}
	
}
