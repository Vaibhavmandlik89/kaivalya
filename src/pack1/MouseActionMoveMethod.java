package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionMoveMethod
{

	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\SELIUM\\chromdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		  driver.manage().window().maximize();
		  System.out.println("to mazimize browser");
		  
		  driver.get("https://vctcpune.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			
			
		  
//		  calling web element
			WebElement startselinium=driver.findElement(By.xpath("//a[@class='et_pb_button et_pb_button_0 et_pb_bg_layout_light']"));
			Actions act=new Actions(driver);
		act.moveToElement(startselinium).click().perform();
}
}
