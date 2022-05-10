package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAuto 
{
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELIUM\\chromdriver\\chromedriver.exe");
		System.out.println("set property of chrome browser");
		
		WebDriver driver=new ChromeDriver();
		
		System.out.println("call the chrome browser");
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions Act=new Actions(driver);
		
		WebElement singleClick=driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		
		Act.click(singleClick).perform();
		System.out.println("single click perform");
		
		//button[@id='doubleClickBtn']
		
		//double click
		WebElement Doubleclick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
	Act.doubleClick(Doubleclick).perform();
	System.out.println("double click perform");
	
	
	//button[@id='rightClickBtn']
	//right click
	WebElement RightClick=driver.findElement(By.xpath("(//div//button)[3]"));
	
	Act.contextClick(RightClick).perform();
	
	System.out.println("right click perform");
	
		
	}

}
