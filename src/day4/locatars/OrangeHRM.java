package day4.locatars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM 
{
	  public static void main(String[]args)
	{
		String currentWorkingDir=System.getProperty("user.dir");
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		/*Identify user name field*/		
		WebElement userNameinputField=driver.findElement(By.id("username"));
		/*perform required operation in the username field*/
		
		userNameinputField.sendKeys("Admain");
		/*Identify password field*/
		WebElement passwordInputField = driver.findElement(By.name("password"));
		//passwordInputField.clear();
		passwordInputField.sendKeys("admin123");
		
		/*Identify login in button*/
		WebElement loginInButten = driver.findElement(By.className("logInnbButten"));
		
		loginInButten .click();
		driver.close();
	
		 
		 
		
	}

}
