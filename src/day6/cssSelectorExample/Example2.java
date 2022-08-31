package day6.cssSelectorExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 
{
	public static void main(String[] args)
	{
		String currentWorkingDir=System.getProperty("user.dir");
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		
		//maximize browser window
		driver.manage().window().maximize();
		//imaplicit wait 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//enter username and password
		//driver.findElement(By.id("username")).sendKeys("admain");
		//enter password
		// ((WebElement) driver.findElements(By.id("password"))).sendKeys("manager");
		//click sigin button
		 
		  ((WebElement) driver.findElements(By.cssSelector(".buttonBlue"))).click();
		  //click on widget butten
		  driver.findElement(By.cssSelector(".addButton.dropdown-toggle")).click();
		  
		  //select history
		 
		  driver.findElement(By.cssSelector("a[data-name='History']")).click();
		  
		  //click on funnel
		  
		  driver.findElement(By.cssSelector("a[data-name='GroupedBySalesStage']")).click();
		  
		  //click on open tickets
		  
		  driver.findElement(By.cssSelector("a[data-name='OpenTickets']")).click();
		  
		  //click on user profile
		  
		  driver.findElement(By.cssSelector(".userName")).click();
		 driver.findElement(By.cssSelector("#menubar_item_right_LBL_SIGN_OUT")).click();
		 driver.close();
		  


		  
	}
}
