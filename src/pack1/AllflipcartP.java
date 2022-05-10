package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AllflipcartP
{

	public static void main(String[] args) throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELIUM\\chromdriver\\chromedriver.exe");
		
		System.out.println("set the property of chrome driver");
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("to call chrome");
		
		driver.manage().window().maximize();	
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement username=driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]"));

		username.sendKeys("7385275777");

		WebElement password =driver.findElement(By.xpath("//input[@type='password'] "));


		password.sendKeys("9766133244");




		WebElement login =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));

		login.click();
		WebElement 	mob =driver.findElement(By.xpath("//img[@alt='Mobiles']"));
		
		Thread.sleep(6000);

	Actions act=new Actions(driver);
	act.moveToElement(mob).click().perform();

		
		System.out.println("end of program");
		

		
		
		
		
	
		
	}
}
