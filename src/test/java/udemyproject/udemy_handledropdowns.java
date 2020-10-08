package udemyproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class udemy_handledropdowns {
	WebDriver driver=null;
	//String BaseURL="https://www.spicejet.com/";
	String BaseURL ="http://sprint-107-topu.pantheonsite.io/student-info/careers-advice/all-best-internships-buenos-aires-right-now";
  @Test
  public void f() throws InterruptedException 
  {
	 /* 
	  WebElement drop=driver.findElement(By.id("divpaxinfo"));
	  drop.click();
	  Thread.sleep(2000);
	  
	 
	  int i=1;
	  while(i<5)
	  {
		  WebElement increase=driver.findElement(By.id("hrefIncAdt")); // click 4 times
		  increase.click();
		  i++;
	  }
	  WebElement drop1=driver.findElement(By.id("divpaxinfo"));
	  System.out.println("Before selecting : "+drop1.getText());
	  for(int i=1;i<5;i++)
	  {
		  WebElement increase=driver.findElement(By.id("hrefIncAdt")); // click 4 times
		  increase.click();
	  }
	  
	  increase.click();
	  increase.click();
	  increase.click();

	  WebElement button=driver.findElement(By.id("btnclosepaxoption"));
	  button.click();
	  
	  WebElement drop2=driver.findElement(By.id("divpaxinfo"));
	  System.out.println("After selecting : "+drop2.getText());

	 // Select ss =new Select(drop);
	  //ss.selectByValue("2");
*/	  
	  
	  
	// get the text of the body element
	  WebElement body = driver.findElement(By.xpath("//*[@id=\"block-system-main\"]/div/div/div/div[1]/div/div/div[9]/div/div/div/div"));
	  String bodyText = body.getText();

//	  // count occurrences of the string
	  int count = 0;

	  // search for the String within the text
	  while (bodyText.contains("and")){

      // when match is found, increment the count
	      count++;

	      // continue searching from where you left off
	      bodyText = bodyText.substring(bodyText.indexOf("and") + "and".length());
	  }
	  System.out.println(count);
	  
	  
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
