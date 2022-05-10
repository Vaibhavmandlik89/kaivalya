package pack1;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsP 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\SELIUM\\chromdriver\\chromedriver.exe");
		System.out.println("set the property of crome driver");
       WebDriver driver=new ChromeDriver();
		System.out.println("to open the browser");
		driver.manage().window().maximize();
		System.out.println("to mazimize the browser");
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement username =driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("standard_user");
		System.out.println("putting the username");

		System.out.println("taking the screenshot of user name pass ");
		// password
		

		WebElement password =driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("secret_sauce");
		System.out.println("putting the password");

		System.out.println("taking the screenshot of password pass ");
		
		//login
		
		WebElement login =driver.findElement(By.xpath("//input[@id='login-button']"));
		
		login.click();


 		//find Elements --> multiple elements--> 6 elements
	//	Addtocart
		
		List<WebElement>Allcart=driver.findElements(By.xpath("//button[text()='Add to cart']"));
		
//		System.out.println(Allcart);
//		Allcart.get(0).click(); 
		
		
	for(int i=0;i<6;i++)
		{			Allcart.get(i).click();
			Thread.sleep(2000);
		}
	System.out.println(Allcart.size());
	
	
		

	}

}
