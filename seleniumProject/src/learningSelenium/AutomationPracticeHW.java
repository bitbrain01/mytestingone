package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPracticeHW {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\Agiletech\\automation\\library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
				
		driver.get("http://automationpractice.com/index.php");
		driver.manage().deleteAllCookies();

		WebElement signin = driver.findElement(By.linkText("Sign in"));	
		signin.click();
		Thread.sleep(1000);
		WebElement create = driver.findElement(By.name("email_create"));
		create.sendKeys("mail@email.com");
		
		WebElement ck = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]"));
		ck.click();
		
		WebElement mr = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
		
		mr.sendKeys("Abdul");
		
		//WebElement ln = driver.findElement(By.name("customer_lastname"));
		//ln.sendKeys("Khan");
		
		/*
		 * WebElement em = driver.findElement(By.name("email"));
		 * em.sendKeys("mail@email.com");
		 * 
		 * WebElement pw = driver.findElement(By.name("passwd"));
		 * pw.sendKeys("112233++");
		 * 
		 * //WebElement day = driver.findElement(By.name("email"));
		 */		
		
		
		
		
	
	
	}

}
