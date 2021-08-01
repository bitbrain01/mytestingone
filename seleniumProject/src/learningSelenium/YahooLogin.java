package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YahooLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\Agiletech\\automation\\library\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/account/create");
		
		Thread.sleep(3000);
		
		WebElement first = driver.findElement(By.id("usernamereg-firstName"));
		
		WebElement last = driver.findElement(By.id("usernamereg-lastName"));
		
		WebElement yid = driver.findElement(By.id("usernamereg-yid"));
		
		WebElement pass = driver.findElement(By.id("usernamereg-password"));
		
		WebElement code = driver.findElement(By.name("shortCountryCode"));
		
		WebElement phone = driver.findElement(By.id("usernamereg-phone"));
		
		WebElement month = driver.findElement(By.id("usernamereg-month"));
		
		WebElement day = driver.findElement(By.id("usernamereg-day"));
		
		WebElement year = driver.findElement(By.id("usernamereg-year"));
		
		WebElement gender = driver.findElement(By.name("freeformGender"));
		
		WebElement terms = driver.findElement(By.linkText("Terms"));
				
		WebElement privacy = driver.findElement(By. partialLinkText("Privacy"));
		
		first.sendKeys("Jefferson");
		Thread.sleep(2000);
		
		last.sendKeys("Marshall");
		Thread.sleep(2000);
		
		yid.sendKeys("marshall20045");
		Thread.sleep(2000);
		
		pass.sendKeys("!123tthttH$");
		Thread.sleep(3000);
		
		Select countryDD = new Select (code);
		
		//countryDD.selectByVisibleText("Pakistan (+92)");
		
		countryDD.selectByValue("PK");
		
		Thread.sleep(2000);
		
		phone.sendKeys("3215382170");
		
		Thread.sleep(3000);
		
		Select monthdd = new Select (month);
		
		monthdd.selectByVisibleText("January");
		
		Thread.sleep(3000);
		
		day.sendKeys("28");
		
		Thread.sleep(3000);
		
		year.sendKeys("1974");
		
		Thread.sleep(3000);
		
		gender.sendKeys("Male");
		
		Thread.sleep(3000);
		
		
		boolean button = driver.findElement(By.id("reg-submit-button")).isEnabled();
		System.out.println(button);
		
		Thread.sleep(3000);
		
		
		
		terms.click();
		
		privacy.click();
		
		Thread.sleep(1000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
