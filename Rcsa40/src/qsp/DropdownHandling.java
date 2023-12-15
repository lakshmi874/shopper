package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./sotwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("year"));
		Select s=new Select(ele);
		List<WebElement>opt=s.getOptions();
		TreeSet<String>t=new TreeSet<String>();
		//ArrayList<String>l=new ArrayList<String>();
		int count=opt.size();
		System.out.println(count);
		for(WebElement we:opt)
		{
			String text=we.getText();
			t.add(text);
		}
		if(t.contains("sep"))
		{
			System.out.println("OPTION IS PRESENT");
		}
		else
		{
			System.out.println("option is not present");
		}
	}
		
}


		//Collections.sort(l);
		//for(String l1:t)
		//{
		//	System.out.println(l1);
		//}
		//int count=opt.size();
		//System.out.println(count);
		
		
		




