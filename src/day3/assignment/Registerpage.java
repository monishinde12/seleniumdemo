package day3.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registerpage
{
	public static void main(String[]args)
	{
		String currentWorkingDir=System.getProperty("user.dir");
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
				
		
		//ChromeDriver ref=new ChromeDriver();
		//creating an instance of chrome browser and up casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		String pageTitle=driver.getTitle();
		System.out.println("Page title is:"+pageTitle);
		System.out.println("page title length:"+pageTitle.length());
		System.out.println("page title status:"+pageTitle.equals("Register"));
		
		String pageURL=driver.getCurrentUrl();
		
		System.out.println("page title is:"+pageURL);
		System.out.println("page title status:"+pageURL.equals("https://demo.automationtesting.in/Register.html"));
		String pageContent=driver.getPageSource();
		
		//System.out.println("page Source:"+pageContent);
		System.out.println("page Source length:"+pageContent.length());
		driver.close();
	}

}
