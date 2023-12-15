package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sendkeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./sotwares/chromedriver 1.exe");
		 WebDriver driver =new ChromeDriver();
				 
		 driver.get("file:///C:/Users/91996/Desktop/selenium.html");
		 Thread.sleep(2000);
		 //driver.findElement(By.tagName("input")).sendKeys("Hi");
		 //driver.findElement(By.name("n1")).sendKeys("Hello dear");
		 //driver.findElement(By.id("a1")).sendKeys("Hi");
		 //Thread.sleep(2000);

		 driver.findElement(By.tagName("input[type='text']")).clear();
		 
	}

}