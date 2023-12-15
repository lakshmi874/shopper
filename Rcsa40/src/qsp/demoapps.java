package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class demoapps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./sotwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
		Thread.sleep(2000);
		WebElement ele= driver.findElements(By.id("opt0"));
		Select s=new Select(ele);
		s.selectByIndex(0);
		List<WebElement>opt=s.getOptions();
		ArrayList<String>l=new ArrayList<String>();
		//int count=opt.size();

		for(WebElement we:opt)
		{
					String text=we.getText();
					l.add(text);
		}
		Collections.sort(l);	
		for(String l1:l)
		{
			System.out.println(l1);
		}
			
		//{
		//	System.out.println(l1);
		//}
	}

}
