package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookwebelement 

{
  public static void main(String[] args) throws InterruptedException 
   {
	
	  System.setProperty("webdriver.chrome.driver",
			  "D:\\SELIUM\\chromdriver\\chromedriver.exe");
	  
	  System.out.println("set method of web browser");
	  
	  WebDriver driver=new ChromeDriver();
	  System.out.println("to calling the web browser");
	  
	  driver.manage().window().maximize();
	  System.out.println("to mazimize browser");
	
	  
	  driver.get("https://www.facebook.com/");
	
	  
//	  calling web element
	  
	  WebElement userName =driver.findElement(By.name("email"));
	  userName.sendKeys("vaibhavmech60@rediffmail.com");
	  
	  WebElement password =driver.findElement(By.name("pass"));
	  password.sendKeys("iloveyoushital");
	  
	  driver.findElement(By.name("login")).click();
	  
	  WebElement click1=driver.findElement(By.xpath("(//div[@aria-label='Account'])[1]"));
	  click1.click();
	  Thread.sleep(4000);
	  


	  
	 WebElement logout =driver.findElement(By.xpath("(//div//span)[43] "));
	 logout.click();
	  Thread.sleep(4000);

	  
          
	
	 
	  
//		 WebElement forgotpassword= driver.findElement(By.linkText(">Forgotten password?"));
//		 forgotpassword.click();
	  
	  
	  
}

	
	
}
