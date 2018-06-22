package homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pagefactory1.DisneyPageFactory;

public class DisneyRun {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shari\\git\\sharif\\project1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.disneyworld.disney.go.com/");
		driver.manage().window().maximize();
		
		DisneyPageFactory test = new DisneyPageFactory(driver);
		test.getSignInbtn().click();
		

	}

}
