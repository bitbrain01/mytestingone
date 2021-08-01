package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	
	WebDriver driver;
	
	public homePage(WebDriver x) {
		
	driver = x;	
	}

	public WebElement getSignInButton() {
		WebElement x = driver.findElement(By.linkText("Sign in"));
		return x;		
		
	}
	
	public WebElement getContactUs() {
		WebElement a = driver.findElement(By.linkText("Contact us"));
		return a;		
		
	}
	
	public WebElement getSearchBox() {
		WebElement b = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
		return b;
	}
	
	public WebElement getSearchBoxbutton() {
		WebElement c = driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button"));
		return c;
	}
	
	
}
