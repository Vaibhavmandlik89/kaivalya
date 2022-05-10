package pack1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;



public class myStudy 
{
	public static void main(String[] args) 
	{
		

		System.setProperty("webdriver.chrome.driver",
				"D:\\SELIUM\\chromdriver\\chromedriver.exe");
		System.out.println("set the poperty of browser");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
//		Dimension d=new Dimension(300,500);
//		driver.manage().window().setSize(d);
		Point p=new Point(300,500);
		driver.manage().window().setPosition(p);
		
				

	
		
		


		
		
	}

}
