package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fireFox 
{
	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.gecko.driver", 
				 "D:\\SELIUM\\firefoxdriver\\geckodriver.exe");
		 
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
	}

}
