package com.allianz.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
			
		}
		else
		{
			driver = new EdgeDriver();
		}
		 
		driver.get("https://www.facebook.com/");
		// get the title and print it
		String actualTitle = driver.getTitle();
		System.out.println("Page Title : "+actualTitle);
		
		// get the currenturl and print it
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url : " +currentUrl);
		
		// get the currenturl and print it
		String pageSource = driver.getPageSource();
		System.out.println("Page Source : " +pageSource);
		
		driver.quit();
		

	}

}
