package com.bangladesh.PageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bangladesh.PageLocator.HomePageLocator;
import com.bangladesh.Util.TestBase_BD;
import com.bangladesh.Util.TestData;
import com.bangladesh.Util.utillll;

public class HomePageAction extends TestBase_BD  {
	
	HomePageLocator homePageLocator = new HomePageLocator();
	
	public void EnterXPSinSearchFiled() {
		homePageLocator.Searchfield.sendKeys(utillll.laptop);
		
	}
	public void ClickonSearchLink() {
		homePageLocator.Search.click();
		
	}
	public void Verifysearchresultdisplay() {
		
	//printing text	
String actual =driver.findElement(By.xpath("//*[text()=\"Power Your Passions\"]")).getText();
//String actual =driver.findElement(By.xpath(VerifyText)).getText();
System.out.println(actual);
String expc ="Power Your Passions";
Assert.assertEquals(actual,expc);

// new code
//String actual1 =driver.findElement(By.xpath("//*[text()=\"Power Your Passions\"]")).getText();

System.out.println(actual);
//String actual1=HomePageLocator.gettextMethod("//*[text()=\"Power Your Passions\"]")).getText();
String removeSpaceActual=actual1.replace("","");
System.out.println(removeSpaceActual);
String expc1 ="Power Your Passions";
String removeSpaceExpected=expc1.replace("","");
System.out.println(removeSpaceExpected);
Assert.assertEquals(removeSpaceActual,removeSpaceExpected);

	}

//2nd method
public String gettextMethod (String actual) {
String gettextvalue= driver.findElement(By.xpath(actual)).getText();
return gettextvalue;








//boolean searchresult =homePageLocator.VerifySearchResult.isDisplayed();
		//Assert.assertTrue(searchresult);
		
	}
	
	public void ClickonSigninbutton() {
		
		homePageLocator.Signinbutton.click();
		
	}
	public void ClicksigninLink() {
		homePageLocator.Signinlink.click();
		
	}
	@Test
	public void verifyText() {
	String actual = driver.findElement(By.xpath("//*[text()=\"Power Your Passions\"]")).getText();
				System.out.println(actual);
		String expc ="Power Your Passions";
		Assert.assertEquals(actual,expc);
	}
	
	
	
}


