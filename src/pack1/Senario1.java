package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Senario1  
{

	public static void main (String[]args)
	
	
//	to validate the url from browse
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELIUM\\chromdriver\\chromedriver.exe");
           System.out.println("1.Properties are set for chrome browser");
		
		WebDriver driver =new ChromeDriver();	
		
		System.out.println("2 to open the browser");
		
		driver.manage().window().maximize();
		System.out.println("3.to mazimize the browser");
		
		driver.get("https://www.mahadiscom.in");
		
		System.out.println("4.to open the Url");
		
		String ExpectedUrl="https://www.mahadiscom.in/";
		String ActualUrl=driver.getCurrentUrl();
		System.out.println(ActualUrl);
		
		System.out.println("5.validate url test case");
		
		if(ExpectedUrl.equals(ActualUrl))
		{
			
			System.out.println("test  case is passed");
		}
		else
		{
			System.out.println("test case is fail");
		}
		
		;
		
		
		
		
		
		
		
		
		
		
		
	
		
	}
	
	
}
