package day2.browsersetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToOpenChrome
{
public static void main(String[]args)
{
	String currentWorkingDir=System.getProperty("user.dir");
	String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", chromeExePath);
			
	
	//ChromeDriver ref=new ChromeDriver();
	//creating an instance of chrome browser and up casting it to WebDriver interface
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	
	//close the current browser
	
	driver.close();	
}

}
