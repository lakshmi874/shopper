package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chromeFire {

	public static void main(String[] args) {
		
			String key1="webdriver.chrome.driver";
			String value1="./sotwares/chromedriver 1.exe";
			System.setProperty(key1, value1);
			ChromeDriver driver1=new ChromeDriver();
			String key="webdriver.gecko.driver";
			String value="./sotwares/geckodriver.exe";
			System.setProperty(key, value);
			FirefoxDriver driver=new FirefoxDriver();

	}

}
