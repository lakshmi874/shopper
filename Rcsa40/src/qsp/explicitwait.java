package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./sotwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.id("email")).sendKeys("mahalakshmihanchinal@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Facebook1991");
		driver.findElement(By.name("login")).click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedCurr.("(20+) Facebook"));
		System.out.println(driver.getCurrentUrl());
	}//

}
