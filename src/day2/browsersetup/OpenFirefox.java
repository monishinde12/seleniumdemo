package day2.browsersetup;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenFirefox
{	

	public static void main(String[]args)
	{

		System.setProperty("webdriver.gecko.driver",
				".\\Executables\\geckodriver.exe");
		FirefoxDriver ref = new FirefoxDriver();
		
		ref.get("https://www.google.com");
		ref.close();	
	}
	

}
