package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program6 
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
	
	driver.get("https://www.flipkart.com/");
	
System.out.println("to open website");
//xpath by contains=atribute 

WebElement username=driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]"));

username.sendKeys("7385275777");

WebElement password =driver.findElement(By.xpath("//input[@type='password'] "));


password.sendKeys("9766133244");

Thread.sleep(5000);



WebElement login =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));

login.click();


	
//input[contains(@class,'_2IX_2- VJZDxU')]
		
		
		
		
	}
	
}
