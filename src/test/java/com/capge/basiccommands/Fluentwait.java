package com.capge.basiccommands;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {
	WebDriver driver;
	 void loadUrl()
	{
		System.setProperty("webdriver.chrome.driver", "C://Software/chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		driver.manage().window().maximize();
		
	
	}
	void fluentwaitOps() {
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		Wait<WebDriver> waits=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
		WebElement ww=waits.until(new Function<WebDriver, WebElement>(
				){
			
			public WebElement apply(WebDriver t) {
				// TODO Auto-generated method stub
				WebElement ele=driver.findElement(By.id("demo"));
				String str=ele.getText();
				if(str.equals("Software Testing Material - DEMO PAGE"))
				{
					System.out.println(str);
					return ele;
				}
				else
				{
					//System.out.println("Test Failed");
				return null;
				}
			}
		});
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fluentwait Fw=new Fluentwait();
		Fw.loadUrl();
		Fw.fluentwaitOps();
		
	}

}
