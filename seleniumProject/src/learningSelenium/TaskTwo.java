package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTwo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\Agiletech\\automation\\library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

		String title = driver.getTitle();
		
		String url = driver.getCurrentUrl();
		
		WebElement user = driver.findElement(By.id("user-name"));
		
		WebElement pass = driver.findElement(By.id("password"));
	
		
		WebElement login = driver.findElement(By.id("login-button"));
		
		user.sendKeys("standard_user");
		pass.sendKeys("secret_sauce");
		
		
		
		boolean x = user.isDisplayed();
		
		boolean y = pass.isEnabled();
		boolean z = login.isEnabled();
		
		System.out.println(title);
		System.out.println(url);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		login.click();
		
		String url2 = driver.getCurrentUrl();
		
		
		System.out.println(url2);
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
