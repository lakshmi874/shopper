package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Insta {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./sotwares/geckodriver.exe");
		 WebDriver driver =new FirefoxDriver();
		 driver.get("https://www.instagram.com/");
		 
		 		
		 Thread.sleep(2000);
		 driver.findElement(By.xpath[//input[@type='text']")).sendKeys("mahalaxmi");;
		 driver.findElement(By.xpath[//input[@name='password']")).sendKeys("mahalaxmi12");
		 driver.findElement(By.xpath("//a[@role='link']")).click();
		 Thread.sleep(2000);
	}

}
