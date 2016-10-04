package com.util;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUtil {
	
	public static WebDriver driver;
	
	static{
		initiateBrowser();
	}
	
	public static void main(String[] args) {
		
		SeleniumUtil.initiateBatch();
	}

	public static WebDriver initiateBrowser() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://elearn.welingkar.org/");
		System.out.println(driver.getCurrentUrl());
		return driver;
		
	}

	public static void initiateBatch() {
		
		WebElement userElement = driver.findElement(By.name("username"));
		
		userElement.sendKeys("nikhilk_careers@yahoo.in");
		
		System.out.println(userElement);
		
		
	}
}
	