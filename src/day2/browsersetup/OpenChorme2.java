package day2.browsersetup;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChorme2
{
	public static void main(String[]args)
	{
		String currentWorkingDir=System.getProperty("user.dir");
		System.out.println("Current working dir:"+currentWorkingDir);
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
				
		
		//ChromeDriver ref=new ChromeDriver();
		//creating an instance of chrome browser and up casting it to weddriver interface
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//close the current browser
		
		driver.close();	
	}
	

}
