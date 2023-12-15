package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class qspiderdemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./sotwares/geckodriver.exe");
		 WebDriver driver =new FirefoxDriver();
		 driver.get("https://demoapps.qspiders.com/");
		 
		 driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Ananad");
		 driver.findElement(By.cssSelector("input[id='email']")).sendKeys("ananad1234");
		 driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Ananad1234@gmail.com");
		 driver.findElement(By.cssSelector("button[type='submit']")).click(); 

	}

}
