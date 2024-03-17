package com.allianz.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mar14Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Mar 14, 2024 Task 1 (Important) 1. Navigate onto
		 * https://www.online.citibank.co.in/ 2. Close if any pop up comes 3. Click on
		 * Login 4. Click on Forgot User ID? 5. Choose Credit Card 6. Enter credit card
		 * number as 4545 5656 8887 9998 7. Enter cvv number 8. Enter date as
		 * “14/04/2022” 9. Click on Proceed 10. Get the text and print it “Please accept
		 * Terms and Conditions”
		 */

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.online.citibank.co.in/");
		driver.findElement(By.xpath("//a[@class='newclose']")).click();
		driver.findElement(By.xpath("//a[@class='newclose2']")).click();
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		//String win1 =null;
		
		for (String win:windows)
		{
			System.out.println(win);
			driver.switchTo().window(win);
			System.out.println(driver.getTitle());
			if( driver.getTitle().equals("Citibank India"))
			{
				//win1 =win;
				break;
			}
			
		}
		//driver.switchTo().window(win1);
		
		driver.findElement(By.xpath("//div[@onclick='ForgotUserID();']")).click();
		
		driver.findElement(By.linkText("select your product type")).click();
		driver.findElement(By.linkText("Credit Card")).click();
		driver.findElement(By.id("citiCard1")).sendKeys("4545");
		driver.findElement(By.id("citiCard2")).sendKeys("5656");
		driver.findElement(By.id("citiCard3")).sendKeys("8887");
		driver.findElement(By.id("citiCard4")).sendKeys("9998");
		driver.findElement(By.id("cvvnumber")).sendKeys("5");
		driver.findElement(By.id("bill-date-long")).click();
		

		Select selectYear = new Select(driver.findElement(By.xpath("//select[@data-handler='selectYear']")));
	
		selectYear.selectByVisibleText("2022");
		
		Select selectMonth = new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
		
		selectMonth.selectByVisibleText("Apr");
		driver.findElement(By.linkText("14")).click();
		
		
		
		driver.findElement(By.xpath("//input[@value='PROCEED']")).click();

		String msg =driver.findElement(By.xpath("//li[text()='• Please accept Terms and Conditions ']")).getText();
		System.out.println(msg);
		
		driver.findElement(By.xpath("//button[text()='Close Window']")).click();
		driver.close();
		driver.quit();
		


	}

}
