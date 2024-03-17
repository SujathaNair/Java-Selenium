package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;



public class Day1Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Day 1
		Task 1 (Important) 
		1.  Navigate onto https://www.salesforce.com/in/form/signup/freetrial-sales/
		2.  Enter first name as “John”
		3.  Enter last name as “wick”
		4.  Enter work email as “john@gmail.com”
		5.  Select Job title as “IT Manager”
		6.  Select Employees as “101-500 employees”
		7.  Select country as “United Kingdom”
		8.  Do not fill the phone number
		9.  Click on check box 
		10. Click on start my free trial 
		11. Get the error message displayed “Enter a valid phone number”*/
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		driver.findElement(By.name("UserFirstName")).sendKeys("John");
		driver.findElement(By.name("UserLastName")).sendKeys("wick");
		driver.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");
		
		Select dropdownJobTitle = new Select(driver.findElement(By.name("UserTitle")));
		dropdownJobTitle.selectByVisibleText("IT Manager");
		
		Select dropdownEmployee = new Select(driver.findElement(By.name("CompanyEmployees")));
		dropdownEmployee.selectByVisibleText("101 - 200 employees");
		
		Select dropdownCountry = new Select(driver.findElement(By.name("CompanyCountry")));
		dropdownCountry.selectByVisibleText("United Kingdom");
		driver.findElement(By.name("CompanyName")).sendKeys("Allianz");
		driver.findElement(By.xpath("//a[text()='Main Services Agreement']//..//..//div")).click();

		driver.findElement(By.name("start my free trial")).click();
		
		WebElement error = driver.findElement(By.xpath(("//span[text()='Enter a valid phone number']")));
		String errorMsg =error.getText();
		System.out.println(errorMsg);
		
		
		driver.close();
		driver.quit();
		
		

	}

}
