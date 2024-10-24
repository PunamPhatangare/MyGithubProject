package com.capge.basiccommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	WebDriver driver;
	void loadDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Software/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	void contactInfo()
	{
		driver.findElement(By.name("firstName")).sendKeys("Rakul");
		driver.findElement(By.name("lastName")).sendKeys("Singh");
		driver.findElement(By.name("phone")).sendKeys("9087897689");
		driver.findElement(By.name("userName")).sendKeys("abcd@gmail.com");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	void mailingInfo()
	{
		driver.findElement(By.xpath("//input[@name=\"address1\"]")).sendKeys("akurdi");
		driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("pimpari-chinchwad");
		driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@name=\"postalCode\"]")).sendKeys("411305");
		Select drpcountry=new Select(driver.findElement(By.xpath("//select[@name=\"country\"]")));
		drpcountry.selectByVisibleText("BELGIUM");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	void userInfo()
	{
		driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abcd@123");
		driver.findElement(By.name("confirmPassword")).sendKeys("abcd@123");
		driver.findElement(By.name("submit")).click();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
	}
	void signIn()
	{
		/*
		  if(driver.findElement(By.xpath("/html/body")).isDisplayed()) {
		  driver.findElement(By.xpath("//span[@class='ns-1bjv0-e-16']")).click(); }
		  else
		 
		//driver.get("https://demo.guru99.com/test/newtours/register.php");
*/		
	driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a")).click();;
		driver.findElement(By.name("userName")).sendKeys("ab@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abcd@123");
		driver.findElement(By.name("submit")).click();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       RegisterPage rp=new RegisterPage();
       rp.loadDriver();
       rp.contactInfo();
       rp.mailingInfo();
       rp.userInfo();
       rp.signIn();

	}

}
