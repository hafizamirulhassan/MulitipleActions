package Handlefilepopup;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Filepopup {
	WebDriver driver=null;
	String BaseURL="https://html.com/input-type-file/";
  @Test
  public void HandleFilePopup() 
  {
	  driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\Admin\\Desktop\\Application-PDF.pdf");
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
