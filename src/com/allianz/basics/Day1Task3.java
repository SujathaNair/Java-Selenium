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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.medibuddy.in/");

        // Identify the iframe using any locator strategy (ID, name, index, etc.)
        WebElement iframeElement = driver.findElement(By.id("wiz-iframe"));

        // Switch to the iframe by WebElement
        driver.switchTo().frame(iframeElement);
        driver.findElement(By.xpath("//a[@class='wzrkClose']")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.xpath("//div[text()='I have a Corporate Account']")).click();
        driver.findElement(By.linkText("Learn More")).click();
        driver.findElement(By.linkText("skip")).click();
        driver.findElement(By.linkText("Login using Username & Password")).click();
        driver.findElement(By.id("username")).sendKeys("john");
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
        driver.findElement(By.id("password")).sendKeys("john123");
        driver.findElement(By.xpath("//img[@class='show-password m-t-15 cursor-pointer']")).click();
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();
        String errorMessage=driver.findElement(By.xpath("//div[text()='Sorry, We are not able to connect your corporate account. Please use your phone number to login and use other services.']")).getText();
        System.out.println("Error Message: "+errorMessage);
        driver.close();
        



	}

}
