package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class parent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./sotwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/91996/Desktop/upload.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.name("upload file"));
		ele.sendKeys("C:\\Users\\91996\\Desktop\\upload.html");

	}

}
