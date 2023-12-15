package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./sotwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("lakshmi");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("lakshmi1456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung A6+");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		//driver.findElement(By.xpath("//img[@data-image-latency='s-product-image']")).click();
		//driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	}
}
	




