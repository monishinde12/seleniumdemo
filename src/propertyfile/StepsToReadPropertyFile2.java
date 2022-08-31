package propertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class StepsToReadPropertyFile2
{
	public static void main(String[] args) throws IOException
	{
		String fileLocation="D:\\Swati\\Java Programms\\SeleniumBasic\\src\\propertyfile\\testFile.properties";
		FileInputStream fis = new FileInputStream(fileLocation);
		
		Properties prop=new Properties();	
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("applicationUrl"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("expectedTitle"));
		
	}

}
