package pack1;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenp2 

{
	public static WebDriver driver;
public static void SceenshotMethod() throws IOException
{
	Date date =new Date();
	DateFormat d= new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
	String newDate=d.format(date);
	
	
	
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	 File Source = ts.getScreenshotAs(OutputType.FILE);
	 File dest=new File("D:\\SELIUM\\image\\login"+newDate+".jpg");
	 

	 FileHandler.copy(Source, dest);
	 
	 System.out.println("screen shot taken");
	 
	
}

public static void main(String[] args) throws IOException 
{
	System.setProperty("webdriver.chrome.driver", 
			"D:\\SELIUM\\chromdriver\\chromedriver.exe");
	System.out.println("set property of chrome driver");
	
	 driver=new ChromeDriver();
	System.out.println("call the chrome");
	driver.manage().window().maximize();
	System.out.println("mazi mize the browser");
	driver.get("https://www.saucedemo.com/");
	
	SceenshotMethod();
	WebElement UserName= driver.findElement(By.xpath("//input [@placeholder='Username']"));
	
	UserName.sendKeys("standard_user");
	WebElement Password=driver.findElement(By.xpath("//input [@placeholder='Password']"));
	
	Password.sendKeys("secret_sauce");
WebElement login= driver.findElement(By.xpath("//input [@type='submit']"));
login.click();
System.out.println("we r going to the home page");
SceenshotMethod();

	
	
	
}	
}
