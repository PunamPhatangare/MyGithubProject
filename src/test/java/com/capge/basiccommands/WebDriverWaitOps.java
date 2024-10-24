package com.capge.basiccommands;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitOps {
	WebDriver driver;
	 void loadUrl()
	{
		System.setProperty("webdriver.chrome.driver", "C://Software/chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		driver.manage().window().maximize();
	
	}
	 void webdriverwaitOperation() {
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		WebDriverWait waits=new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement ele=driver.findElement(By.id("demo"));
		if(waits.until(ExpectedConditions.textToBePresentInElement(ele, "Software Testing Material - DEMO PAGE"))==true)
		{
			System.out.println("Passed : "+ele.getText());
		}
		else
			System.out.println("Failed: timeout");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverWaitOps Fw=new WebDriverWaitOps();
		Fw.loadUrl();
		Fw.webdriverwaitOperation();
	}

}
