package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Task 3
		1.  Navigate onto https://www.medibuddy.in/
		2.  Close if any popup and Click on Login
		3.  Click on I have Corporate Account 
		4.  Click on Learn More
		5.  Click on Skip
		6.  Click on Login using Username & Password
		7.  Enter username as john 
		8.  Enter password as john123 
		9.  Click on show password 
		10. Click log in 
		11.  Get the error message shown and print it in terminal 
		*/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.medibuddy.in/");

        // Identify the iframe using any locator strategy (ID, name, index, etc.)
        WebElement iframeElement = driver.findElement(By.id("wiz-iframe"));

        // Switch to the iframe by WebElement
        driver.switchTo().frame(iframeElement);
        driver.findElement(By.linkText("x")).click();
        driver.switchTo().defaultContent();



	}

}
