package com.pagefactory1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.usa.talentech.webdriver;

public class DisneyPageFactory {

	WebDriver driver;
	
	public DisneyPageFactory(WebDriver driver) {
		this . driver =driver;
		
		PageFactory.initElements(driver, this);
		
		
	
	
	}
	
	
	@FindBy(how = How.XPATH, using = "//*[@class='signIn']")
	private WebElement signInbtn;
	


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getSignInbtn() {
		return signInbtn;
	}
	
	

		
		

	}


