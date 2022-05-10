package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 
{

	
	public static void main(String []args)
	{
		
//		System.setProperty("webdriver.chrome.driver",
//				"D:\\SELIUM\\chromdriver\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		WebDriver driver1=new ChromeDriver();
//		WebDriver driver2=new ChromeDriver();
//		WebDriver driver3=new ChromeDriver();
		
//	
//		driver.get("https://www.google.com");
//		driver.get("https://www.google.com");
//		driver.get("https://www.google.com");
		
		
		
//		for firefox
		
		System.setProperty("webdriver.gecko.driver",
				"D:\\SELIUM\\firefoxdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		

		
		
	}
}
