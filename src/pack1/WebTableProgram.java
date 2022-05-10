package pack1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableProgram
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\SELIUM\\chromdriver\\chromedriver.exe");
 		WebDriver driver =  new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.get("https://vctcpune.com/selenium/practice.html");
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 		// column
 		List<WebElement> Column=driver.findElements(By.xpath("//table//tbody//tr//th"));
 		System.out.println(Column.size());
 	
 		System.out.println(Column);
 		for(int i=0;i<Column.size();i++)
 		{
 			System.out.println(Column.get(i).getText());
 		
 		}
 		
 		 //table data-cells wise
 		List<WebElement> Celldata=driver.findElements(By.xpath("//table//tbody//tr//td"));
 		System.out.println(Celldata.size());
 		for(int i = 0; i<Celldata.size(); i++)
 	 	{
 	 		System.out.println(Celldata.get(i).getText());
 	 	}


}
}
