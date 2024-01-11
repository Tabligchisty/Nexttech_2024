package com.nexttech.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellActionPOM {

WebDriver driver;
	
	public DellActionPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/button/span")
	
	WebElement dell_service;
	
	public WebElement dell_service() {
		return dell_service;
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/ul/li[3]/a")
	
	WebElement Click_dell_viewallservice;
	
	public WebElement dell_viewallservice() {
		return Click_dell_viewallservice;
		
	}
}
