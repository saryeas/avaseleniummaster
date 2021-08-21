package com.bangladesh.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase_BD {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase_BD() {
		
		try {
			FileInputStream fls = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\bangladesh\\config\\configBD.proterties");
			prop= new Properties();
			prop.load(fls);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public void initz() {
		
		String Browsername = prop.getProperty("browser1");
		if(Browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\driver\\chromedriver.exe" );
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(utillll.implicitlyWait_wait, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(utillll.pageLoadTimeout_wait, TimeUnit.SECONDS);
			
			
			
			
		}
		
			
		else if(Browsername.equals("FF"));
			System.out.println("Browser not found");
	}
	
	
	public static void lunchh(String URL) {
		driver.get(prop.getProperty("qaurl"));
		
		
		
	}
	

}
