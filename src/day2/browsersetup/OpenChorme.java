package day2.browsersetup;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChorme 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
				".\\Executables\\chromedriver.exe");
		
		ChromeDriver ref=new ChromeDriver();
		//to enter the url on the open browser
		
		ref.get("https://www.google.com");
		
		//close the current browser
		ref.close();
	}
	

}
