package day2.browsersetup;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox2 
{
public static void main(String[]args)
{
	String currentWorkingDir=System.getProperty("user.dir");
	String FirefoxExePath=currentWorkingDir+"\\Executables\\geckodriver.exe";
	System.setProperty("webdriver.gecko.driver",FirefoxExePath);
	
	FirefoxDriver ref = new FirefoxDriver();
	ref.get("https://www.google.com");
	ref.close();	
}

}
