package day2.browsersetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilpkartBasicValidation
{


public static void main(String[]args)
{
	String currentWorkingDir=System.getProperty("user.dir");
	String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", chromeExePath);
			
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.FlipKart.com");
	
	//validate page title
	
	String pageTitle=driver.getTitle();
	String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	System.out.println("title validation:"+pageTitle.equals(expectedTitle));
	//validate current url
	
	String PageUrl = driver.getCurrentUrl();
	String expectedUrl=("https://www.flipkart.com");
	
	//get page source content length count
	int contentLength=driver.getPageSource().length();
	System.out.println("Content length:"+contentLength);
	//close the current browser instance
	driver.close();
	
}

}
