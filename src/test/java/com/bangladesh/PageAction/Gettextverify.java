package com.bangladesh.PageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bangladesh.Util.TestBase_BD;

public class Gettextverify extends TestBase_BD{
	
	
	
	
	
	@Test
	public void verifyText() {
		
		String actual =driver.findElement(By.xpath("//*[text()=\"Power Your Passions\"]")).getText();
				System.out.println(actual);
		String expc ="Power Your Passions";
		Assert.assertEquals(actual,expc);
	}

}
