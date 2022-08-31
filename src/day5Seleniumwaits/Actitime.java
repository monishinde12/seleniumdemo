package day5Seleniumwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String currentWorkingDri=System.getProperty("user.dir");
		String chromeExePath=currentWorkingDri+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromeExePath);
		WebDriver driver = new ChromeDriver();
		//implisite watie
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		//to get title from the application use getTitle() of WebDriver interface
				String pageTitle=driver.getTitle();
						
				System.out.println("Page title is: "+pageTitle);
				System.out.println("Page title length: "+pageTitle.length());
				String expectedTitle="actiTIME - Login";
				//validating login page
				System.out.println("Title validation status: "+pageTitle.equals(expectedTitle));
				
				//identify and perform required operation
				driver.findElement(By.id("username")).sendKeys("admin");
				//type password as manager
				driver.findElement(By.name("pwd")).sendKeys("manager");
				//click on login button
				driver.findElement(By.id("loginButton")).click();
				
				//explicit wait(static wait)
				Thread.sleep(2000);
					
				//verify home page
				String homePageTitle=driver.getTitle();
				System.out.println("Home page title: "+homePageTitle);
				System.out.println("Home page validation status: "+homePageTitle.equals("actiTIME - Enter Time-Track"));
				//click on logout link
				driver.findElement(By.id("logoutLink")).click();
				//verify login page
				System.out.println("Title validation status: "+pageTitle.equals(expectedTitle));
				//close the browser
				driver.close();
	}

}
