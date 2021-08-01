package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\Agiletech\\automation\\library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		WebElement user = driver.findElement(By.id("user-name"));
		
		WebElement pass = driver.findElement(By.id("password"));
		
		WebElement login = driver.findElement(By.id("login-button"));
		
		user.sendKeys("standard_user");
		pass.sendKeys("secret_sauce");
		
			
		
		
		boolean x = user.isDisplayed();
		
		boolean y  = pass.isDisplayed(); 
		
		boolean z = login.isEnabled();
		
		
		
		String lt = login.getText();
		
		login.click();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(lt);
		
		Thread.sleep(3000);
		driver.close();
	}

}
