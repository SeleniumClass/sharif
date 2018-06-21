package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GcrShop{//protected into page number;

	public static void main(String[] args) {//void main method never return value//
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shari\\git\\any\\project1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/");
		driver.manage().window().maximize();			
		
		
		WebElement myaccount = driver.findElement(By.xpath("(//*[contains(@class, 'ui-button-text')])[5]"));////*[@id="tdb3"]/span[2]
		myaccount.click();
		WebElement email   = driver.findElement(By.xpath("(//*[@name='email_address'])"));
		email.sendKeys("sarowerny@gmail.com");
		
		WebElement password   = driver.findElement(By.xpath(" (//*[@name='password'])"));
		 password.sendKeys("student");
		WebElement signin  = driver.findElement(By.xpath("(//*[contains(@class,'ui-button-text')])[9]"));
		signin.click();
		
		WebElement catlog = driver.findElement(By.xpath("(//*[contains(@class, 'headerNavigation')])[2]"));
		catlog.click();
		
		WebElement newProduct = driver.findElement(By.xpath("//a[contains(@href, 'products_new')]"));
		newProduct.click();
		
		WebElement  page1= driver.findElement(By.xpath("//strong[contains(text(), '1')][1]"));
		page1.click();
		
		
	}
	

}

