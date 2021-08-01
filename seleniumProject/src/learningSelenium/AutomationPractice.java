package learningSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AutomationPractice {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\Agiletech\\automation\\library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
				
		driver.get("http://automationpractice.com/index.php?controller=authentication&amp;back=my-account");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		String murl = driver.getCurrentUrl();
		String mnttl = driver.getTitle();
		
		Thread.sleep(2000);
		
		WebElement special = driver.findElement(By.partialLinkText("Specials"));
					special.click();
		
		String specials = driver.getCurrentUrl();
		
		String spttl = driver.getTitle();
		System.out.println(murl);
		System.out.println(mnttl);
		System.out.println(specials);
		System.out.println(spttl);
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
				
		WebElement np = driver.findElement(By.linkText("New products"));
		np.click();
		
		String pdurl = driver.getCurrentUrl();
		String pdtitle = driver.getTitle();
		
		System.out.println(pdurl);
		System.out.println(pdtitle);
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		WebElement b = driver.findElement(By.linkText("Best sellers"));
		b.click();
		/*
		 * List <WebElement> allLinks = driver.findElements(By.tagName("a"));
		 * for(WebElement link:allLinks) {
		 * 
		 * System.out.println(link.getText() + "-" + link.getAttribute("href"));
		 * 
		 * 
		 * }
		 */
		String burl = driver.getCurrentUrl();
		String btitle = driver.getTitle();
		
		System.out.println(burl);
		System.out.println(btitle);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		WebElement os = driver.findElement(By.linkText("Our stores"));
		os.click();
		String Our = driver.getCurrentUrl();
		String Ourt = driver.getTitle();
		
		System.out.println(Our);
		System.out.println(Ourt);
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		WebElement CU = driver.findElement(By.linkText("Contact us"));
		CU.click();
		String cont = driver.getCurrentUrl();
		String contxt = driver.getTitle();
		
		System.out.println(cont);
		System.out.println(contxt);
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		WebElement TC = driver.findElement(By.linkText("Terms and conditions of use"));
		TC.click();
		String tc = driver.getCurrentUrl();
		String tcxt = driver.getTitle();
		
		System.out.println(tc);
		System.out.println(tcxt);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		WebElement au = driver.findElement(By.linkText("About us"));
		au.click();
		
		String ab = driver.getCurrentUrl();
		String abxt = driver.getTitle();
		
		System.out.println(ab);
		System.out.println(abxt);
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(1000);
		
			
		WebElement SM = driver.findElement(By.linkText("Sitemap"));
		SM.click();
		String sm = driver.getCurrentUrl();
		String smxt =  driver.getTitle();
		
		System.out.println(sm);
		System.out.println(smxt);
		
		Thread.sleep(2000);
		driver.close();
		
			
		
	}
	

}
