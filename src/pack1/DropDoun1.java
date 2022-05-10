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
import org.openqa.selenium.support.ui.Select;

public class DropDoun1 {
	
	public static WebDriver driver;
	public static void Screenshot() throws IOException
	{
		Date date=new Date();
		DateFormat d=new SimpleDateFormat("MM-dd-yy &HH-mm-ss");
		String newDate=d.format(date);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\SELIUM\\image\\facebook"+newDate+".jpg");
		FileHandler.copy(source, dest); 
	}
	
	

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELIUM\\chromdriver\\chromedriver.exe");
	        driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
	    driver.manage().window().maximize();
		
		Thread.sleep(5000);
		Screenshot();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		WebElement createAccount=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		createAccount.click();
		Thread.sleep(5000);
		Screenshot();
		
		
		
		
		WebElement Name=driver.findElement(By.xpath("//input[@name='firstname']"));
		
		Name.sendKeys("kaivalya");
		Thread.sleep(5000);
		Screenshot();
		Thread.sleep(5000);
		
		
		WebElement lastName=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		lastName.sendKeys("Mandlik");
		Thread.sleep(5000);
		Screenshot();
		Thread.sleep(5000);
		WebElement MobileNo =driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		MobileNo.sendKeys("9960856105");
		Thread.sleep(5000);
		Screenshot();
		Thread.sleep(5000);
		WebElement Password =driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		Password.sendKeys("7588537806");
		Thread.sleep(5000);
		Screenshot();
		Thread.sleep(5000);
		
		
		
//		drop down Day
		
		WebElement dropDownDay= driver.findElement(By.xpath("//Select[@aria-label='Day']"));
		dropDownDay.click();
		Screenshot();
		Select s=new Select(dropDownDay);
//		s.selectByIndex(28);
		s.selectByValue("15");
		Thread.sleep(5000);
		Screenshot();
		Thread.sleep(5000);
		
//		drop down month
		
		WebElement dropDownMonth= driver.findElement(By.xpath("//Select[@aria-label='Month']"));
		dropDownMonth.click();
	
		Screenshot();
		Select s1=new Select(dropDownMonth);
//		s1.selectByIndex(28);
		s1.selectByValue("7");
		
		Thread.sleep(5000);
		Screenshot();
		Screenshot();
		
//		drop down year
		WebElement dropDownyear= driver.findElement(By.xpath("//Select[@aria-label='Year']"));
		dropDownyear.click();
		Screenshot();
		Thread.sleep(5000);
		
		
		Select s2=new Select(dropDownyear);
//		s1.selectByIndex(28);
		//s2.selectByValue("3");
		s2.selectByVisibleText("1992");
		Thread.sleep(5000);
		Screenshot();
		Thread.sleep(5000);
		
		//gender
		
		
		
		WebElement Gender=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		Gender.click();
		Thread.sleep(5000);
		Screenshot();
		Thread.sleep(5000);
		
		
		//sign up
		
		WebElement SignUp=driver.findElement(By.xpath("//div[@class='_1lch']"));
		SignUp.click();
		Thread.sleep(5000);
		Screenshot();
		Thread.sleep(5000);
		
		
		
		
		System.out.println("user sucessfully resister");
		
		System.out.println("all screen short taken");
		
	
		
		
		
		
	
		
		
		
		
		
		

		
		
		

	
	}

}

	


