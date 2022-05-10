package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe2
{

	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\SELIUM\\chromdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//iframe element
				WebElement Parentframe=	driver.findElement(By.xpath("//iframe[@id='frame1']"));
			driver.switchTo().frame(Parentframe);
			Thread.sleep(3000);
		 WebElement OperationOnParent=driver.findElement(By.xpath("//input"));
		 
		 OperationOnParent.sendKeys("vaibhav");
}
	
}
