package day1.openbrowsers;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenChromeBrowser 
{
	public static void main(String[] args) {
		/**
		 * Step1: set the path of required browser executable file using System.setProperty(key, value)
		 * Step2: create an instance of required browser class
		 */
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Swati\\Java Programms\\SeleniumBasic\\Executables\\chromedriver.exe");
		
		ChromeDriver ref=new ChromeDriver();
		//to enter the url on the open browser
		ref.get("https://www.google.com");
		//close the current browser
		ref.close();
}
	
}
