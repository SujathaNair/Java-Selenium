package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5FBSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//Click on create New Account
		driver.findElement(By.linkText("Create new account")).click();
		//driver.findElement(By.name("firstname")).click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("firstname")).sendKeys("John");
		//firstname//firstname lastname password_step_input
		driver.findElement(By.name("lastname")).sendKeys("wick");
		driver.findElement(By.id("password_step_input")).sendKeys("Test123");
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		Select selectDay = new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("14");
		
		Select selectMonth = new Select(driver.findElement(By.id("month")));
		//selectMonth.selectByVisibleText("Apr");
		selectMonth.selectByValue("4");
		
		Select selectYear = new Select(driver.findElement(By.id("year")));
		//selectYear.selectByIndex(2);
		selectYear.selectByVisibleText("1970");
		
		
		
		

	}

}
