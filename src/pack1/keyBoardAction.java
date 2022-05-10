package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyBoardAction 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELIUM\\chromdriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
	
		
		Actions act=new Actions(driver);
		
		WebElement user=driver.findElement(By.xpath("//input[@id='userName']"));
            user.sendKeys("vbm");
	
	
	act.sendKeys(Keys.TAB);
	act.perform();
	act.sendKeys("vaibhavmech60@gmail.com");
	act.perform();
	act.sendKeys(Keys.TAB);
	act.perform();
	act.sendKeys("gurudattniwas");
	act.perform();
	
	act.keyDown(Keys.CONTROL);
	act.sendKeys("a");
	act.keyUp(Keys.CONTROL);
	act.perform();
	
	act.keyDown(Keys.CONTROL);
	act.sendKeys("c");
	act.keyUp(Keys.CONTROL);
	act.perform();
	
	act.sendKeys(Keys.TAB);
	act.perform();
	
	act.keyDown(Keys.CONTROL);
	act.sendKeys("v");
	act.keyUp(Keys.CONTROL);
	act.perform();
	
	act.sendKeys(Keys.TAB);
	act.perform();
	 Thread.sleep(3000);
	
	act.click();
	act.perform();
	
	 Thread.sleep(3000);
	
	
	System.out.println("end the program");
	
	
	
	
	
	
	
	
	
	}

}
