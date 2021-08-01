package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumLearningClass {

	public static void main(String[] args) throws InterruptedException {
		
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\Agiletech\\automation\\library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.yahoo.com");
		
		driver.navigate().to("https://yahoo.com");
		
		String murl = driver.getCurrentUrl();
		String mtitle = driver.getTitle();
		
		System.out.println(murl);
		System.out.println(mtitle);
		
		
		Thread.sleep(3000);

		driver.findElement(By.linkText("COVID-19")).click();
		
		String covidUrl = driver.getCurrentUrl();
		
		System.out.println(covidUrl);
		
		String covidTitle = driver.getTitle();
		
		System.out.println(covidTitle);
		
		Thread.sleep(3000);
		
		//going back to the page
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		//String title = driver.getTitle();
		
		//System.out.println(title);
		
		//driver.close();
		
		driver.quit();
		
		
		
		
		

	}

}
