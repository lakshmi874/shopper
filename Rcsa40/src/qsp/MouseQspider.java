package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseQspider {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./sotwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/dragDrop");
		Thread.sleep(2000);
		WebElement Src=driver.findElement(By.className("draggable"));
		WebElement dst=driver.findElement(By.className("drop-column min-h-[200px] bg-slate-100"));
		Actions act=new Actions(driver);
		act.dragAndDrop(Src, dst).perform();
	

}
}


	


