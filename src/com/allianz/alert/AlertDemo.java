package com.allianz.alert;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");
        // to inspect - f12 or ctrl +shift+c
        // Click on Go
      
        driver.findElement(By.xpath("//img[@src='gif/go.gif']")).click();
        
        // Make sure alert is present
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println(text);
        alert.accept();
        driver.close();
        driver.quit();
	}

}
