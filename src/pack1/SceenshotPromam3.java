package pack1;

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

public class SceenshotPromam3 
{
	public static  WebDriver driver;
	public static void screenshotMethod() throws IOException
	{
		Date date =new Date();
	DateFormat d=new SimpleDateFormat("MM-dd-yy &HH-mm-ss");
		String newDate =d.format(date);
		 //shreen short
		TakesScreenshot t=(TakesScreenshot)driver;
		File source=t.getScreenshotAs(OutputType.FILE);
		File Deset= new File("D:\\SELIUM\\image\\flipcart"+newDate+".jpg");
		
		FileHandler.copy(source, Deset);
		
		
		
		
	}
	
	
	public static void main(String[] args) throws IOException, InterruptedException
	
	{
	System.setProperty("webdriver.chrome.driver",
			"D:\\SELIUM\\chromdriver\\chromedriver.exe");
	
	System.out.println("set the property of chrome driver");
	
	 driver = new ChromeDriver();
	
	System.out.println("to call chrome");
	
	driver.manage().window().maximize();	
	driver.get("https://www.flipkart.com/");
	
	screenshotMethod();
	System.out.println("taken screenshot");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement username=driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]"));

	username.sendKeys("7385275777");

	WebElement password =driver.findElement(By.xpath("//input[@type='password'] "));


	password.sendKeys("9766133244");




	WebElement login =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));

	login.click();
	
	
	Thread.sleep(10000);


	
	screenshotMethod();
	
	
	
	
	
	
	
	
	
	}	

	
}
