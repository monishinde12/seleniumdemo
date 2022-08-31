package propertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile
{


	

	public static void main(String[] args) throws IOException 
	{
		//Absolute path --> D:\Swati\Java Programms\SeleniumBasic\src\propertyfile\testFile.properties
				String filePath = System.getProperty("user.dir") + "propertyfile\\testFile.properties";
				FileInputStream fis= new FileInputStream(
					//"D:\\Swati\\Java Programms\\SeleniumBasic\\src\\propertyfile\\testFile.properties");
				//FileInputStream fis1 =new FileInputStream(filePath);
				// or relative path
				//FileInputStream fis2 = new FileInputStream(".propertyfile\\testFile.properties");

				// Create an instance of Properties class
				Properties prop = new Properties();

				// load property file using load() of properties class
				prop.load(fis2);
				
				//read data from property file using getProperty(string key)
				System.out.println("First Name: "+prop.getProperty("firstname"));
				System.out.println("Last Name: "+prop.getProperty("lastname"));
				System.out.println("Email ID: "+prop.getProperty("emailId"));
				System.out.println("Mobile: "+prop.getProperty("mobileNumber"));

			}

		}
	
