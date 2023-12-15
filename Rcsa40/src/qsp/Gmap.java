package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmap {

	public static void main(String[] args) {
		System.setProperty("webdriver.geckodrivere.driver","./sotwares/geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/maps/@12.9902767,77.6254321,14z?entry=ttu");
		
		
	}

}
