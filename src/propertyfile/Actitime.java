package propertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Actitime
{
	public static void main(String[] args) throws IOException
	{
		String fileLocation="D:\\Swati\\Java Programms\\SeleniumBasic\\src\\propertyfile\\testFile.properties";
		String currentWorkingDir=System.getProperty("user.dir");
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
				
		FileInputStream fis = new FileInputStream(fileLocation);
		
		Properties prop=new Properties();	
		
		prop.load(fis);
		System.out.println(prop.getProperty("driverKey"));
		System.out.println(prop.getProperty("appUrl"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("loginPageTitle"));
		System.out.println(prop.getProperty("buttenName"));


	}

}
