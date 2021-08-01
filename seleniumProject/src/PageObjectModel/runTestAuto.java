package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class runTestAuto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\Agiletech\\automation\\library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
				
		driver.get("http://automationpractice.com/index.php");
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		
		homePage hp = new homePage(driver);
		hp.getSignInButton().click();
		
		hp.getSearchBox().sendKeys("dresses");
		hp.getSearchBoxbutton().click();
				
	}

}
