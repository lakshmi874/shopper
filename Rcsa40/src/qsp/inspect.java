package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class inspect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./sotwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("C:\\Users\\91996\\Desktop\\partial.html");
		//Thread.sleep(2000);
		//driver.findElement(By.id("email")).sendKeys("jhanavi");
		//Thread.sleep(2000);
		//driver.findElement(By.id("pass")).sendKeys("Jhanavi@q");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("google24")).click();
	}

}
