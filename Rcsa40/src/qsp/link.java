package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class link {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./sotwares/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		
		driver.get("C:\\Users\\91996\\Desktop\\link.html");
		Thread.sleep(2000);
		//WebElement ele = driver.findElement(By.tagName("a"));
		//ele.click();
		//WebElement ele = driver.findElement(By.id("a1"));
		//ele.click();
		WebElement ele = driver.findElement(By.className("c1"));
		ele.click();
		 
	}

}
