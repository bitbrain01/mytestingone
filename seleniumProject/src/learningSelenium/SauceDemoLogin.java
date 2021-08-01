package learningSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\Agiletech\\automation\\library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
				
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		
		// login with invalid credentials		
		WebElement name0 = driver.findElement(By.name("user-name"));
		name0.sendKeys("standards_user");
		
		WebElement pass0 = driver.findElement(By.name("password"));
		pass0.sendKeys("asecret_sauce");
		
		WebElement login0 = driver.findElement(By.name("login-button"));
		login0.click();
		
		//WebElement a = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]"));
		//a.getText();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
				
		WebElement name = driver.findElement(By.name("user-name"));
		name.sendKeys("standard_user");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("secret_sauce");
		
		WebElement login = driver.findElement(By.name("login-button"));
		login.click();
		
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement item4 = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
		String itm4 = item4.getText();
		// System.out.println("this is item 4");
		System.out.println(itm4);
		item4.click();
		
		WebElement cart1 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
		cart1.click();
		
		Thread.sleep(2000);
		WebElement back = driver.findElement(By.xpath("//*[@id=\"back-to-products\"]"));
		back.click();
		Thread.sleep(1000);
		WebElement item2 = driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div"));
		item2.click();
		
		WebElement cart2 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]"));
		cart2.click();
		Thread.sleep(2000);
		WebElement back2 = driver.findElement(By.xpath("//*[@id=\"back-to-products\"]"));
		back2.click();
		Thread.sleep(2000);
		WebElement cart = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		cart.click();
		Thread.sleep(1000);
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement check = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
		
		check.click();
		Thread.sleep(2000);
		WebElement fn = driver.findElement(By.name("firstName"));
		fn.sendKeys("abdul");
		 
		WebElement ln = driver.findElement(By.name("lastName"));
		ln.sendKeys("khan");
		
		WebElement pc = driver.findElement(By.name("postalCode"));
		pc.sendKeys("20202");
		Thread.sleep(2000);
		WebElement cont = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
		cont.click(); 
		
		Thread.sleep(2000);
		WebElement fin = driver.findElement(By.xpath("//*[@id=\"finish\"]"));
		fin.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
	}

}
