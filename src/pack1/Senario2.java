package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Senario2 
{

//	validate the title 
	
	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\SELIUM\\chromdriver\\chromedriver.exe");
		
		System.out.println("1.to set the property of driver");
		
		WebDriver driver=new ChromeDriver();
		System.out.println("2.to call chrome");
		
		
	driver.get("https:www.mahadiscom.in");
	System.out.println("3.to open the url");
	
//	get current url
	
	String Actualurl  = driver.getCurrentUrl();
	
	System.out.println(Actualurl);
	
	
//	get title
	
	
	String ExpectedTitle=
			(":: Maharashtra State Electricity Distribution Company Limited :: – MahaVitaran");
	String ActualTitle =driver.getTitle();
	System.out.println(ActualTitle);
	
	System.out.println("validate the title ");
	
	if(ExpectedTitle.equals(ActualTitle))
	{
		System.out.println("test case is pass");
	}
	else
	{
		System.out.println("test case is fail");
	}
	
	
	
//	
	
	

	
	
	

	
	
		
		
	}
	
	
}
