package day3.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook
{
public static void main (String[]args)
{
	String currentWorkingDir=System.getProperty("user.dir");
	String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", chromeExePath);
			
	
	//ChromeDriver ref=new ChromeDriver();
	//creating an instance of chrome browser and up casting it to WebDriver interface
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.Facebook.com");
	
	String pageTitle=driver.getTitle();
	String expectedTitle="Facebook – log in or sign up";
	
	System.out.println("Page title validation:"+pageTitle.equals(expectedTitle));
	System.out.println("Page title:"+pageTitle);
	
	driver.close();
}


}
