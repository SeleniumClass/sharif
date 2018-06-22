package homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageFactory.GcrPageFactory;

public class GcrRun {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shari\\git\\any\\project1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/");
		driver.manage().window().maximize();
		
		GcrPageFactory gcr = new GcrPageFactory(driver);

		gcr.getMy_Account().click();
		gcr.getSendEmail().sendKeys("sarowerny@gmail.com");
		gcr.getSendpassword().sendKeys("student");
		
		
		gcr.getClicksigninbtn().click();
		
		gcr.getClickcatlog().click();
		
		gcr.getClicknewproduct().click();
		
		List<WebElement> ItemOnPage = driver.findElements(By.xpath("//*[contains(text(), 'Add to Cart')]"));
		int size = ItemOnPage.size();
		System.out.println("Number of items on this page: " + size);
		
	}

}
