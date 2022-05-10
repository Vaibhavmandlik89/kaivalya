package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", 
			"D:\\SELIUM\\chromdriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement washintoncity=driver.findElement(By.xpath("//div[@id='box3']"));
	
	WebElement unitedstatecountry=driver.findElement(By.xpath("//div[@id='box103']"));
	
	Actions act =new Actions(driver);
	act.dragAndDrop(washintoncity, unitedstatecountry).perform();
}
	
}
