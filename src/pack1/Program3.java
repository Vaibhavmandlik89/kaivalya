package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 
{

	public static void main (String[]args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\SELIUM\\chromdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//		1 get
//		driver.get("https://www.mahadiscom.in");
		
//		2 navigate
		driver.navigate().to("https://www.google.co.in");
		
////		3 backword
//		driver.navigate().back();
//		
////		3 forword
//	driver.navigate().forward();
//	
////	4 refresh
//	driver.navigate().refresh();
//	
////	5 maximize
//	driver.manage().window().maximize();
//	
//	 6 close
//	driver.close();
	
//	7 quit
//	driver.quit();
		
//		current url
		 String Url=driver.getCurrentUrl();
		 System.out.println(Url);
		 
//		 tille
		 String Title=driver.getTitle();
		 System.out.println(Title);
	

	
		

	}
}
