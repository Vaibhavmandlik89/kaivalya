package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe 
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELIUM\\chromdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	// iframe element
		WebElement frameParent=driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(frameParent);
		
		// drop down
		WebElement DropDown=driver.findElement(By.xpath("//select[@id='animals']"));
		DropDown.click();
		// creating select class   v
		Select sec=new Select(DropDown);
		sec.selectByIndex(3);
		System.out.println("program end");
		
		
	    driver.switchTo().parentFrame();

	 	   WebElement homeButton = driver.findElement(By.xpath("(//a[@id='head'])[1]"));
	 	   homeButton.click();
	 	    
	 	   
	 	    
	 	   

	}

	
}
