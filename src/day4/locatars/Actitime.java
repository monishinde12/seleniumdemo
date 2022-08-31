package day4.locatars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime
{

 public static void main(String []args)
	{
		String currentWorkingDir=System.getProperty("user.dir");
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		/*Identify user name field*/		
		WebElement usernameInputField=driver.findElement(By.id("username"));
		/*perform required operation in the username field*/
	
		usernameInputField.sendKeys("admin");
		
		/*Identify password field*/
		WebElement passwordInputField = driver.findElement(By.name("pwd"));
		/*perform required operation in the password field*/
		//passwordInputField.clear();
		passwordInputField.sendKeys("manager");
		
		/*Identify login in button*/
		WebElement loginInButten = driver.findElement(By.id("loginButton"));
		/*perform required operation in the password field*/
		
		loginInButten.click();
		driver.close();
		 
	}

}
