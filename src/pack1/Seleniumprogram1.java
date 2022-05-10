package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumprogram1 
{
 public static void main(String[] args)
 {
	
	 
  System.setProperty("webdriver.chrome.driver",
			 "D:\\SELIUM\\chromdriver\\chromedriver.exe");
	 
	 
 WebDriver  driver =  new ChromeDriver();

		driver.get("https://www.gmail.com/");

}
}
