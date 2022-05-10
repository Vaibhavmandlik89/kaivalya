package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program5 
{
   public static void main (String[]args) {
	   
	  System.setProperty("webdriver.chrome.driver", 
			  "D:\\SELIUM\\chromdriver\\chromedriver.exe");
	  
	  System.out.println("to set the property of browser");
	  
	  WebDriver driver =new ChromeDriver();
	  
	  System.out.println("to call the chrome browser");
	  
	  driver.manage().window().maximize();
	  System.out.println("to mazimize browser");
	  
	  driver.get("https://www.facebook.com/");
	  
	  System.out.println(" open the facebook");
	  
	  
//	  perfoming the action on web elelment by xpath
	  
	// input [@id='email']
	  
//	  WebElement Username =driver.findElement(By.xpath("//input[@id='email']"));
//	  Username.sendKeys("vaibhavmech60@rediffmail.com");
//	  System.out.println("username sucessfully enter");
//	  
//	 WebElement password = driver.findElement(By.xpath("// input[@id='pass']"));
//	 password.sendKeys("iloveyoushital");
//	 System.out.println("password sucessffully enter");
//	 
	 
//	WebElement login=driver.findElement(By.xpath("//button [@ name='login']"));
//	login.click();
//	System.out.println("login sucessfully done");
//	  
	 
	 //with help of text
	 
	WebElement forgot =driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	 
forgot.click();
	
	
	 
	 
	  
	  
	  
	  

   }
}
