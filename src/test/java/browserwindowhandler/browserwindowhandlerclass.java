package browserwindowhandler;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class browserwindowhandlerclass {
	WebDriver driver=null;
	String BaseURL= "http://www.popuptest.com/goodpopups.html";
	@Test
	public void BWH() throws InterruptedException 
	{

		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
		Thread.sleep(4000);
		
		Set<String> handler=driver.getWindowHandles();
		Thread.sleep(4000);

		Iterator<String> it=handler.iterator();
		Thread.sleep(4000);

		String parentwindowID=it.next();
		System.out.println("Parent window id : " +parentwindowID);
		Thread.sleep(4000);

		String childwidnowID=it.next();
		System.out.println("Child window id : "  +childwidnowID);
		
		Thread.sleep(4000);
		driver.switchTo().window(childwidnowID);
		System.out.println("Child window pop up title :" + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentwindowID);
		Thread.sleep(4000);
		System.out.println("Parent window pop up title :" + driver.getTitle());
		driver.close();

		
		
	}
	@BeforeMethod
	public void beforeMethod() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\TUAutomation\\drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(BaseURL);
		driver.manage().window().maximize();
	}


	@AfterMethod
	public void afterMethod() 
	{

	}

}
