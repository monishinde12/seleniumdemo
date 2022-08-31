package day3.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime
{
	public static void main(String[]args)
	{

		String currentWorkingDir=System.getProperty("user.dir");
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
				
		
		//ChromeDriver ref=new ChromeDriver();
		//creating an instance of chrome browser and up casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		
		String pageTitle=driver.getTitle();
		String pageUrl=driver.getCurrentUrl();
		String pageSource=driver.getPageSource();
		
		System.out.println("Page title is:"+pageTitle);
		System.out.println("Page title length:"+pageTitle.length());
		
		System.out.println("Page Urlis:"+pageUrl);
		String expectedUrl="https://demo.actitime.com";
		System.out.println("Url validation status:"+pageUrl.contains(expectedUrl));
		System.out.println("Page Source length:"+pageSource.length());
		driver.close();
		
		
		
	}

}
