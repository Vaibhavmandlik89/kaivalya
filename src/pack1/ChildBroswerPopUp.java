package pack1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBroswerPopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\SELIUM\\chromdriver\\chromedriver.exe");
 		
 		WebDriver driver =  new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.get("https://vctcpune.com/");
 	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 	    //how to find the adress of main web page
 	   String MainAdress= driver.getWindowHandle();
 	   System.out.println(MainAdress);
 	   
 	  WebElement SeleniumButton=driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));

 	 SeleniumButton.click();
 	 
 	 // how to get adress of main page + child page
 	Set<String> allPageAddress =driver.getWindowHandles();
 	System.out.println(allPageAddress);
 	// here in set there is no index method hence we to do the upcasting or conver it into list

 	List<String> AllpageAress=new ArrayList<String>(driver.getWindowHandles());
 	System.out.println(AllpageAress);
 	
 	// move to child page
 	driver.switchTo().window( AllpageAress.get(1));
 	
 	// dothraction no child page
 	  WebElement countryTextBox =  driver.findElement(By.xpath("//input[@id='autocomplete']"));
 	  countryTextBox.sendKeys("India");

//back to the main page 	  
 	 driver.switchTo().window( AllpageAress.get(0));
 	 Thread.sleep(3000);
 	 
 	
 	 WebElement hometab=driver.findElement(By.xpath("(//a[text()='About us'])[1]"));

 	 hometab.click();
 	 System.out.println("done the click");
 	 
 	 
 	  
}
}
