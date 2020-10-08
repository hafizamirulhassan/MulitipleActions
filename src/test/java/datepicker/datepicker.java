package datepicker;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class datepicker {
	static WebDriver driver;

	@Test
	public void f() throws InterruptedException 

	{
		//Wait
		WebDriverWait wait = new WebDriverWait(driver,20);

	    driver.get("https://www.flydubai.com/en/");

		//Go to Trivago.com
		//driver.navigate().to("https://www.trivago.com.tr/");


//		Thread.sleep(3000);
//
//		//Search a Hotel
//		driver.findElement(By.cssSelector(".input.horus__querytext")).clear();
//		Thread.sleep(5000);
//
//		driver.findElement(By.cssSelector(".input.horus__querytext")).sendKeys("Antalya");
//		Thread.sleep(5000);
//
//		//Click the First Results
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ssg-suggestions>li:nth-of-type(1)")));
//		Thread.sleep(5000);
//
//		driver.findElement(By.cssSelector(".ssg-suggestions>li:nth-of-type(1)")).click();
//
//		Thread.sleep(5000);
//
//		//Wait for Visibility of Hotels and Calender
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".item-order.itemlist.hotellist.clearfix>li:last-of-type")));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-horus.horus__btn-detail.horus__btn-detail--calendar.btn-horus--checkin")));
//
//		Thread.sleep(5000);
//
//		//Select Start Date (First wait Visibility then click the start date)
//		wait.until(ExpectedConditions.visibilityOfElementLocated
//				(By.cssSelector(".cal-day.cal-is-weekend.cal-is-selectable.cal-is-range.cal-is-range-start,.cal-day.cal-is-selectable.cal-is-range.cal-is-range-start")));
//		Thread.sleep(5000);
//
//		driver.findElement
//		(By.cssSelector(".cal-day.cal-is-weekend.cal-is-selectable.cal-is-range.cal-is-range-start,.cal-day.cal-is-selectable.cal-is-range.cal-is-range-start")).click();
//
//		Thread.sleep(5000);
//
//		//Select End Date (First wait Visibility then click the end date)
//		wait.until(ExpectedConditions.visibilityOfElementLocated
//				(By.cssSelector(".cal-day.cal-is-weekend.cal-is-selectable.cal-is-range.cal-is-range-end,.cal-day.cal-is-selectable.cal-is-range.cal-is-range-end")));
//		Thread.sleep(5000);
//
//		driver.findElement
//		(By.cssSelector(".cal-day.cal-is-weekend.cal-is-selectable.cal-is-range.cal-is-range-end,.cal-day.cal-is-selectable.cal-is-range.cal-is-range-end")).click();
//		Thread.sleep(5000);
//
//
//		//Select Room Type
//		wait.until(ExpectedConditions.visibilityOfElementLocated
//				(By.cssSelector(".df_container_roomtype_selector.df_dropdown>li:nth-of-type(2)>button")));
//		Thread.sleep(5000);
//
//		driver.findElement(By.cssSelector(".df_container_roomtype_selector.df_dropdown>li:nth-of-type(2)>button")).click();
//		Thread.sleep(5000);
//
//
//		//See the results with your eyes. :)
//		//From now on, you can do what you want.
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		driver.findElement(By.id("departureDate")).click();
		 
	    //Wait until departure table visible
	    wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.cssSelector(".pika-table")).get(0)));
	 
	    //Click departure day
	    driver.findElements(By.cssSelector
	            ("button[data-pika-year='2017'][data-pika-month='11'][data-pika-day='22']")).get(0).click();
	    //*****Departure day selection finished.
	 
	    //*****Return day selection started
	    //Click Return Date
	    driver.findElement(By.id("return-date")).click();
	 
	    //Wait until departure table visible
	    wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.cssSelector(".pika-table")).get(1)));
	 
	    //Click return day
	    driver.findElements(By.cssSelector
	            ("button[data-pika-year='2017'][data-pika-month='11'][data-pika-day='29']")).get(1).click();
	    //*****Return day selection finished.
	 
	    //Check the operation in 5 seconds
	    Thread.sleep(5000);
	}
	@BeforeMethod
	public void beforeMethod() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\testProject\\chromedriver.exe");
		// Create a new instance of the Firefox driver
		driver = new ChromeDriver();
		//driver.navigate().to("http://www.turkishairlines.com/tr-tr/");
		driver.manage().window().maximize();
	}


	@AfterMethod
	public void afterMethod() 
	{

	}

}
