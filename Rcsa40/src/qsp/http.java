package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class http {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./sotwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com.");
		Thread.sleep(2000);
		String src = driver.getPageSource();
		System.out.println(src);
		
		

	}

}
