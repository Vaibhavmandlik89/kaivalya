package ProjectSouceDemo;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Login1stSenario 

{
	public static 	WebDriver driver;
	public static void ScreenShots() throws IOException
	{
		Date date= new Date();
		DateFormat d=new SimpleDateFormat("MM-dd-yy &HH-mm-ss");
		String CurrentDate=d.format(date);
		
		 //shreen short
//		TakesScreenshot t=(TakesScreenshot)driver;
//		File source=t.getScreenshotAs(OutputType.FILE);
//		File Deset= new File("D:\\SELIUM\\image\\flipcart"+newDate+".jpg");
//		
//		FileHandler.copy(source, Deset);
		
		TakesScreenshot t=(TakesScreenshot)driver;
	File Source	=t.getScreenshotAs(OutputType.FILE);
	File Destination =new File("D:\\SELIUM\\soucedemo\\"+CurrentDate+".jpg");
	FileHandler.copy(Source, Destination);
		
		
	}
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\SELIUM\\chromdriver\\chromedriver.exe");
		System.out.println("set the property of crome driver");
       driver=new ChromeDriver();
		System.out.println("to open the browser");
		driver.manage().window().maximize();
		System.out.println("to mazimize the browser");
		
		driver.get("https://www.saucedemo.com/");

		//ScreenShots();
	System.out.println("screenshot of login page taken");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement username =driver.findElement(By.xpath("//input[@placeholder='Username']"));
	username.sendKeys("standard_user");
	System.out.println("putting the username");
	ScreenShots();
	System.out.println("taking the screenshot of user name pass ");
	// password
	

	WebElement password =driver.findElement(By.xpath("//input[@placeholder='Password']"));
	password.sendKeys("secret_sauce");
	System.out.println("putting the password");
//	ScreenShots();
	System.out.println("taking the screenshot of password pass ");
	
	//login
	
	WebElement login =driver.findElement(By.xpath("//input[@id='login-button']"));
	
	login.click();
	System.out.println("login is sucessful");
	//ScreenShots();
	System.out.println("screen is taken");
	
	String ExpectedTitle=("Swag Labs");
	
	String actualTitle =driver.getTitle();
	System.out.println(actualTitle);
	
	System.out.println("validating testcase");
	if(ExpectedTitle.equals(actualTitle))
	{
		System.out.println("test case is pass");
		
	}
	else
	{
		System.out.println("tast case is fail");
	}
	
	// logout
	WebElement logout=driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
	
		logout.click();
		Thread.sleep(5000);
		//ScreenShots();
	
		WebElement logoutbutton=driver.findElement(By.xpath("	//a[@id='logout_sidebar_link']"));
		
		logoutbutton.click();
		System.out.println("logout is sucessful");
		Thread.sleep(5000);
		//ScreenShots();
		
		String expectedurl=("https://www.saucedemo.com/");
	String CurrentUrl=driver.getCurrentUrl();
	System.out.println(CurrentUrl);
	System.out.println("url validation");
	if(expectedurl.equals(CurrentUrl))
	{
		System.out.println("test case is pass");
		
	}
	else
	{
		System.out.println("tast case is fail");
	}

	
	
	
		
		
	
		 
	} 

}
