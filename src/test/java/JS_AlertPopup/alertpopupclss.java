package JS_AlertPopup;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class alertpopupclss {
	WebDriver driver=null;
	String BaseURL="https://mail.rediff.com/cgi-bin/login.cgi";

  @Test
  public void AlertPopup() throws InterruptedException 
  {
	  Thread.sleep(4000);
	  driver.findElement(By.name("proceed")).click();
	  
	  Thread.sleep(4000);
	  Alert alert=driver.switchTo().alert();
	  System.out.println(alert.getText());
	  
	  String text=alert.getText();
	  if(text.equals("Please enter a valid user name"))
	  {
		  System.out.println("Correct alert message");
	  }
	  else
	  {
		  System.out.println("Incorrect alert message");
	  }
	  alert.accept();
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
	  driver.quit();
  }

}
