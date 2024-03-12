package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFBLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//Enter Username
		driver.findElement(By.id("email")).sendKeys("suja43*2@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1224");
		driver.findElement(By.name("login")).click();
		

	}

}
