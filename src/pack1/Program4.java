package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 
{

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\SELIUM\\chromdriver\\chromedriver.exe");
		System.out.println("set the property of chrome driver");
		WebDriver driver=new ChromeDriver();
		System.out.println("open the Browser");
		driver.get("https://www.saucedemo.com/");
		System.out.println("open url");
		
//		Webelement
//		username
		//WebElement userName =driver.findElement(By.id("user-name"));
		WebElement userName=driver.findElement(By.tagName("input"));
		
		userName.sendKeys("standard_user");
		
		
//		password
	WebElement password	=driver.findElement(By.id("password"));
	
	password.sendKeys("secret_sauce");
	
	
	
//		login
	
		WebElement LoginButton=driver.findElement(By.id("login-button"));
	
		
		LoginButton.click();
		
		
		String expectedHomePageUrl = "https://www.saucedemo.com/inventory.html";
		
		String actualHomePageUrl = driver.getCurrentUrl();
	    
		if(expectedHomePageUrl.equals(actualHomePageUrl))
		{
			System.out.println("login test passed-we have successfully login on sauce demo website");
		}
		else
		{
			System.out.println("Login test failed");
		}
		

		
		
		
		
		
	}
}
