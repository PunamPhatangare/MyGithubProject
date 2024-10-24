package com.capge.basiccommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheckbox {
WebDriver driver;
void baseUrl()
{
	System.setProperty("webdriver.chrome.driver", "C://Software/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/radio.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}
void ops()
{
	//Radio Button
	WebElement ele1= driver.findElement(By.xpath("//input[@value='Option 1']"));
	ele1.click();
	if(ele1.isSelected())
	{
		System.out.println("option 1 selected");
	}
	else
		System.out.println("Not selected");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//Checkboxes
	driver.findElement(By.xpath("//input[@value='checkbox1']")).click();;
	driver.findElement(By.xpath("//input[@value='checkbox3']")).click();;
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
RadioAndCheckbox rc=new RadioAndCheckbox();
rc.baseUrl();
rc.ops();
	}

}
