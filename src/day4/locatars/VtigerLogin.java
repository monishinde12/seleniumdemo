package day4.locatars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerLogin 
{
public static void main(String[]args)
{
	String currentWorkingDir=System.getProperty("user.dir");
	String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", chromeExePath);
			
	
	//ChromeDriver ref=new ChromeDriver();
	//creating an instance of chrome browser and up casting it to WebDriver interface
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	
	// Identify user name field*/
	
	WebElement username=driver.findElement(By.id("username"));
	
	//perfrom require operation user name field */
	
	username.clear();
	username.sendKeys("admin");
	
	/*Identify password field*/
	WebElement passward=driver.findElement(By.name("password"));
	passward.clear();
	passward.sendKeys("maneger");
	/*identify signin buteen*/
	WebElement signInButten=driver.findElement(By.className("buttonBlue"));
	signInButten.click();
	driver.close();
	
	

	
	
}

}
