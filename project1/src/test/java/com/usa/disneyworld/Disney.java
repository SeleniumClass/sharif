package com.usa.disneyworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disney {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shari\\git\\any\\project1\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://disneyworld.disney.go.com/");
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(" //*[@class='signIn']")).click();
		
		
		//user name 
		
		driver.findElement(By.xpath("//*[@id='loginPageUsername']")).sendKeys("sharifbd1975@yahoo.com");
		
		driver.findElement(By.xpath("//*[@id='loginPagePassword']")).sendKeys("s123456");
		
		//*[@id='loginPageSubmitButton']
		
		driver.findElement(By.xpath("//*[@id='loginPageSubmitButton']")).click();
		
		
		
		
		

	}

}
