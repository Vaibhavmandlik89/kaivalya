
package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in/");
		
		WebElement arow=driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));
		arow.click();
		
		
//		WebElement sign =driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
//		sign.click();
		
//		
//		
	WebElement userName=driver.findElement(By.xpath("//input[@type='email']"));
	userName.sendKeys("7588537806");
	
	WebElement conti =driver.findElement(By.xpath("//input [@id='continue']"));
	conti.click();
		
		WebElement pass=driver.findElement(By.xpath("//input [@id='ap_password']"));
	pass.sendKeys("9766133244");
	
	WebElement sign=driver.findElement(By.xpath("//input [@id='signInSubmit']"));
	sign.click();
//	WebElement glosari=driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[2]"));
//	
//	glosari.click();
	
	//a[@data-csa-c-content-id='nav_cs_pc']
WebElement com =driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_pc'] "));
	
	com.click();
	
	
	
	WebElement lap =driver.findElement(By.xpath("(//span[@class='nav-a-content'])[3] "));
	
    lap.click();
    
  //div[@data-asin='B08WRZMD2D']
WebElement watch =driver.findElement(By.xpath("  //div[@data-asin='B08WRZMD2D'] "));
	
    watch.click();
    Thread.sleep(5000);
   
   //at to cart\

    WebElement addcart =driver.findElement(By.xpath("(//input[@class='a-button-input'])[6]"));
     addcart.click();

   System.out.println("end of program");
    
    
    		
    
	
	

	
	//WebElement dairy=driver.findElement(By.xpath("  (//a[@class='a-color-base a-link-normal'])[15]"));
     //dairy.click();
		

		
		
		
		
		
		
		
		
	}
}
