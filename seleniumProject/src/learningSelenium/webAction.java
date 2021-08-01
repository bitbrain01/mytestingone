package learningSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webAction {

	public static void main(String[] args) throws InterruptedException {
		
		//set up location for chromeDriver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\Agiletech\\automation\\library\\chromedriver.exe");
		
		//creating an object of the webdriver class
		//opening up the browser
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.get("https://www.twitter.com");
		
		//every driver is associated with a browser instance
		
		WebDriver driver1 = new ChromeDriver();
		
		Thread.sleep(1000);
		
		driver1.get("https://www.gearsjunction.com");
		
		String d1 = driver1.getTitle();
		String d1b = driver1.getCurrentUrl();
		
		System.out.println(d1b);
		System.out.println(d1);
		
		Thread.sleep(3000);
		
		WebDriver driver2 = new ChromeDriver();
		
		Thread.sleep(1000);
		
		driver2.get("https://www.elzeecrafts.com");
		String d2b = driver2.getCurrentUrl();
		
		System.out.println(d2b);
		String d2 = driver2.getTitle();
		System.out.println(d2);
		
		Thread.sleep(3000);
		
		driver.close();
		driver1.close();
		driver2.close();
			
		
	}

}
