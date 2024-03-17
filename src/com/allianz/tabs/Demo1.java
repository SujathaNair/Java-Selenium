package com.allianz.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
        
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.get("https://db4free.net");
        
        //click on phpMyAdmin »
        driver.findElement(By.partialLinkText("phpMyAdmin")).click();
        ArrayList<String> windows= new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        driver.findElement(By.id("input_username")).sendKeys("Admin");
        driver.switchTo().window(windows.get(0));
        
        
        driver.close();
        driver.quit();
        // no such window: target window already closed
       // System.out.println(driver.getTitle());
        


	}

}
