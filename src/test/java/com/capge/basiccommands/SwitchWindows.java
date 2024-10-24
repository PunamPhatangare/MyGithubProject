package com.capge.basiccommands;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindows {
	WebDriver driver;
	void loadUrl()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Software/chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
	}
	void operations()
	{
		driver.findElement(By.xpath("/html/body/p/a")).click();

		String ParentWindow=driver.getWindowHandle(); 
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext()) 
		{ 
			String childwindow=i1.next();
		if(!ParentWindow.equalsIgnoreCase(childwindow)) {
			driver.switchTo().window(childwindow);
			driver.findElement(By.name("emailid")).sendKeys("abcd@gmail.com");
			driver.findElement(By.xpath("//*[contains(@name,'btnLogin')]")).click();
			driver.close(); }

		} 
		driver.switchTo().window(ParentWindow);



	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchWindows sw=new SwitchWindows();
		sw.loadUrl();
		sw.operations();
	}

}
