package com.capge.basiccommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsExample {

	public static void main(String[] args)  throws InterruptedException{
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "C://Software/chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(5));
 
 driver.get("https://rahulshettyacademy.com/loginpagePractise/");
 driver.manage().window().maximize();
 driver.findElement(By.cssSelector("input[type='text']")).sendKeys("rahulshettyacademy ");
 driver.findElement(By.cssSelector("input[type='password']")).sendKeys("learning");
 driver.findElement(By.xpath("//input[@value='user']")).click();
 w.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[id='okayBtn']"))).click();

 Select s=new Select(driver.findElement(By.xpath("//Select[@data-style='btn-info']")));
 s.selectByValue("teach");
 
 WebElement checkbox=driver.findElement(By.id("terms"));
 if(checkbox.isSelected()==false)
 {
	 checkbox.click();
 }
 driver.findElement(By.name("signin")).click();
 
		 
  
	}

}
