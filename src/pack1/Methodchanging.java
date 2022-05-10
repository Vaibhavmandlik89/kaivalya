package pack1;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methodchanging 
{
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver",
			"D:\\SELIUM\\chromdriver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	Thread.sleep(5000);
	
	driver.get("https://www.facebook.com");

	Thread.sleep(5000);
	
//	Method chaning concept
	
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
//	 Options O =driver.manage();
//	Window w =O.window();
//	w.maximize();
	
	
//	2nd 
//	driver.navigate().forward();
	
//	Navigation P=driver.navigate();
//	P.back();
//	
//	Navigation N=driver.navigate();
//	N.forward();
	
//	to set the size
	
//	Dimension d=new Dimension(300,200);//dimension constructor
//	driver.manage().window().setSize(d);
	
//	to set the position 
	
	Point p =new Point(200,500);
	driver.manage().window().setPosition(p);
	
	
	
	
	

	
	
	
	
	
}
	
}
