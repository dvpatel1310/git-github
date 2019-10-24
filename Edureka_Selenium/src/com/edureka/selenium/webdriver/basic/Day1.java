package com.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	
	WebDriver driver;
	
	public void invokeBrowser() {
		
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Tutorial\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://www.edureka.co/");
			
			searchCourse();
			
			
			/*https://www.edureka.co/ */
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void searchCourse() {
		driver.findElement(By.id("search-inp")).sendKeys("Java");
		driver.findElement(By.id("search-button-top")).click();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Day1 myObj = new Day1();
		myObj.invokeBrowser();

	}

}
