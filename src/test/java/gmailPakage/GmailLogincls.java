package gmailPakage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.print.DocFlavor.URL;

import org.apache.logging.log4j.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class GmailLogincls{

	WebDriver driver=null;
	String BaseURL="https://www.google.com";
	//Logger logger= LogManager.getLogger(GmailLogincls.class);
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;	

	@BeforeSuite
	public void beforeMethod() 
	{
		// start reporters
		htmlReporter = new ExtentHtmlReporter("extent.html");
		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\TUAutomation\\drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(BaseURL);
		driver.manage().window().maximize();

	}

	@Test(priority=1)
	public void GmailLoginMethod() throws InterruptedException, IOException, AWTException 
	{


		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test1 = extent.createTest("Gmail Login Test Case", "Sample description");

		// log(Status, details)
		test1.log(Status.INFO, "Starting Test Case");

		// log with snapshot
		test1.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("Images\\ss24.png").build());
		// test with snapshot
		// test1.addScreenCaptureFromPath("Images\\ss24.png");


		WebElement gmailbutton= driver.findElement(By.cssSelector("#gbw > div > div > div.gb_be.gb_g.gb_Ag.gb_rg > div:nth-child(1) > a"));
		gmailbutton.click();
		//logger.info("Clicked on Gmail button");	
		test1.pass("Clicked on Gmail button");
		Thread.sleep(2000);		
		//logger.info("Wait Two Seconds");

		WebElement signinbutton=driver.findElement(By.cssSelector("body > div.hercules-header.h-c-header.h-c-header--product-marketing-one-tier.header--desktop > div.h-c-header__bar > div.h-c-header__cta > ul.h-c-header__cta-list.header__nav--ltr > li:nth-child(2) > a"));
		signinbutton.click();
		
		//Switch one window to another window
		
		String currentTab = driver.getWindowHandle();
		 
		for (String tab : driver.getWindowHandles()) {
		 
		         if (!tab.equals(currentTab)) {
		 
		         driver.switchTo().window(tab);
		 
		         // Perform operation on new Tab
		         
		         }
		 
		      }
		
		//logger.info("Clicked on SignIn button");
		test1.pass("Clicked on SignIn button");

		Thread.sleep(2000);		

		WebElement username=driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		username.sendKeys("fiha0095@gmail.com");
		//logger.info("Enter Gmail User_Name : "+username.getAttribute("value"));
		test1.pass("Enter Gmail User_Name : "+username.getAttribute("value"));
		test1.pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath("Images\\Email_screen.png").build());

		Thread.sleep(2000);		

		WebElement nxtbtn=driver.findElement(By.cssSelector(".CwaK9"));
		nxtbtn.click();
		//logger.info("Clicked on NEXT button :"+nxtbtn.getText());
		test1.pass("Clicked on NEXT button :"+nxtbtn.getText());

		Thread.sleep(2000);		

		WebElement pass=driver.findElement(By.xpath("//input[@type='password'][@name='password']"));
		pass.sendKeys("pakistan@123");
		//logger.info("Enter Gmail Password :"+pass.getAttribute("value"));
		test1.pass("Enter Gmail Password :"+pass.getAttribute("value"));
		test1.pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath("Images\\Password_screen.png").build());

		Thread.sleep(2000);		

		WebElement sdndbtn=driver.findElement(By.xpath("//span[text()='Next']"));
		sdndbtn.click();
		//logger.info("Press Login button :"+sdndbtn.getText());
		test1.pass("Press Login button :"+sdndbtn.getText());

		Thread.sleep(2000);		


		WebElement composebtn=driver.findElement(By.className("z0"));
		composebtn.click();
		//logger.info("Press Compose email :"+composebtn.getText());
		test1.pass("Press Compose email :"+composebtn.getText());

		Thread.sleep(4000);		


		WebElement to=driver.findElement(By.className("vO"));
		to.sendKeys("fiha0095@gmail.com");
		//logger.info("Enter reciever email in TO field :"+to.getAttribute("value"));
		test1.pass("Enter reciever email in TO field :"+to.getAttribute("value"));

		Thread.sleep(4000);		

		WebElement subject=driver.findElement(By.className("aoT"));
		subject.sendKeys("This is auto subject  :P");
		//logger.info("Enter text in subject field :"+subject.getAttribute("value"));
		test1.pass("Enter text in subject field :"+subject.getAttribute("value"));

		Thread.sleep(2000);		

		WebElement body=driver.findElement(By.cssSelector(".Ar.Au div"));
		body.sendKeys("This is dummy text ..... Don't worry it is another one & You will get so may emails :P");
		//logger.info("Enter text in BODY field :"+body.getText());		
		test1.pass("Enter text in BODY field :"+body.getText());		

		Thread.sleep(6000);	

		/*//WebElement uploadfile=driver.findElement(By.xpath("//div[@id=':ac']"));
		//uploadfile.click();
		//uploadfile.sendKeys("C:\\Users\\Admin\\Pictures.png");
		
		
		
		  //click on attachment
        driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
        //use autoit tool to attach a file
        Runtime.getRuntime().exec("C:\\Users\\Admin\\amir.png");
		*/
		Thread.sleep(10000);	


		WebElement sendbtn=driver.findElement(By.cssSelector(".T-I.J-J5-Ji.aoO.T-I-atl.L3"));
		sendbtn.click();
		//logger.info("Press send button to send email");
		test1.pass("Press send button to send email");

		Thread.sleep(3000);		


		WebElement starred=driver.findElement(By.cssSelector(".aXw.T-KT"));
		starred.click();
		//logger.info("Press * to starred message");
		test1.pass("Press * to starred message");

		Thread.sleep(6000);		


		WebElement messgclick=driver.findElement(By.cssSelector(".zA.zE"));
		messgclick.click();
		//logger.info("Press current email message");
		test1.pass("Press current email message");

		Thread.sleep(6000);		


		//WebElement strdbtn=driver.findElement(By.cssSelector(".TO.nZ.aiq"));
		//strdbtn.click();



	}
	private void setClipboardData(String string) {
		// TODO Auto-generated method stub
		
	}

	@Test(priority=2)
	public void Gmail_logout() throws InterruptedException, IOException 
	{		

		// Gmail Logout
		ExtentTest test1 = extent.createTest("Gmail Logout Test Case");


		//WebElement logclik=driver.findElement(By.cssSelector(".gb_fb"));
		WebElement logclick=driver.findElement(By.cssSelector("#gb > div.gb_7d.gb_Ce.gb_fe > div.gb_Xc.gb_mb.gb_Wc > div > div.gb_ib.gb_vd.gb_3g.gb_R.gb_bg > div > a"));
		//#gb > div.gb_6d.gb_Ae.gb_ee > div.gb_Xc.gb_mb.gb_Wc > div > div.gb_ib.gb_ud.gb_mh.gb_R.gb_8f
		
		logclick.click();
		//logger.info("Press Logout icon button");
		test1.pass("Press Logout icon button");
		test1.pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath("Images\\Logout.png").build());


		Thread.sleep(2000);

		WebElement logout=driver.findElement(By.id("gb_71"));
		logout.click();
		//logger.info("Press Logout button");
		test1.pass("Press Logout button");

	}

	@AfterSuite
	public void afterMethod() 
	{		
		

		//driver.close();
		//driver.quit();
		extent.flush();


	}

}
