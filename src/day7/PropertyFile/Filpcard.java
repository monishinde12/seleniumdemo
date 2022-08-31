package day7.PropertyFile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filpcard 
{
	public static void main(String[] args)
	{
		String currentworkingDir=System.getProperty("user.dir");
		String chromeExePath=currentworkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		// maximize browser window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> deviceName=driver.findElements(By.cssSelector("div>a"));
		List<WebElement> deviceprice=driver.findElements(By.cssSelector("div>div"));
		System.out.println("Device count: "+deviceName.size());
		for(int i=0;i<deviceName.size();i++) {
			System.out.println(deviceName.get(i).getText()+":"+deviceprice.get(i).getText());
		
	}

}
}
