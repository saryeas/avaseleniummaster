package com.bangladesh.PageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bangladesh.Util.TestBase_BD;

public class HomePageLocator extends TestBase_BD{
	
	
public HomePageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.XPATH, using="//input[@id=\"mh-search-input\"]")
	public WebElement Searchfield;
	@FindBy(how=How.XPATH, using="//*[@class=\"mh-search-btn mh-search-submit\"]")
	public WebElement Search;
	@FindBy(how=How.XPATH, using="//span[@class='mh-search-button-label']")
	public WebElement SearchLink;
	
	@FindBy(how=How.XPATH, using="//h2[@class='direct-content__title']")
	public WebElement VerifySearchResult;
	
	@FindBy(how=How.XPATH, using="//*[text()=\"Power Your Passions\"]")
	public WebElement VerifyText;
	
	
	
	@FindBy(how=How.XPATH, using="//span[text()='Sign In']")
	public WebElement Signinbutton;
	@FindBy(how=How.LINK_TEXT, using="Sign In")
	public WebElement Signinlink;
	
	public String gettextMethod (String actual) {
		String gettextvalue= driver.findElement(By.xpath(actual)).getText();
		return gettextvalue;
		
		
	}

 
}
