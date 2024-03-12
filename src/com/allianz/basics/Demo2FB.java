package com.allianz.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// get the title and print it
		String actualTitle = driver.getTitle();
		System.out.println("Page Title : " + actualTitle);
		// get the currenturl and print it
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url : " + currentUrl);

		// get the currenturl and print it
		String pageSource = driver.getPageSource();
		System.out.println("Page Source : " + pageSource);

		driver.quit();

	}

}
