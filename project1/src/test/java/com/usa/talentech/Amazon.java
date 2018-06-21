package com.usa.talentech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shari\\git\\any\\project1\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		//Department
		driver.findElement(By.xpath(" (//*[@class='nav-line-2'])[7]")).click();
		driver.navigate().back();
		//Your Recommendations
		driver.findElement(By.xpath("(//*[@ class='nav-a'])[4]")).click();
		driver.navigate().back();
		//Today's Deal <a href="/gp/goldbox/ref=nav_cs_gb" class="nav-a" tabindex="49">Today's Deals</a>
		driver.findElement(By.xpath("(//*[@class='nav-a'])[4]")).click();
		driver.navigate().back();
		//Gift Card <a href="/gift-cards/b/ref=nav_cs_gift_cards?ie=UTF8&amp;node=2238192011" class="nav-a" tabindex="50">Gift Cards</a>
		driver.findElement(By.xpath("(//*[@class='nav-a'])[5]")).click();
		//Registry <a href="/b/ref=nav_cs_registry?ie=UTF8&amp;node=16115931011" class="nav-a" tabindex="51">Registry</a>
				
		driver.findElement(By.xpath(" (//*[@class='nav-a'])[6]")).click();
				
		driver.navigate().back();
				
		//Sell <a href="/b/ref=nav_cs_sell?_encoding=UTF8&amp;ld=AZUSSOA-sell&amp;node=12766669011" class="nav-a" tabindex="52">Sell</a>
				
		driver.findElement(By.xpath(" ((//*[@class='nav-a'])[7]")).click();
				
		driver.navigate().back();
				
		//Account & list <span class="nav-line-2">Account &amp; Lists<span class="nav-icon nav-arrow" style="visibility: visible;"></span>
		  
		  
				
		driver.findElement(By.xpath("(//*[@class='nav-line-2'])[3]")).click();
				
		driver.navigate().back();
				
		//Orders <span class="nav-line-2">Orders</span>
				
		driver.findElement(By.xpath(" (//*[@class='nav-line-2'])[4]")).click();
				
		driver.navigate().back();
				
		//Try Prime <span class="nav-line-2">Try Prime<span class="nav-icon nav-arrow" style="visibility: visible;"></span>
		  
				
		driver.findElement(By.xpath("(//*[@class='nav-line-2'])[5]")).click();
				
		driver.navigate().back();
		




		
		

	}

}
