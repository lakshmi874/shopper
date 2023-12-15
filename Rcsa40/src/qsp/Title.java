package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Title {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./sotwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String title=driver.getTitle();
		
		if(title=="hello world")
			System.out.println(title);
		else
			System.out.println("------");
String title1=driver.getCurrentUrl();
		
		if(CurrentUrl=="https://www.youtube.com/")
			System.out.println(title);
		else
			System.out.println("------");
		
	}

}
