package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\SELIUM\\upadated chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://www.google.com");
	
		driver.navigate().to("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement dropDown =driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		dropDown.click();
		//drop down
		Select sec =new Select(dropDown);
	
		sec.selectByIndex(1);
		//sec.selectByValue("option2");
	//	sec.selectByVisibleText("Option3");
		//Thread.sleep(3000);
		System.out.println("pgm end");
		
		List<WebElement> opt=sec.getOptions();
		for(int i=0;i<opt.size();i++)
		{
			String Alldata =opt.get(i).getText();
			System.out.println(Alldata);
		}
		
		
		
		
	}

	
	
}
