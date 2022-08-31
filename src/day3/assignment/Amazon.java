package day3.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{
	public static void main(String[]args)
	{

		String currentWorkingDir=System.getProperty("user.dir");
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
				
		
		//ChromeDriver ref=new ChromeDriver();
		//creating an instance of chrome browser and up casting it to WebDriver interface
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		
		String pageTitle=driver.getTitle();
		
		System.out.println("Page title is:"+pageTitle);
		System.out.println("page title length:"+pageTitle.length());
		System.out.println("page title status:"+pageTitle.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
		
		String pageURL=driver.getCurrentUrl();
		
		System.out.println("page title is:"+pageURL);
		System.out.println("page title status:"+pageURL.equals("http://www.amazon.in"));
		
		String pageContent=driver.getPageSource();
		
		//System.out.println("page Source:"+pageContent);
		System.out.println("page Source length:"+pageContent.length());
		driver.close();
	}

}
