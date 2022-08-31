package day1.openbrowsers;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser 
{
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"D:\\Swati\\Java Programms\\SeleniumBasic\\Executables\\geckodriver.exe");
		FirefoxDriver ref = new FirefoxDriver();
		
		ref.get("https://www.google.com");
		ref.close();
	}
}
