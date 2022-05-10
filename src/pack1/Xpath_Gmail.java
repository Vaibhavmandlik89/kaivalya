package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Gmail 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", 	
				"D:\\SELIUM\\chromdriver\\chromedriver.exe");
		System.out.println("set the poperty of browser");
		WebDriver driver =new ChromeDriver();
		
		System.out.println("to open the browser");
		driver.manage().window().maximize();
		System.out.println("to mazimise the browser");
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


		
	WebElement username=driver.findElement(By.xpath("//input[@name='txtUsername']"));
		username.sendKeys("Admin");
		

		
	

	WebElement password =driver.findElement(By.xpath("//input[@name='txtPassword']"));
		password.sendKeys("admin123");
		
		//login  button
		WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		
		
		
	
	}
	
}
