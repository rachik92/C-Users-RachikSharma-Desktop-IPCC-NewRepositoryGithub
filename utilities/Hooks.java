package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	public static WebDriver driver;
	@Before
	public void user_opens_browser() {
		System.out.print("Opening Browser");
		System.setProperty("webdriver.chrome.driver", "bin\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void user_closes_browser() {
		System.out.print("Closing driver");
		driver.quit();
		
	}
	
}
