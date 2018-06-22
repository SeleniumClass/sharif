package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GcrPageFactory {

	WebDriver driver;
	public GcrPageFactory(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "(//*[@class='ui-button-text'])[3]")
	private WebElement My_Account;
	
	@FindBy(how = How.XPATH, using = "(//*[@name='email_address'])")
	private WebElement sendEmail;
	
	@FindBy(how = How.XPATH, using = "(//*[@name='password'])")
	private WebElement sendpassword;
	
	@FindBy(how = How.XPATH, using = "(//*[contains(@class,'ui-button-text')])[9]")
	private WebElement clicksigninbtn;	
	
	@FindBy(how = How.XPATH, using =  "(//*[contains(@class, 'headerNavigation')])[2]")
	private WebElement clickcatlog;	
	
	@FindBy(how = How.XPATH, using =  "//a[contains(@href, 'products_new')]")
	private WebElement clicknewproduct;	
	
			
	
	
	
	
	
	public WebElement getClicknewproduct() {
		return clicknewproduct;
	}

	public WebElement getClickcatlog() {
		return clickcatlog;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getMy_Account() {
		return My_Account;
	}

	public WebElement getSendEmail() {
		return sendEmail;
	}

	public WebElement getSendpassword() {
		return sendpassword;
		
		
	}

	public WebElement getClicksigninbtn() {
		return clicksigninbtn;
	}
	
	
	
}
