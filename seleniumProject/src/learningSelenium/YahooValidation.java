package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YahooValidation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\Agiletech\\automation\\library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
				
		driver.get("https://login.yahoo.com/account/create?specId=yidReg");
		driver.manage().deleteAllCookies();
		
		WebElement fn = driver.findElement(By.id("usernamereg-firstName"));
		WebElement ln = driver.findElement(By.id("usernamereg-lastName"));
		WebElement em = driver.findElement(By.id("usernamereg-yid"));
		WebElement pw = driver.findElement(By.id("usernamereg-password"));
		WebElement code = driver.findElement(By.name("shortCountryCode"));
		WebElement phone = driver.findElement(By.id("usernamereg-phone"));
		WebElement month = driver.findElement(By.id("usernamereg-month"));
		WebElement day = driver.findElement(By.id("usernamereg-day"));
		WebElement year = driver.findElement(By.id("usernamereg-year"));
		WebElement gender = driver.findElement(By.name("freeformGender"));
		
		
		Thread.sleep(2000);
		boolean fn1 = driver.findElement(By.id("usernamereg-firstName")).isEnabled();
		System.out.println("first is enabled");
		System.out.println(fn1);
		fn.sendKeys("Abdul");
		Thread.sleep(2000);
		boolean bln = driver.findElement(By.id("usernamereg-lastName")).isEnabled();
		System.out.println("lastname is enabled");
		System.out.println(bln);
		ln.sendKeys("Khan");
		Thread.sleep(2000);
		boolean em1 = driver.findElement(By.id("usernamereg-yid")).isEnabled();
		System.out.println("email is enabled");
		System.out.println(em1);
		em.sendKeys("mail1234");
		Thread.sleep(2000);
		boolean pw1 = driver.findElement(By.id("usernamereg-password")).isEnabled();
		System.out.println("password is enabled");
		System.out.println(pw1);
		pw.sendKeys("123!4");
		Thread.sleep(2000);
		Select countrydd = new Select(code);
		countrydd.selectByValue("PK");
		Thread.sleep(2000);
		phone.sendKeys("524528854");
		Thread.sleep(2000);
		Select monthdd = new Select (month);
		monthdd.selectByValue("1");
		day.sendKeys("28");
		year.sendKeys("1974");
		Thread.sleep(2000);
		
		boolean gndr = driver.findElement(By.name("freeformGender")).isEnabled();
		System.out.println(gndr);
		System.out.println("gender is enabled");
		gender.sendKeys("Male");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.id("reg-submit-button"));
		boolean buton = driver.findElement(By.id("reg-submit-button")).isEnabled();
		System.out.println("submit button is enabled");
		System.out.println(buton);
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
