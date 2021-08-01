package learningSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebActionOne {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\Agiletech\\automation\\library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://msn.com");
		
		Thread.sleep(3000);
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		//String source = driver.getPageSource();
		
		//System.out.println(source);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}
