package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class twi {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./sotwars/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com");
		

	}

}
