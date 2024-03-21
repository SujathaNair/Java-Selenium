package com.allianz.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       driver.get("https://netbanking.hdfcbank.com/netbanking/");
       
       //enter userid as jack123
       driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page'] ")));
       // switch to frame using other two options
       //If only one frame , we can use index as 0
       //driver.switchTo().frame(0);
       //using name or id
       //driver.switchTo().frame("login_page");
       driver.findElement(By.name("fldLoginUserId")).sendKeys("Jack123");
       driver.findElement(By.linkText("CONTINUE")).click();
       driver.switchTo().defaultContent();
       

	}

}
