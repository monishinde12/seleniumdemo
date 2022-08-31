package day1.openbrowsers;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIEBrowser 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.ie.driver",
				"D:\\Swati\\Java Programms\\SeleniumBasic\\Executables\\IEDriverServer.exe");
		InternetExplorerDriver ref = new InternetExplorerDriver();
		ref.get("https://WWW.google.com");
		ref.close();
	}

}
