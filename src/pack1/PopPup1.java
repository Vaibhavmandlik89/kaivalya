package pack1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopPup1 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver",
			"D:\\SELIUM\\chromdriver\\chromedriver.exe");
	System.out.println("set the property of chrome driver");
	WebDriver driver=new ChromeDriver();
	System.out.println("open the chrome ");
	driver.manage().window().maximize();
	System.out.println("mazimize the browser");
	driver.get("https://demoqa.com/alerts");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//button[@id='alertButton']
	
	//WebElement click1=driver.findElement(By.xpath("//button[@id='alertButton']"));
	//click1.click();
		// now selenium focus on pop up window
	//Alert Alt =driver.switchTo().alert();
	//Alt.accept();
	
	// 2nd method
	WebElement click2 =driver.findElement(By.xpath("//button[@id='promtButton']"));
		click2.click();
		Alert Alt =driver.switchTo().alert();
		Thread.sleep(4000);
		Alt.sendKeys("vaibhav");
		Thread.sleep(4000);
		Alt.dismiss();
		
	}

	
	
}
