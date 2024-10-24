package com.capge.basiccommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups {
	//HI this is edited in Github
	WebDriver driver;
	void loadURL()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Software/chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	void allOps()
	{
		driver.findElement(By.xpath("//*[contains(@name,'cusid')]")).sendKeys("5674");
		driver.findElement(By.xpath("//*[contains(@name,'submit')]")).click();
		//first alert
		Alert alert=driver.switchTo().alert();
		String msg=alert.getText();
		System.out.println(msg);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		alert.accept();

		//Second Alert
		Alert alert1=driver.switchTo().alert();
		String msg1=alert.getText();
		System.out.println(msg1);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		alert1.accept();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertPopups ap=new AlertPopups();
		ap.loadURL();
		ap.allOps();
	}

}
